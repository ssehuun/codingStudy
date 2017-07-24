// 2581 - prime number
#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int start;
    int end;
    int isPrime[10001];
    for (int i=0; i<=10000; i++) {
        isPrime[i] = 1;
    }
    
    while (cin >> start >> end && start == 1) {
      cout << "ok";
    }
    
    for (int i=start; i<=end; i++) {
        for (int j=2; j<=sqrt(i); j++) {
            if(i % j == 0){
                isPrime[i] = 0;
            }
        }
    }
    int min = 0;
    int sum = 0;
    for (int k=start; k<=end; k++) {
        if(isPrime[k] == 1){
            if(min == 0){
                min = k;
            }
            sum += k;
        }
    }
    cout << sum << endl << min << endl;
    
    return 0;
}
