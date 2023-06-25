var N=0;
function print(a)
{
	var s ="",s1="";
	for(var i=a;i>0;i=i-2)
	{
		for(var j=i;j>0;j--)
			s = s+"*";
		s1=s1+" ";
		console.log(s1+s);
		s="";
	}
	N = s1.length;
}
function printrev(a)
{
	var s ="",s1="",k=0;
	for(var i=0;i<a;i=i+2)
	{if(i!=0)
		{
		for(var j=0;j<=i;j++)
			s = s+"*";
		for(var j=N;j>0;j--)
			s1=s1+" ";
		console.log(s1+s);
		}
		s="";
		N--;
		s1="";
	}
}
function sand(a)
{
print(a);
printrev(a);
}
sand(5);