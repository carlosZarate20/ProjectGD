$("#docValues").on("submit", function (event){
	event.preventDefault();
		
	sendDoc();    
});

function sendDoc(){
    var docIdentificador = $('#documento').val();

    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: '/getDoc',
        data: JSON.stringify({
            docIdentidad: docIdentificador
        }),
        success: function(response){
            if(response && response.isValid == 1){
                alert(response.respuestaBaseCampana);
                console.log("Respuesta: ", response.respuestaBaseCampana);
            }
            if(response && response.isValid == 0){
                alert(response.respuestaReniec);
                console.log("Respuesta: ", response.respuestaReniec);
            }
            if(response && response.isValid == 2){
                alert(response.respuestaRcc);
                console.log("Respuesta: ", response.respuestaRcc);
            }
            if(response && response.isValid == 3){
                alert(response.respuestaRuc);
                console.log("Respuesta: ", response.respuestaRuc);
            }
            if(response && response.isValid == 4){
                alert(response.respuestaRccAndRuc);
                console.log("Respuesta: ", response.respuestaRccAndRuc);
            }
            if(response && response.isValid == 5){
                alert(response.respuestaGeneral);
                console.log("Respuesta: ", response.respuestaGeneral);
            }
        },error: function(e) {
            mostrarAlerta('Error!!!.');
            console.log(e);
        }
    });
}