#include<iostream>
using namespace std;
int i=1;
class no_loop_rec_goto
{
	public:
	no_loop_rec_goto()
	{
		cout<<i<<endl;
		i++;
	}
	
};
int main()
	{
		no_loop_rec_goto a[100];
		return 0;
	}
