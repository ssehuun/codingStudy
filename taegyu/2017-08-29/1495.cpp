#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n, s, m;
int dp[101][1001];
int main()
{
	cin >> n >> s >> m;
	vector<int> a(n+1);
	int res = 0;

	a[0] = s;
	for (int i = 1; i <= n; i++)
		cin >> a[i];
	
	dp[0][a[0]] = 1;

	for (int i = 1; i <= n; i++)
	{
		for (int j = 0; j <= m; j++)
		{
			if (dp[i - 1][j])
			{
				if (j + a[i] <= m) dp[i][j + a[i]] = 1;
				if (j - a[i] >= 0) dp[i][j - a[i]] = 1;
			}
			if (i == n && dp[i][j])
			{
				res = max(j, res);
			}
		}
	}
	if (!res) cout << "-1" << endl;
	else 
	cout << res;	
	return 0;
}