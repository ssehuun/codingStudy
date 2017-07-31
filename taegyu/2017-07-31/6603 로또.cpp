#include<iostream>
#include<vector>
using namespace std;
int n;
vector<int> arr;
void dfs(vector<int>& temp,int dep)
{
	if (temp.size() == 6)
	{
		for (int i = 0; i < 6; i++)
			cout << temp[i] << " ";
		cout << endl;
		return;
	}
		if (dep >= arr.size()) return;
		temp.push_back(arr[dep]);
		dfs(temp, dep + 1);
		temp.pop_back();
		dfs(temp, dep+1);
}
int main()
{
	vector<int> a;
	int temp;
	while (1)
	{
		cin >> n;
		if (n == 0) return 0;
		else
		{
			for (int i = 0; i < n; i++)
			{
				cin >> temp;
				arr.push_back(temp);
			}
			dfs(a, 0);
			cout << endl;
			arr.clear();
		}
	}
	
	return 0;
}