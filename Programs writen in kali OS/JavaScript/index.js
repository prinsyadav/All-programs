let count = 0;

function increment(count){
    count = count +1;
    return count;
}

// console.log(count)
increment(5);

setTimeout(() => {
    console.log("Hello")
}, 4000);
