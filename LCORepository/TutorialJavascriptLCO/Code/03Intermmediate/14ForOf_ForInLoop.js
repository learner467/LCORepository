const names=["Youtube",
                "Facebook",
                "Insta",
                "Twitter",
                "Amazon"];

for(const n of names){
    console.log(n);
}

console.log("");
console.log("");
var user ={
    firstName: "Debashis",
    lastName: "Mishra",
    role: "Admin",
    loginCount: 32,
    isFacebook: true
};

for(const n in user){
    console.log(n);
}

console.log("");
console.log("");

for(const n in user){
    console.log(user[n]);
}