var authenticated=true;
if(authenticated){
    console.log("Show signout button");

}else{
    console.log("Show login option");
}

authenticated?console.log("Signout button"):console.log("Login button");