#include<iostream>
#include<algorithm>
#include<queue>
using namespace std;

int cnt = 0;
void solve_jaegui(int n)
{
	if (n == 0) cnt++;

	for (int i = 1; i <= 3; i++)
	{

		if (n - i < 0) continue;
		solve_jaegui(n - i);

	}
	return;
}
void solve_bfs(int n)
{
	queue<int> que;
	que.push(n);
	int dap = 0;
	while (!que.empty())
	{
		int now=que.front();
		que.pop();
		if (now == 0){ dap++; }
		else
		{
			for (int i = 1; i <= 3; i++)
			{
				if (now - i < 0) continue;
				que.push(now - i);
			}
		}

	}
	cout << dap << endl;
}
void solve_dp(int n)
{
	int dp[100] = { 0, };
	dp[1] = 1;
	dp[2] = 2;
	dp[3] = 4;

	for (int i = 4; i <= n; i++)
		dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

	cout << dp[n] << endl;
}
int main()
{
	int t;
	int n;
	cin >> t;
	while (t--) {
		cin >> n;
		solve_jaegui(n);
		cout << cnt << endl;
		cnt = 0;
		//solve_bfs(n);
		//solve_dp(n);
	}
	return 0;
}