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

console.log(user.getCourseCount());
user.buyCourse("ReactJS");
user.buyCourse("AngularJS");

console.log(user.getCourseCount());
console.log(user);

user.info();



