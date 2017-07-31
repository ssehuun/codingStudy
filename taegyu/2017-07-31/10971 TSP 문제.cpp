#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int w[11][11];
int travel[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
int n;

int FindMin()
{
	int sum = 0;
	for (int i = 0; i < n - 1; i++)
	{
		if (w[travel[i]][travel[i + 1]] == 0) return 100000;
		sum += w[travel[i]][travel[i + 1]];
		
	}
	if (w[travel[n - 1]][travel[0]] == 0) return 100000;
	sum += w[travel[n-1]][travel[0]];
	cout << sum << endl;
	return sum;
}

int main()
{
	int minimum = 100000;
	scanf("%d", &n);
	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= n; j++)
			scanf("%d", &w[i][j]);
	do{
		minimum = min(minimum, FindMin());
	} while (next_permutation(travel, travel + n));
	
	cout << minimum;
	return 0;
}	