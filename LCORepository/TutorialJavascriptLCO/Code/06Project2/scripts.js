const red =document.querySelector(".red");
const cyan =document.querySelector(".cyan");
const violet =document.querySelector(".violet");
const orange =document.querySelector(".orange");
const pink =document.querySelector(".pink");

const center =document.querySelector(".center");

console.log(window.getComputedStyle(red).background);
console.log(window.getComputedStyle(red).backgroundColor);

count=1;
setInterval(() => {
    if(count<400){
        count++;
        var holderBGColor=window.getComputedStyle(red).backgroundColor;
        red.style.backgroundColor=window.getComputedStyle(cyan).backgroundColor;
        cyan.style.backgroundColor=window.getComputedStyle(violet).backgroundColor;
        violet.style.backgroundColor=window.getComputedStyle(orange).backgroundColor;
        orange.style.backgroundColor=window.getComputedStyle(pink).backgroundColor;
        pink.style.backgroundColor=holderBGColor;
    }
    
}, 500);

red.addEventListener("mouseenter", ()=>{
    center.style.backgroundColor=window.getComputedStyle(red).backgroundColor;
});

cyan.addEventListener("mouseenter", ()=>{
    center.style.backgroundColor=window.getComputedStyle(cyan).backgroundColor;
});

violet.addEventListener("mouseenter", ()=>{
    center.style.backgroundColor=window.getComputedStyle(violet).backgroundColor;
});

orange.addEventListener("mouseenter", ()=>{
    center.style.backgroundColor=window.getComputedStyle(orange).backgroundColor;
});

pink.addEventListener("mouseenter", ()=>{
    center.style.backgroundColor=window.getComputedStyle(pink).backgroundColor;
});


