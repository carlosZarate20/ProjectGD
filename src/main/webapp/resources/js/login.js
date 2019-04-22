$("#loginValues").on("submit", function (event){
	event.preventDefault();
	login();    
});

function login(){
    if (!validateLogin()) {
        return;
    }

    var usuario = $('#username').val();
    var contrasena = $('#password').val();

    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: '/login',
        data: JSON.stringify({
            userName: usuario,
            password: contrasena
        }),
        success: function(response){
            if(response && response.successful){
            	location.href = getContextPath() + '/index';
                console.log("Inicio de session correcto con el usuario: ", usuario);
            }else {
                mostrarAlerta(response.message);
            }
        },error: function(e) {
            mostrarAlerta('Error!!!.');
            console.log(e);
        }
    });
}

function validateLogin(){
    var usuario = $('#username').val();
    var password = $('#password').val();

    if(usuario == 0){
        mostrarAlerta('Ingrese un usuario.');
		return false;
    }

    if (password == 0) {
        mostrarAlerta('Ingrese una contrase\u00F1a.');
		return false;
	}

    return true;
}

function cerrarAlerta() {
	$('#alertMessage').fadeOut();
}

function mostrarAlerta(mensaje) {
	$('#alertMessage').fadeOut();
	$('#alertMessage').text(mensaje);
	$('#alertMessage').fadeIn();
}

function getContextPath() {
    return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
}