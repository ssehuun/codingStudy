#include<iostream>
#include<algorithm>
#include<bitset>
#include<vector>
using namespace std;

int main()
{
	int n, k, x;
	cin >> n >> k;
	vector<int> arr;
	vector<int> temp;
	
	
	for (int i = 0; i < n; i++)	arr.push_back(i + 1);

	if (k == 1)
	{
		cin >> x;
		x--;
		while (x--){ next_permutation(arr.begin(), arr.end()); }
		cout << arr[0];
		for (int i = 1; i < n;i++)
			cout << " " << arr[i];
	}
	else if (k == 2)
	{
		int res = 1;
		int y;
		while (n--){ cin >> y; temp.push_back(y); }
		while (!equal(arr.begin(), arr.end(), temp.begin()))
		{
			next_permutation(arr.begin(),arr.end());
			res++;
		}
		cout << res;
	}

	return 0;
}