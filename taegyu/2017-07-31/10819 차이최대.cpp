#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int arr_sum(vector<int> &arr)
{
	int sum = 0;
	for (int i = 0; i < arr.size() - 1; i++)
		arr[i] - arr[i + 1] >0 ? sum += arr[i] - arr[i + 1] : sum += -1 * (arr[i] - arr[i + 1]);
	return sum;
}

int main()
{
	vector<int> arr, temp;
	int n, a;
	cin >> n;
	int maximum= -1000000;	
	while (n--){ cin >> a; arr.push_back(a); }
	//순열은 정렬이 되어있어야함..
	sort(arr.begin(), arr.end());
	do{
		maximum=max(maximum,arr_sum(arr));
	} while (next_permutation(arr.begin(), arr.end()));
	cout << maximum;
	return 0;
}