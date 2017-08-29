#include<iostream>
#include<vector>
using namespace std;

int n;
long long dp[100][21];

int main()
{
	cin >> n;
	vector<int> a(n);
	for (int i = 0; i < n; i++)
		cin >> a[i];
	

	dp[0][a[0]] = 1;
	for (int i = 1; i < n-1; i++)
	{
		for (int j = 0; j <= 20; j++)
		{
			if (j - a[i] >= 0)
			{
				dp[i][j] += dp[i - 1][j - a[i]];	
			}
			if (j + a[i] <= 20)
			{
				dp[i][j] += dp[i - 1][j + a[i]];
			}
		}
	}
	cout << dp[n - 2][a[n-1]];

	return 0;
}