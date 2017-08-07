#include<iostream>
#include<string>
#include<queue>
using namespace std;
void bfs(int start,int end)
{
	string dap;
	char op[4] = { 'D', 'S', 'L', 'R' };
	queue<pair<int,string>> que;
	que.push(make_pair(start, ""));
	while (!que.empty())
	{
		int now=que.front().first;
		string str = que.front().second;
		if (now == end) { dap.append(str); break; }
		
		que.push(make_pair(now * 2 % 10000, str.append("D")));
		que.push(make_pair(now != 0 ? now - 1 : 9999,str.append("S")));
		que.push(make_pair( (((now % 10) * 10 + (now % 100) / 10) * 10 + ((now % 1000) / 100))* 10 + now / 1000, str.append("L")));
		que.pop();

	}
	cout <<dap << endl;
}
int main()
{
	int t;
	char op;
	int reg_s;
	int reg_d;
	cin >> t;
	for (int i = 0; i < t; i++){
		cin >> reg_s >> reg_d;
		bfs(reg_s,reg_d);
	}
	


	return 0;
}