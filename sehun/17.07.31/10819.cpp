#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main(){
    int N;
    cin >> N;
    vector<int> vec(N);
    int arr[N];
    
    for (int i=0; i<N; i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N);
    for (int i=0; i<N; i++) {
        cout << arr[i];
    }
    
    int max = 0;
    int val = 0;
    do {
        for (int i=1; i<N; i++) {
            val += abs(arr[i-1]-arr[i]);
        }
        if(max < val){
            max = val;
        }
        val = 0;
    } while (next_permutation(arr, arr+N));
    cout << max << endl;
    return 0;
}
