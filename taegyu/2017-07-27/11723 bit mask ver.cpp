#include<iostream>
#include<cstring>
#include<cstdio>
using namespace std;

int main()
{
	int m;
	int num;
	int s = 0;
	int n = 20;
	char c[101];
	scanf("%d", &m);
	while (m--)
	{
		scanf("%s", &c);
		scanf("%d", &num);
		num--;
		if (!strcmp(c, "add"))
		{
			// num ��° ��Ʈ�� 1�� or ��Ű�� add�� �˴ϴ�
			s= (s | (1 << num));
		}
		else if (!strcmp(c, "remove"))
		{
			// num ��° ��Ʈ�� 0���� and ��Ű�� ����.
			s = (s & ~(1 << num));
		}
		else if (!strcmp(c, "toggle"))
		{
			s =( s ^ (1 << num));
		}
		else if (!strcmp(c, "check"))
		{
			int res = (s & (1 << num));
			if (res)
			{
				puts("1");
			}
			else puts("0");
		}
		else if (!strcmp(c, "empty"))
		{
			s = 0;
		}
		else if (!strcmp(c, "all"))
		{
			s = (1 << n) - 1;
		}
	}
	return 0;
}