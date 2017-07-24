#include<iostream>
#include<queue>
#include<memory.h>
using namespace std;

int A, B, N, M;
int map[100001];
int main()
{
	cin >> A >> B >> N >> M;
	queue<int> que;
	que.push(N);
	map[N] = 1;
	memset(map, 0, sizeof(map));
	while (!que.empty())
	{
		int x = que.front();
		que.pop();
		if (x == M) break;
		
		int nx = 0;
		nx = x + 1;
		if (map[nx] == 0 && nx <= M && nx >=0 ) { que.push(nx); map[nx] = map[x] + 1; }
		nx = x - 1;
		if (map[nx] == 0 && nx <= M && nx >=0) { que.push(nx); map[nx] = map[x] + 1; }
		nx = x * A;
		if (map[nx] == 0 && nx <= M && nx >= 0) { que.push(nx); map[nx] = map[x] + 1; }
		nx = x* B;
		if (map[nx] == 0 && nx <= M && nx >= 0) { que.push(nx); map[nx] = map[x] + 1; }
		nx = x + A;
		if (map[nx] == 0 && nx <= M && nx >= 0) { que.push(nx); map[nx] = map[x] + 1; }
		nx = x + B;
		if (map[nx] == 0 && nx <= M && nx >= 0) { que.push(nx); map[nx] = map[x] + 1; }
		nx = x - A;
		if (map[nx] == 0 && nx <= M && nx >= 0) { que.push(nx); map[nx] = map[x] + 1; }
		nx = x - B;
		if (map[nx] == 0 && nx <= M && nx >= 0) { que.push(nx); map[nx] = map[x] + 1; }
	}
	cout << map[M] << endl;

	return 0;
}