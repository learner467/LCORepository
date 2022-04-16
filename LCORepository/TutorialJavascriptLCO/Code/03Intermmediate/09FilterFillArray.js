var testArray=[2,4,6,3,1,5,9,8,20,11];

console.log(testArray.fill("H", 2,6));

const myNum=[2,4,6,3,1,5,9,8,20,11];

const result=myNum.filter((num)=>num%2===0);

console.log(result);

var users=["Ted", "Tim", "Ton", "Sam","Sor","Sod"];

console.log(users.slice(1,5));
console.log(users.slice(1));

console.log(users);
users.splice(1,4,"Hi","Bye");
console.log(users);
