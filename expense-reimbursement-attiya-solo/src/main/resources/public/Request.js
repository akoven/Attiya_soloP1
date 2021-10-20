function addRedirect(){
    window.location.replace("http://localhost:9000/newExpense.html");
}

let addRequestListener = document.getElementById("add");

addRequestListener.addEventListener('click', addRedirect);


function removeRedirect(){
    window.location.replace("http://localhost:9000/removeRequest.html");
}
let removeRequestListener = document.getElementById("remove");

removeRequestListener.addEventListener('click', removeRedirect);


function getRedirect(){
    window.location.replace("http://localhost:9000/getRequest.html");
}
let getRequestListener = document.getElementById("getRequest");

getRequestListener.addEventListener('click', getRedirect);


function logoutRedirect(){
    window.location.replace("http://localhost:9000/preLogin.html");
}
let logoutRequestListener = document.getElementById("logout");

logoutRequestListener.addEventListener('click', logoutRedirect);

