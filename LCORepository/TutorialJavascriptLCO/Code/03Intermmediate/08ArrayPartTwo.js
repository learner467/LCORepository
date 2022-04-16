function isEven(element){
    var outcome=element % 2===0;
    console.log(element +" is "+outcome);

   return outcome;
}

console.log(isEven(4));

var isEven1= (element)=>{
    return element % 3===0;
 };

 console.log(isEven1(3));

 var result=[2,3,6,8,9].every(isEven);
 console.log(result);

 console.log("=============CALLBACK WITH ARROW FUNCTION===========");
 var result1=[2,4,13,6,8].every((e) => {

    var outcome=e % 2===0;
    console.log(e +" is "+outcome);

   return outcome;
 });
 console.log(result1);

