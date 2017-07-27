#include<iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;

	//ũ�Ⱑ n�� ������ �� N!���� �����Ѵ�
	// STL next_permutation �Լ��� prev_permutation �Լ��� ���� 
	/*
	1. A[i-1] < A[i]�� �����ϴ� ���� ū i�� ã�´�
	2. j>=i �̸鼭 A[j] > A[i-1]�� �����ϴ� ����ū j�� ã�´�.
	3. A[i-1]�� A[j]�� �����´�.
	4. A[i]���� �����´�
	*/
	return 0;
}

//return true= �������� ����, false=�������� ������������(����������)
bool next_permutation(int *a, int n){
	int i = n - 1;
	while (i > 0 && a[i - 1] >= a[i]) i -= 1;
	if (i <= 0) return false; //������ ����
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

//��� ���� ����

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