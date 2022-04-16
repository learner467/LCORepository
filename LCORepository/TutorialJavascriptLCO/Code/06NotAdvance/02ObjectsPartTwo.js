var User = {
    name:"",
    getUserName: function (){
        console.log(`User name is : ${this.name}`);
    }
};

var debashis = Object.create(User);
console.log(debashis);
debashis.name="Debashis";
debashis.getUserName();

var sam = Object.create(User, {
    name: {value: "Sam"}
});
console.log(sam);
sam.getUserName();