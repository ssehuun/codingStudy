// 1476 - date_calculate
#include <iostream>
using namespace std;

int main(){
    int E,S,M;
    int i=1;
    int j=1;
    int k=1;
    int year;
    cin >> E >> S >> M;
    
    for (year=1; year<=15*28*19; year++) {
        if(i==16){
            i=1;
        }
        if(j==29){
            j=1;
        }
        if(k==20){
            k=1;
        }
        if(i == E && j == S && k == M){
            cout << year << endl;
        }
        i++;
        j++;
        k++;
    }
    return 0;
}
