const debashis ={
    firstName: "Debashis",
    lastName: "Mishra",
    role: "Admin",
    courseCount: 3,

    getInfo: function(){

        console.log(`
        First Name is ${this.firstName}
        Last Name is ${this.lastName}
        His Role is ${this.role}
        He is ${this.courseCount} courses.
        `);
    }
};

const dj={
    firstName: "Rock",
    lastName: "DJ",
    role: "Sub-Admin",
    courseCount: 4
};

debashis.getInfo();

debashis.getInfo.bind(dj)();

debashis.getInfo.call(dj);
