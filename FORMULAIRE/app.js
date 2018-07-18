var Formulaire = {
    values : {
        name: '',
        email : '',
        metier : 0
    },
    soumission : function(id){
        var self = this;
        
        if(id == 'form1'){
            if($('#name').val() == ''|| $('#email').val() == ''){
                alert('Veuillez remplir tous les champs du formulaire')
            }
            else{
                $('.active').removeClass('active');
                $('ul li:nth-child(2)').addClass('active');
                this.values.name = $('#name').val();
                this.values.email = $('#email').val();
                $.ajax({
                    url : 'ajax/form2.html',
                    type : 'POST',
                    data : '',
                    dataType : 'html',
                    success : function (results, status){
                        $('#contentForm').html(results);
                    },
                    error : function (results, status, code){
                        alert('ko');
                    },
                    complete : function (results, status){

                    }
                })
            }
        }
        else{
            $('.active').removeClass('active');
            $('ul li:nth-child(3)').addClass('active');
            this.values.metier = $('#metier option:selected').text();
            $.ajax({
                url : 'ajax/final.html',
                type : 'POST',
                data : '',
                dataType : 'html',
                    success : function (results, status){
                     $('#contentForm').html(results);
                     $('#infoMessage').text('Vous vous appelez '+ self.values.name + ', votre adresse email est '+ self.values.email+ ' et vous etes ' + self.values.metier+' ')
                    },
                    error : function (results, status, code){
                        alert('ko');
                    },
                    complete : function (results, status){

                    }
                })
            }

        }
    }

    $('#contentForm').on('submit', 'form', function(){
    Formulaire.soumission(this.id);
    return false;
})