// 1932 - numberTriangle
#include <iostream>
using namespace std;

int maxi(int a, int b){
    return a > b ? a : b;
}

int main(){
    int num;
    int arr[501][501] = {0};
    int dp[501][501] = {0};
    int max = 0;
        
    cin >> num;
    for (int i=1; i<=num; i++) {
        for (int j=1; j<=i; j++) {
            cin >> arr[i][j];
        }
    }
    
    for (int i=1; i<=num; i++) {
        for (int j=1; j<=i; j++) {
            if(j==1){
                dp[i][j] = dp[i-1][j]+dp[i][j];
            }else if(j==i){
                dp[i][j] = dp[i-1][j-1]+dp[i][j];
            }else{
                dp[i][j] = maxi(dp[i-1][j-1], dp[i-1][j]) + dp[i][j];
            }
            if(max < dp[i][j]){
                max = dp[i][j];
            }
            
        }
    }
    cout << max << endl;
    
    return 0;
}
