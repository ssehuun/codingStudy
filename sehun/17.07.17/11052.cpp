// 11052 - 붕어빵 판매하기
#include <iostream>
using namespace std;

int main(){
    int fishNum;
    int maxPrice=0;
    int packPrice[1001] = {0};
    int maxPerOne[1001] = {0};
    
    cin >> fishNum;
    
    int max = 0;
    int maxIndex = 1;
    
    for (int i=1; i<=fishNum; i++) {
        cin >> packPrice[i];
        maxPerOne[i] = packPrice[i]/i;
        
        if (max < maxPerOne[i]) {
            maxIndex = i; // 1개당 가격이 가장큰 패키지 개수
            max = maxPerOne[i];
        }
    }
    
   
    
    if(fishNum % maxIndex == 0){
        maxPrice = (fishNum / maxIndex) * packPrice[maxIndex];
    }else{
        maxPrice = (fishNum / maxIndex) * packPrice[maxIndex];
        
        int max2 = 0;
        int maxIndex2 = 1;
        
        for(int i=1; i<=fishNum % maxIndex; i++){
            if(max2 < maxPerOne[i]){
                maxIndex2 = i;
                max2 = packPrice[i];
            }
            maxPrice = maxPrice+(fishNum / maxIndex2) * packPrice[maxIndex2];
        }
    }
    cout << maxPrice << endl;
    return 0;
}
