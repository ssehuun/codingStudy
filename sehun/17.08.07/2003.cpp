// 2003 - sum of numbers2
// arr[left]를 먼저 빼고 증가해야함
#include <iostream>
using namespace std;

int main(){
    int N, M;
    cin >> N >> M;
    int arr[N];
    
    for (int i=1; i<=N; i++) {
        cin >> arr[i];
    }
    int left=1;
    int right=1;
    int sum = arr[right];
    int ans = 0;
    
    while(right >= left && right <= N){
        if(sum < M){
            right += 1;
            sum += arr[right];
        }else if(sum > M){
            sum -= arr[left];
            left += 1;
        }else if(sum == M){
            right += 1;
            ans += 1;
            sum += arr[right];
        }
    }
    cout << ans << endl;
    return 0;
}

