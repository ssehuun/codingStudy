#include<iostream>
#include<string>
#include<vector>
#include<sstream>
using namespace std;

int main()
{
	
	string buf;
	string str;
	getline(cin, str);
	vector<string> vec;
	stringstream ss(str);
	string dap;
	int size = 0;
	
	while (ss >> buf)
	{
		if (buf.size() % 2 == 0 && buf.size() >= size)
		{
			vec.push_back(buf);
		}
		
	}

	if (vec.empty()) cout << "00" << endl;
	else cout << vec[vec.size()-1]<< endl;
	
	return 0;
}