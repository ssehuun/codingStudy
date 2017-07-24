#include<iostream>
using namespace std;

int map[21][21];
int jusawi[7] = { 0,0,0,0,0,0,0 };
int temp[7] = { 0, 0, 0, 0, 0,0,0 };
int N, M, x, y, K;

void play(int direction)
{
	switch (direction)
	{
		//µ¿
	case 1: 
		temp[4] = jusawi[6];
		temp[1] = jusawi[4];
		temp[3] = jusawi[1];
		temp[6] = jusawi[2];
		temp[5] = jusawi[5];
		temp[2] = jusawi[2];
		x++;
		break;
		//¼­
	case 2:
		temp[1] = jusawi[3];
		temp[3] = jusawi[6];
		temp[6] = jusawi[4];
		temp[2] = jusawi[2];
		temp[5] = jusawi[5];
		temp[6] = jusawi[4];
		x--;
		break;
		//ºÏ
	case 3:
		temp[1] = jusawi[5];
		temp[5] = jusawi[2];
		temp[2] = jusawi[1];
		temp[6] = jusawi[2];
		temp[3] = jusawi[3];
		temp[4] = jusawi[4];
		y--;
		break;
		//³²
	case 4:
		temp[1] = jusawi[2];
		temp[2] = jusawi[6];
		temp[6] = jusawi[5];
		temp[5] = jusawi[1]; 
		temp[3] = jusawi[3];
		temp[4] = jusawi[4];
		y++;
		break;
	default: break;

	}
	if (map[y][x] == 0) map[y][x] = temp[6];
	else
	{
		temp[6] = map[y][x];
		map[y][x] = 0;
	}
	cout << temp[1] << endl;
	for (int i = 0; i < 7; i++) jusawi[i] = temp[i];
}
int main()
{
	int input;
	cin >> N >> M >> x >> y >> K;
	
	memset(map, -1, sizeof(map));
	
	for (int i = 1; i <= N; i++)
		for (int j = 1; j <= M; j++)
			cin >> map[i][j];

	for (int i = 0; i < K; i++)
	{
		cin >> input;
		play(input);
	}

	return 0;
}