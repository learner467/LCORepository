//For all regular function calls, this points to window/global Object.
console.log(this);

var user ={
    firstName: "Debashis",
    lastName: "Mishra",
    role: "Admin",
    loginCount: 32,
    isFacebook: true,
    courseList: [],

    buyCourse: function(courseName){
        this.courseList.push(courseName);
    },

    getCourseCount: function(){
        console.log("Inside getCorseCount: ",this);
        function sayHello(){
            console.log("Inside sayHello: ",this);

        };

        sayHello();
        return `${this.firstName} is enrolled in total of ${this.courseList.length} courses`;
    },

    info: function(){

        console.log(`
        firstName is ${this.firstName}
        lastName is ${this.lastName}
        role is ${this.role}
        Enrolled in ${this.courseList}
        `);
    }
};

user.getCourseCount();