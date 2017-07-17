// 짝수 길이인 가장 긴 문자열 출력
// 참고 : http://word.tistory.com/24
#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main(){
    string str;
    stringstream buf;
    
    getline(cin, str);
    // 현재 stringstream의 값을 str로 바꾼다.
    buf.str(str);
    
    string max = "";
    // 더 이상 str의 자료형에 맞는 정보가 없을 때까지 계속 스트림에서 str로 자료를 추출/복사함
    while (buf >> str) {
        if(str.length() % 2 == 0){
            if(max.size() < str.size()){
                max = str;
            }
        }
    }
    if(max.length() == 0){
        cout << "00" << endl;
    }
    cout << max << endl;
    return 0;
}
