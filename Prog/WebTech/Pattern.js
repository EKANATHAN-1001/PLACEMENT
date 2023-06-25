var s = "";
function print6()
{
	for(var i=0;i<6;i++)
		s=s+"*";
	console.log(s);
	s="";
}
function print2()
{
	var s1="";
	for(var i=0;i<2;i++)
		s=s+"*";
	for(var i=0;i<2;i++)
		s1=s1+" ";
	console.log(s1+s);
	s="";
}
function print4()
{
	for(var i=0;i<4;i++)
		s=s+"*";
	console.log(" "+s);
	s="";
}
function print(a)
{
	for(var i=0;i<a;i++)
	{
		print6();
		print2();
		print6();
		print4();
	}
}
print(4);
