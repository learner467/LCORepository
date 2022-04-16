var name="Debashis";
var name1="Mishra";


console.log("Line number 3: ", name);

function sayName(){
    console.log("Line number 6: ", name);
}

sayName();

function sayName1(){
    var name="Mr D";
    console.log("Line number 13: ", name);
    
    sayName2();
    function sayName2(){
        console.log("Line number 17:", name)
    }

    sayName3();
    function sayName3(){
        var name="Mr DM";
        console.log("Line number 24:", name)
    }
    sayName4();
    function sayName4(){
        console.log("Line number 30:", name1)
    }
}

sayName1();