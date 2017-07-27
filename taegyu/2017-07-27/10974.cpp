#include <iostream>
#include <algorithm>
#include <cstdio>
#include <vector>
using namespace std;

int main()
{
	int n;

	scanf("%d", &n);
	vector<int> p;
	for (int i = 0; i < n; i++) p.push_back(i + 1);

	do {
		for (int i = 0; i < n; i++)
			printf("%d ", p[i]);

		printf("\n");
	} while (next_permutation(p.begin(), p.begin()+n));

	return 0;
}
