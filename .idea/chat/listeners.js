$('body').on('submit', 'form', function(){
    if(this.id == 'formLogin'){
        Tchatte.connect();
        return false;
    }else{
        Tchatte.postMessage();
        return false;
    }
})