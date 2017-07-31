#include<iostream>
using namespace std;

int main()
{
	int de, ds, dm;
	int e, s, m;
	cin >> de >> ds >> dm;
	for(int i = 0;i<=15*28*19;i++)
	{	
		e= (i % 15) + 1;
		s = (i % 28) + 1;
		m = (i % 19)+ 1;
		if (e == de && s == ds && m == dm){ cout << i+1; break; }
	}
	return 0;
}