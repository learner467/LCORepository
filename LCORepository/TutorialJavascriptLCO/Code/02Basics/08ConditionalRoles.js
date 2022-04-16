var user="1user";

switch(user){
    case "admin":
        console.log("You get full access");
        break;
    case "subadmin":
        console.log("You get access to create/delete courses");
        break;
    case "testprep":
        console.log("You get access to create/delete test");
        break;
    case "user":
        console.log("You get access to consume the content");
        break;

    default:
        console.log("Trial User");
        break;
    }