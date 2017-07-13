#include<iostream>
#include<memory.h>	
using namespace std;

char section[101][101];
int visited[101][101];
int visited1[101][101];
int n;
int dx[4] = { 0, 0, 1, -1 };
int dy[4] = { -1, 1, 0, 0 };

void solve(int y, int x)
{
	visited[y][x] = 1;
	for (int i = 0; i < 4; i++)
	{
		int ny = y + dy[i];
		int nx = x + dx[i];
		if (ny <0 || ny > n - 1 || nx <0 || nx>n - 1) continue;
		if(section[y][x] == section[ny][nx] &&!visited[ny][nx])
			solve(ny,nx);
	}
	return;
}
void solve2(int y, int x)
{
	visited1[y][x] = 1;
	for (int i = 0; i < 4; i++)
	{
		int ny = y + dy[i];
		int nx = x + dx[i];
		if (ny <0 || ny > n - 1 || nx <0 || nx>n - 1) continue;
		if (visited[ny][nx] == -1)continue;
		if (section[ny][nx] == 'u') continue;
		if(!visited1[ny][nx] && ((section[ny][nx]=='G' && section[y][x]=='R') || (section[ny][nx]=='R' && section[y][x]=='G') || section[y][x] ==section[ny][nx]))
			solve2(ny, nx);
	}
	return;
}
int main()
{
	
	cin >> n;
	memset(section, 'u', sizeof(section));
	memset(visited, -1, sizeof(visited));
	memset(visited1, -1, sizeof(visited1));

	int cnt = 0;
	int cnt1 = 0;
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			cin >> section[i][j];
			visited[i][j] = visited1[i][j] = 0;
		}

	}
		
	
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (!visited[i][j])
				{
				solve(i, j);
				cnt++;
				}
		
			if (!visited1[i][j])
			{

				solve2(i, j);
				cnt1++;
			}
		}
	}

	cout << cnt << " " << cnt1;
	return 0;
}

