function loginRedirect(){
	window.location.replace("http://localhost:9000/homepage_emp.html")
}

let RegisterEmployeeListner = document.getElementByName("register");
RegisterEmployeeListner.addEventListener('click',loginRedirect);

function RegisterMgr(){
	
}