// 10974 - prev_permutation
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;
    int input;
    vector<int>vec;
    
    for (int i=0; i<N; i++) {
        cin >> input;
        vec.push_back(input);
    }
    if(prev_permutation(vec.begin(), vec.end())){
        for (int j=0; j<N; j++) {
            cout << vec.at(j) << " ";
        }
        cout << endl;
    }else{
        cout << -1;
    }
    return 0;
}
