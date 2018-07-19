var Tchatte = {
    username: '',
    connect : function(){
        var self = this;
        this.username= $('form input[type="text"]').val();
        $('#body1').remove();

        $.ajax({
            url: 'index.html',
            dataType: 'html',
            success: function(r,s){
                $('body').html(r);
                $('#pseudos').append('<li>'+self.username+'</li>');
            }
            
        })             
    },

    postMessage : function(){
        var message = $('form input[type="text"]').val();
        $('#mes').append('<li>'+message+'</li>');
        $('form input[type="text"]').val("");
        }
}