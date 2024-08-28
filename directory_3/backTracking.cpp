#include <bits/stdc++.h>

using namespace std;

vector<pair<int,int>> v;

void print(int i, int j, int n, int m)
{
	if(i > n || j > m)
	{
		return;
	}
	v.push_back({i,j});
	if(i == n && j == m)
	{
		for(int i = 0; i < v.size(); i++)
		{
			cout<<v[i].first <<" " << v[i].second <<" -> ";
		}
		cout<<endl;
	}
	print(i+1, j, n, m);
	print(i, j+1, n, m);
	v.pop_back();
}

int main()
{
	print(0,0,2,2);
}
