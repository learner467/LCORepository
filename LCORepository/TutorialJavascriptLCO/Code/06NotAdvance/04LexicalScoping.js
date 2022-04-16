//Lexical Scoping
function init(){
    var firstName="Debashis";
    function sayFirstName(){
        console.log(`First name is: ${firstName}`);
    }

    sayFirstName();
}

init();