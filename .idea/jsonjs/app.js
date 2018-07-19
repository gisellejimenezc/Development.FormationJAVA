$.ajax({
    url : 'data.json',
    dataType : 'json',
    success : function(result, status){
        var listEleves = result;

        for(var i = 0;i<listEleves.length;i++){
            var tableau= listEleves[i].notes;
            var moy = moyenne(tableau);
            $('body').append('<div>' + listEleves[i].prenom + ' ' + listEleves[i].nom + ' ' + moy +'</div>');
        }
             
    }
})

function moyenne(tab){
    var sum = 0;
        for (var i=0; i<tab.length; i++){
        sum += tab[i];
    }
    var media = sum/tab.length;
    return media;
}