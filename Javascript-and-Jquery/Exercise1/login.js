function validate()
{
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	if ( username == "Pooja" && password == "pooja123")
	{
		alert ("Welcome "+username);
		window.location = "javascript_login.html"; // Redirecting to other page.
		return false;
	}
}
