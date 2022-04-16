//Closer
function init(){
    var firstName="Debashis";
    console.log("I am init.");

    function sayFirstName(){
        console.log(`First name is: ${firstName}`);
    }

    return sayFirstName;
}

var value=init();
value();

function doAddition(x){
    console.log("I am doAddition.");
    return function(y){
        return x+y;
    }
}

var add=doAddition(5);
console.log(add(7));
console.log(add(1));

console.log(doAddition(8)(6)); //Curring