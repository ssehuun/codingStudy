// Baekjoon 2908 - string

#include <iostream>
#include <string>
using namespace std;

int main(){
	string num1, num2;
	char temp;
			    
	cin >> num1 >> num2;
	temp = num1[2];
	num1[2] = num1[0];
	num1[0] = temp;
							    
	temp = num2[2];
	num2[2] = num2[0];
	num2[0] = temp;
										    
	if(num1 > num2){
		cout << num1;
	}else{
		cout << num2;
	}
	return 0;
}
