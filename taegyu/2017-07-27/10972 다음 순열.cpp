#include<iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;

	//크기가 n인 순열은 총 N!개가 존재한다
	// STL next_permutation 함수와 prev_permutation 함수가 존재 
	/*
	1. A[i-1] < A[i]를 만족하는 가장 큰 i를 찾는다
	2. j>=i 이면서 A[j] > A[i-1]를 만족하는 가장큰 j를 찾는다.
	3. A[i-1]과 A[j]를 뒤집는다.
	4. A[i]부터 뒤집는다
	*/
	return 0;
}

//return true= 다음순열 존재, false=다음순열 존재하지않음(마지막순열)
bool next_permutation(int *a, int n){
	int i = n - 1;
	while (i > 0 && a[i - 1] >= a[i]) i -= 1;
	if (i <= 0) return false; //마지막 순열
	int j = n - 1;
	while (a[j] <= a[i - 1]) j -= 1;
	swap(a[i - 1], a[j]);
	j = n - 1;
	while (i < j){
		swap(a[i], a[j]);
		i += 1;
		j -= 1;

	}
	return true;
}

//모든 순열 문제

/*
#include<algorithm>
#inlcude<vector>
using namespace std;

int main(){
int n;
cin>>n;
vector<int> a(n);
for(int i=0;i<n;i++){
a[i] =i+1;
}
do{
	for(int i=0;i<n;i++){
		cout<<a[i]<<' ' ;
	}
	cout<< '\n';
}while(next_permutation(a.begin(),a.end()));
return 0;	

*/