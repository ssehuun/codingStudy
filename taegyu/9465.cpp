#include<iostream>
#include<algorithm>
using namespace std;
int n;
int dp[100001][2];
int arr[100001][2];

void solve()
{
	dp[0][0] = arr[0][0];
	dp[0][1] = arr[0][1];
	dp[1][0] = arr[0][1] + arr[1][0];
	dp[1][1] = arr[0][0] + arr[1][1];

	for (int i = 2; i < n; i++)
	{
		dp[i][0] = max(dp[i - 2][1], dp[i - 1][1]) + arr[i][0];
		dp[i][1] = max(dp[i - 2][0], dp[i - 1][0]) + arr[i][1];
	}
	int res = max(dp[n-1][0], dp[n-1][1]);
	cout << res << endl;
}

int main()
{
	int t;
	cin >> t;
	for (int i = 0; i < t; i++)
	{
		cin >> n;
		for (int j = 0; j < 2; j++)
		{
			for (int k = 0; k < n; k++)
			{
				cin >> arr[k][j];
			}
		}
		solve();
		memset(arr, 0, sizeof(arr));
		memset(dp, 0, sizeof(dp));
		

	}
	return 0;
}