// let firstName='Sayaan';
// if (firstName=='Sayaan'){
//     console.log(`Welcome ${firstName} to our website`)
// }
// let color="red";
// if(color==="red"){
//     console.log(`the color is ${color} now you must wait`)
// }

// let size="S";
// if(size==="XL"){
//     console.log(`the price for the Popcorn of size ${size} is Rupees 250`)
// }else if(size==="L"){
//     console.log(`the price for the Popcorn of size ${size} is Rupees 150`)
// }else if(size==="M"){
//     console.log(`the price for the Popcorn of size ${size} is Rupees 100`)
// }else if(size==="S"){
//     console.log(`the price for the Popcorn of size ${size} is Rupees 50`)
// }

//nested if-else
// let days=3;
// switch(days){
//     case 1:console.log("Monday");
//     break;
//     case 2:console.log("Tuesday");
//     break;
//     case 3:console.log("wednesday");
//     break;
//     case 4:console.log("Thursday") ;
//     break;
//     default:console.log("no time left")
// }

//nested if-else
// if(marks>=45){
//     console.log("pass")
//     if(marks>=80){
//         console.log("Outstanding")
//     }else{
//         console.log('grade :A')
//     }
// }else{
//     console.log("better luck next time")
// }

let marks=32;
if((marks>33 && marks>=80) || !false){
    console.log("you are passed")
}

let num=12;
if((num%3===0) && ((num+1==15 || num-1==11))){
    console.log('safe')
}else{
    console.log("unsafe")
}