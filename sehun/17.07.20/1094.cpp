// 1094 - stick
#include <iostream>
using namespace std;

int main(){
    int stickLength = 64;
    int arr[7] = {64,32,16,8,4,2,1};
    int stickNum = 0;
    int X;
    cin >> X;
    
    if(stickLength % X == 0){
        stickNum = 1;
    }else{
        int temp = X;
        
        for(int i=0; i<sizeof(arr)/sizeof(int); i++){
            if(arr[i] <= temp){
                temp = temp - arr[i];
                stickNum++;
            }
        }
    }
    cout << stickNum << endl;
    return 0;
}
