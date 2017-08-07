// 1806 - sum of parts
#include <iostream>
using namespace std;

int main(){
    int N, S;
    cin >> N >> S;
    int arr[N];
    for (int i=1; i<=N; i++) {
        cin >> arr[i];
    }
    
    int left=1;
    int right=1;
    int ans=0;
    int sum=arr[right];
    int min = 0;
    
    while (right >= left && right <= N) {
        if(sum < S){
            right += 1;
            sum += arr[right];
        }else if(sum > S){
            sum -= arr[left];
            left += 1;
        }else if(sum == S){
            if(min == 0){
                min = right - left + 1;
            }else{
                int new_min = right - left + 1;
                if(new_min < min){
                    min = new_min;
                }
            }
            right += 1;
            ans += 1;
            sum += arr[right];
        }
    }
    if(min==0) {
        cout << min <<'\n';
    }else {
        cout << min << '\n';
    }
    return 0;
}
