var isLoggedIn=true;
var isEmailVerified=true;
var isCardInfoAvailable=true;

if(isLoggedIn){
    console.log("Logged IN Successfully");

    if(isEmailVerified){
        console.log("Email is verified");
        
        if(isCardInfoAvailable){
            console.log("You can make a purchase.");
        }
    }
}

if(isLoggedIn && isEmailVerified && isCardInfoAvailable){
    console.log("Allow user to make a purchase.");
}else{
    console.log("Please contact admin.");
}