// 9372 - sangeun's travel
#include <iostream>
#include <vector>
using namespace std;

int main(){
    int testCase;
    vector<int> store;
    cin >> testCase;
 
    for(int i=0; i<testCase; i++){
        int a = 0;
        int b = 0;
        int ctry = 0;
        int plane = 0;
 
        cin >> ctry >> plane;
 
        for(int j=0; j<plane; j++){
           cin >> a >> b;
        }
        store.push_back(ctry-1);
    }
    for (int k=0; k<store.size(); k++) {
        cout << store.at(k) << endl;
    }
    return 0;
}
