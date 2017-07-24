#include<iostream>
#include<algorithm>
#include<memory.h>
using namespace std;

int sosu[10000];
int main()
{
	int M, N, sum = 0;
	int minimum = 10000;
	cin >> M >> N;
	for (int i = 2; i <= N; i++)
		sosu[i] = i;
	for (int i = 2; i <= N; i++)
	{
		for (int j = 2; j <= N; j++)
		{
			if (sosu[j] != i && sosu[j] % i == 0)
			{
				sosu[j] = 0;
			}
		}
	}
	for (int i = M; i <= N; i++)
	{
		if (sosu[i] != 0)
		{
			sum += sosu[i];
			minimum = min(minimum, sosu[i]);
		}
	}
	if (minimum == 10000) cout << -1;
	else
	{
		cout << sum << endl;
		cout << minimum;
	}

	return 0;
}