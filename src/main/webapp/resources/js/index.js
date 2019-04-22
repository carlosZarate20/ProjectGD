$("#docValues").on("submit", function (event){
	event.preventDefault();
		
	sendDoc();    
});

function sendDoc(){
    var docIdentificador = $('#documento').val();
    var htmlValue = "";
    $('#file_error').css('display', 'none');
    $('#file_correct').css('display', 'none');

    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: getContextPath() + '/getDoc',
        data: JSON.stringify({
            docIdentidad: docIdentificador
        }),
        success: function(response){
            if(response && response.isValid == 1){
                $('#file_error').css('display', 'inline-block');
                htmlValue = response.respuestaBaseCampana;
                $('#info').html(htmlValue);

            }
            if(response && response.isValid == 0){
                $('#file_error').css('display', 'inline-block');
                htmlValue = response.respuestaReniec;
                $('#info').html(htmlValue);
            }
            if(response && response.isValid == 2){
                $('#file_error').css('display', 'inline-block');
                htmlValue = response.respuestaRcc;
                $('#info').html(htmlValue);
            }
            if(response && response.isValid == 3){
                $('#file_error').css('display', 'inline-block');
                htmlValue = response.respuestaRuc;
                $('#info').html(htmlValue);
            }
            if(response && response.isValid == 4){
                $('#file_error').css('display', 'inline-block');
                htmlValue = response.respuestaRccAndRuc;
                $('#info').html(htmlValue);
            }
            if(response && response.isValid == 5){
                $('#file_correct').css('display', 'inline-block');
                htmlValue = response.respuestaGeneral;
                $('#info').html(htmlValue);
            }
        },error: function(e) {
            mostrarAlerta('Error!!!.');
            console.log(e);
        }
    });
}