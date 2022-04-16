var countries= ["India", "USA", "Japan", "Russia"];

var states=new Array("Rajasthan", "Delhi", "Mumbai", "Assam");

console.log(states);

console.log(states[1]);

console.log(states.length);

states[0]="Punjab";
console.log(states);

var user=["Debahsis", "deb@gmail.com",3,34,true];

console.log(user);

user.pop();
console.log(user);

user.unshift("New Value");
console.log(user);

user.shift();
console.log(user);

console.log(user.indexOf(3));

var name1="Debashis";

console.log(Array.from(name1));