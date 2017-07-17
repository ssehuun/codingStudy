#include<iostream>
#include<string>
using namespace std;
int main()
{
	int N, sum;
	int dp_check[80] = { 0, };
	cin >> N;
	cin.ignore();
	string s;
	for (int i = 0; i < N; i++)
	{
		sum = 0;
		getline(cin, s);
		dp_check[0] = 0;
		int k = 1;
		for (int j = 0; j < s.size(); j++)
		{
			if (s.at(j) == 'O')dp_check[k] = dp_check[k - 1] + 1;
			else dp_check[k] = 0;
			k++;
		}
		for (int i = 0; i <= s.size(); i++)
		{
			sum += dp_check[i];
			//	cout << dp_check[i] << endl;
		}
		cout << sum << endl;
	}

	return 0;
}