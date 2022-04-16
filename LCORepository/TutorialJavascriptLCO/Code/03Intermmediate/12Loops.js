const myStates=["Rajasthan",
                "Delhi",
                "Assam",
                1947,
                "Odisha",
                "Kerala"];

for (let i=0;i<myStates.length;i++){
    if(typeof myStates[i]!=="string")
        continue;
    console.log(myStates[i]);
}

let i=0;
console.log("====WHILE LOOP====");
while(i<myStates.length){
    console.log(myStates[i]);
    i++;
}

