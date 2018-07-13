tab1 = [1, 2 , 3, 4, 5, 6, 7, 8, 9, 10];

function montrer(tab){
    var tab = tab1;
    for(var i=0; i<10; i++){
        document.write(tab[i]+ " ");
    }
document.write("<br/>");
}

function sum(tab){
    var tab=tab1;
    var suma = 0;
    for(var i=0; i<10; i++){
        suma=suma+tab[i];
    }
    document.write(suma);
}

function maxi(tab){
    var tab = tab1;
    var vmax=tab1[0];
    for(var i=1; i<10; i++){
        if(vmax<tab[i]){
            vmax=tab[i];
        }else{
            vmax=vmax;
        }
    }
    document.write(vmax);

}

function avg(tab){
    var tab = tab1;
    var suma = 0;
    for(var i=0; i<10; i++){
        suma=suma+tab[i];
    }
    var moy = suma/10;
    document.write(moy);
}

function isPrimeNumber(x){
    var bool = true;
    for (var j =2; j <x; j++){
        if(x%j==0){
            bool = false;
            break;
        }
    }
    return bool;
}

function getPrimeNumber(tab){
    var tab =tab1;
    var tab2 = new Array();
    for(var i=0;i<tab1.length;i++) {
            if(isPrimeNumber(tab1[i])){
            tab2.push(tab1[i]) ;
            }
            
    }
    document.write (tab2);
       
}

function getPrimeNumber2(tab){
    var tab=tab1;
    var res = new Array();
    res = tab1.filter(isPrimeNumber);
    document.write (res);
} 
    
function manageForm() {
    var title = document.forms["myForm"].elements["titleBox"].value;
    var price = document.forms["myForm"].elements["priceBox"].value;
    alert(title + " " + price);
}

function checkprice(){
    var price = document.forms["myForm"].elements["priceBox"].value;
    var bool =isNaN (price);
    if(bool){
        alert("Le prix est incorrect");
    }
}

function toggleVisible() {
   element = document.getElementsByClassName("Leprixestincorrect")[0];
       var price = document.forms["myForm"].elements["priceBox"].value;
       var bool =isNaN (price);
       if(bool) {
           element.style.visibility = "visible";
       }
       else {
            element.style.visibility = "hidden";
       }
   }

   button5.addEventListener("click", getPrimeNumber);
   document.getElementById("button6").addEventListener("click", getPrimeNumber2);
    document.getElementsByName("priceBox")[0].addEventListener("input", toggleVisible);

   