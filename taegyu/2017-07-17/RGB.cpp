#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
int rgb[1005][4];
int dp[1005][4];
int N;
void find_min()
{
	int i, j, k;
	int color1, color2;
	dp[1][1] = rgb[1][1];
	dp[1][2] = rgb[1][2];
	dp[1][3] = rgb[1][3];
	for (i = 2; i <= N; i++)
	{
		for (j = 1; j <= 3; j++)
		{
			color1 = 0; color2 = 0;
			for (k = 1; k <= 3; k++)
			{
				if (k != j)
				{
					if (color1 == 0) color1 = k;
					else if (color2 == 0) color2 = k;
				}
			}
			dp[i][j] = rgb[i][j] + min(dp[i - 1][color1], dp[i - 1][color2]);

		}
	}


}


int main()
{
	memset(rgb, 0, sizeof(rgb));

	cin >> N;
	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= 3; j++)
			cin >> rgb[i][j];
	}
	find_min();
	int result = dp[N][1];
	for (int i = 2; i <= N; i++)
	if (result > dp[N][i]) result = dp[N][i];
	cout << result;

	return 0;
}