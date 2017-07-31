// 10974 - all_permutation
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int>vec;
    
    for (int i=1; i<=N; i++) {
        vec.push_back(i);
    }
    do {
        for (int j=0; j<N; j++) {
            cout << vec.at(j) << " ";
        }
        cout << endl;
    } while (next_permutation(vec.begin(), vec.end()));
    return 0;
}
