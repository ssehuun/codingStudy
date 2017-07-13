#include<iostream>
#include<cstring>
using namespace std;
int w, h;
int land[51][51];
bool visited[51][51];
int dx[8] = { 0, 0, 1, 1, 1, -1, -1, -1 };
int dy[8] = { 1, -1, -1, 0, 1, -1, 0, 1 };
int cnt = 0;




void visited_check(int y, int x)
{
	visited[y][x] = true;
	int nextx, nexty;
	for (int i = 0; i < 8; i++)
	{
		nextx = x + dx[i];
		nexty = y + dy[i];
		if (1 <= nextx && nextx <= w && nexty >= 1 && nexty <= h && land[nexty][nextx] == 1 && visited[nexty][nextx] == false)
		{
			visited_check(nexty, nextx);
		}
	}
	return;
}
int count_land(int y, int x)
{
	int i, j;
	for (j = 1; j <= h; j++)
	{
		for (i = 1; i <= w; i++)
		{
			if ((land[j][i] == 1) && (visited[j][i] == false))
			{
				visited_check(j, i);
				cnt++;
			}
		}
	}
	return 0;
}





bool input_item()
{
	cin >> w >> h;
	if (w == 0 && h == 0) return false;
	int i, j;
	for (j = 1; j <= h; j++)
	{
		for (i = 1; i <= w; i++)
		{
			cin >> land[j][i];
		}
	}
	return true;
}

int main()
{
	memset(visited, false, sizeof(visited));
	memset(land, -1, sizeof(land));
	while (input_item())
	{
		count_land(1, 1);
		cout << cnt << endl;
		cnt = 0;
		memset(visited, false, sizeof(visited));
		memset(land, -1, sizeof(land));
	}
}

