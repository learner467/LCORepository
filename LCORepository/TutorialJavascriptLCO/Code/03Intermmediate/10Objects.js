var user ={
    firstName: "Debashis",
    lastName: "Mishra",
    role: "Admin",
    loginCount: 32,
    isFacebook: true
};

console.log(user.firstName);

console.log(user["role"]);

user.loginCount=44;

console.log(user);

console.table(user);

