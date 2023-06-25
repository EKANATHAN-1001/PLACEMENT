function array()
{

	let arr=[[1,2,3],
			 [4,5,6],
			 [7,8,9]];
			 
	console.log("One array Element");
	console.log(arr[2][2]);
	console.log("All array Element");
arr.forEach((row)=>{
	row.forEach((elmt)=>{
	console.log(elmt)});
});
}
array();