#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main(){
    int testCase;
    string str;
    cin >> testCase;
    int store[testCase];
    
    for(int i=0; i<testCase; i++){
        cin >> str;
        
        vector<int> point;
        int cnt = 0;
        
        for(int j=0; j<str.length(); j++){
            if(str[j] == 'O'){
                cnt++;
                point.push_back(cnt);
            }else if(str[j] == 'X'){
                cnt = 0;
                point.push_back(cnt);
            }
        }
        int sum = 0;
        for(int k=0; k<point.size(); k++){
            sum += point.at(k);
        }
        store[i] = sum;
        point.clear();
    }
    for (int z=0; z<testCase; z++) {
        cout << store[z] << endl;
    }
    return 0;
}
