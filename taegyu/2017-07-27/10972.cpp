#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
	int n;
	int x;
	cin >> n;
	int* arr = new int[n];
	for (int i = 0; i < n; i++)
	{
		cin >> x;
		arr[i] = x;
	}

	if (next_permutation(arr, arr + n))
	{
		cout << arr[0];
		for (int i = 1; i < n; i++)
			cout << " " << arr[i];
	}
	else puts("-1");
	
	return 0;
}