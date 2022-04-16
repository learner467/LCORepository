//Execution Context
//  Variable Object
//  Scope Chain
//  this
// Function declarations are scanned and made available 
// Variable declarations are scanned and made undefined
tipper("5");

function tipper(a){
    var bill=parseInt(a);
    console.log("Bill is: ");
    console.log(bill+5);
}



var bigTipper=function (a){
    var bill=parseInt(a);
    console.log("Final Bill is: ");
    console.log(bill+15);
}

bigTipper("80");

console.log(name1);
var name1="Debashs";

function sayName(){
    var name1="Mr. D";
    console.log(name1);
}

sayName();

console.log(name1);