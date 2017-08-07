#include <stdio.h>

int n, m;
int map[100][100];
int count[100][100];

void input()
{
	int i, j;

	scanf("%d %d", &m, &n);

	for (i = 0; i < n; i++) {
		for (j = 0; j < m; j++) {
			scanf("%1d", &map[i][j]);
		}
	}
}

void print()
{
	int i, j;
	for (i = 0; i < n; i++) {
		for (j = 0; j < m; j++) {
			printf("%d ", count[i][j]);
		}
		printf("\n");
	}
}

void dfs(int y, int x, int cnt)
{
	int dy[4] = { -1, 0, 0, 1 };
	int dx[4] = { 0, -1, 1, 0 };
	int i;
	int nexty, nextx;

	if (!count[y][x]) {
		if (map[y][x]) {
			count[y][x] = cnt + 1;
			return;
		}
		count[y][x] = cnt;
	}

	for (i = 0; i < 4; i++) {
		nexty = y + dy[i];
		nextx = x + dx[i];

		if (nexty < n && nexty >= 0 && nextx < m && nextx >= 0 && !count[nexty][nextx]) {
			dfs(nexty, nextx, cnt);
		}
	}
}

void process()
{
	int cnt;
	int i, j;

	count[0][0] = cnt = 1;

	while (count[n - 1][m - 1] == 0) {
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				if (count[i][j] == cnt) {
					dfs(i, j, cnt);
					if (count[n - 1][m - 1])    return;
				}
			}
		}
		cnt++;
	}
}

int main()
{
	input();

	process();

	printf("%d\n", count[n - 1][m - 1] - 1);

	return 0;
}
