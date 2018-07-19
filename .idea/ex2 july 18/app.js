var bool=true;

$("a").on('click',function(){
    if(bool){
     $.ajax({
        url: "content.html", 
        type: 'POST',
        data: '',
        dataType: 'html',

        success: function(results, status){
            $('#content').html(results)
        }  
    
    }),
    $("a").text('Cacher le contenu');
    bool = false;
    }
    else{
        $("a").text('Afficher le contenu');
        $('#content').text("");  
        bool = true;
    }
})