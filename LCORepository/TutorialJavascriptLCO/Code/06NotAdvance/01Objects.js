var User = function(firstName, courseCount){
    this.firstName=firstName;
    this.courseCount = courseCount;

    this.getCourseCount =function(){

        console.log(`Course count for ${this.firstName} is: ${this.courseCount}`);
    };
};

User.prototype.getFirstName = function(){
    console.log(`Your first name is: ${this.firstName}`);
}

var debashis= new User("Debashis", 2);

console.log(debashis);

var sam =new User("Sam", 4);

console.log(sam);

sam.getCourseCount();
if(debashis.hasOwnProperty("firstName")){
    debashis.getFirstName();
}

if(sam.hasOwnProperty("firstname")){
    sam.getFirstName();
}





