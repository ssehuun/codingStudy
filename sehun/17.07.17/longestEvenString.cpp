// ¦�� ������ ���� �� ���ڿ� ���
// ���� : http://word.tistory.com/24
#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main(){
    string str;
    stringstream buf;
    
    getline(cin, str);
    // ���� stringstream�� ���� str�� �ٲ۴�.
    buf.str(str);
    
    string max = "";
    // �� �̻� str�� �ڷ����� �´� ������ ���� ������ ��� ��Ʈ������ str�� �ڷḦ ����/������
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
