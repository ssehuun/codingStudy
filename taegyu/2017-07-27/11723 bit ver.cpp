#include<iostream>
#include<cstring>
#include<cstdio>
#include<bitset>
using namespace std;

int main()
{
	bitset<20> bit;
	int m;
	cin >> m;
	char c[100];
	int num;
	while (--m)
	{
		cin >> c >> num;
		if (!strcmp(c, "add"))
		{
			bit.set(num - 1, 1);
		}
		else if (!strcmp(c, "remove"))
		{
			bit.set(num - 1, 0);
		}
		else if (!strcmp(c, "toggle"))
		{
			bit.set(num - 1, !bit[num - 1]);
		}
		else if (!strcmp(c, "check"))
		{
			cout << bit[num-1] << endl;
		}
		else if (!strcmp(c, "all"))
		{
			bit.set();
		}
		else if (!strcmp(c, "empty"))
		{
			bit.reset();
		}
	}
	return 0;
}