
    let queueNumber = 0001;
    
    let  queue = [];

    let lastNumber = queue[queue.length-1];

    let nowServing = queue[0];

    
window.onclick = myFunction;

function myFunction() {
    
        document.getElementById("demo").innerHTML = "Your number is: " + queueNumber;
        document.getElementById("demo1").innerHTML = "Now Serving: " + queue[0] ;
        document.getElementById("demo2").innerHTML = "Last number: " + queue[queue.length-1];

        queue.push(queueNumber);
        queueNumber++;
        console.log(queue);  
        
   
        
}  




function greyColor(){
    document.querySelector("span.b").style.backgroundColor = "grey";
}

function isOnline(){
    
    const offline = greyColor();
    document.querySelector("#offlineOnline").innerText = "Go Online";
    
    if (offline = true){
    document.querySelector("#offlineOnline").innerText = "Go Online";
    }
        else{
     
        document.querySelector("#offlineOnline").innerText = "Go Offline";
        }
    }

    
function compCurr(){

    document.querySelector(".circle").style.backgroundColor = "green";
    queue.pop();

}

function callNext(){

const next = compCurr();

if (next = true){
    document.querySelector(".display").innerText= queue[0];
}

}



    
    
    
  
console.log(greyColor);
console.log(document.querySelector("#offlineOnline").innerText = "Go Online")
    
 

