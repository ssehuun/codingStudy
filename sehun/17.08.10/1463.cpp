// 1463 - make one
#include <iostream>
#include <algorithm>
#define MIN(X,Y) ((X) < (Y) ? (X) : (Y))
using namespace std;


int func(int n){
    int dp[n];
    if(n==1) return 0;
    if(dp[n] > 0){
        return dp[n];
    }
    if(n%3 == 0){
        if(n%2 == 0){
            dp[n] = MIN(MIN(func(n/3), func(n/2)), func(n-1))+1;
        }else{
            dp[n] = MIN(func(n/3), func(n-1))+1;
        }
    }else if(n%2 == 0){
        if(n%3 == 0){
            dp[n] = MIN(MIN(func(n/3), func(n/2)), func(n-1))+1;
        }else{
            dp[n] = MIN(func(n/2), func(n-1))+1;
        }
    }else{
        dp[n] = func(n-1)+1;
    }
    return dp[n];
    
}
int main() {
    int N;
    cin >> N;
    
    cout << func(N);
    return 0;
}
