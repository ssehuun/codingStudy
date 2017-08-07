#include<iostream>
using namespace std;

int main()
{
	int n;
	int ans = 0;
	cin >> n;
	for (int i = 1; i<=3; i++)
	{
		if (i == n) ans += 1;
		for (int j = 1; j <= n; j++)
		{
			if (i + j == n) ans+=1;
			for (int k = 1; k <= n; k++)
			{
				if (i + j + k == n) ans += 1;
			}
		}
	}
	cout << ans;
	return 0;
}