#include<iostream>
#include<algorithm>
#include<queue>
#include<memory.h>
using namespace std;
int position[100001];

int main()
{
	queue<int> que;
	int N, K;
	cin >> N >> K;
	memset(position, -1, sizeof(position));
	position[N] = 0;
	que.push(N);
	
	while (!que.empty())
	{
		int now = que.front();
		que.pop();
		if (now == K) break;
		int dx[] = { now-1, now+1, now*2 };
		for (int i = 0; i < 3; i++)
		{
			int next = dx[i];
			if (next>=100001 || next<0 || position[next] != -1) continue;
			position[next] = position[now] + 1;
			que.push(next);
		}
		
	}
	cout << position[K];
	return 0;
}