function validate()
{
	var sname = document.getElementById("name").value;
	var sage = document.getElementById("age").value;
	var syop = document.getElementById("yop").value;
	var scollege = document.getElementById("college").value;
	
	if ( sname == "Pooja" && sage == 21 && syop == 2022 && scollege == "Jawaharlal Nehru Engineering College")
	{
		alert ("Welcome Dear Student..!!!\n"+ "Name :"+sname+ "\nAge :"+sage+ "\nYear of Passing :"+syop+ "\nCollege Name : "+scollege);
		window.location = "StudentInfo.html"; // Redirecting to same page.
		return false;
	}
}
