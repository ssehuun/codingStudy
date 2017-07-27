#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
	int n, x;
	cin >> n;
	int* arr = new int[n];
	for (int i = 0; i < n; i++)
	{
		cin >> x;
		arr[i] = x;
	}
	if (!prev_permutation(arr, arr + n)) puts("-1");
	else
	{
		cout << arr[0];
		for (int i = 1; i < n; i++)
			cout << " " << arr[i];
	}
	delete[] arr;
	return 0;
}