//Declaración de variables globales.
let valorEnPantalla = "";
let operando1 = null;
let operando2 = null;
let operador = ""; //Puede ser +, -, *, /

//Función que se ejecuta al pulsar el botón "C". Se resetean las variables y el display
function resetearCalculadora() {
    resetearVariables();
    actualizarDisplay();
}

//Función que reinicializa los valores de las variables a su estado original.
function resetearVariables() {
    // **TODO: ** Resetear el valor de las variable `valorEnPantalla`
    valorEnPantalla = ""
    // **TODO: ** Resetear el valor de las variable `operando1`
    operando1 = null;
    // **TODO: ** Resetear el valor de las variable `operando2`
    operando2 = null;
    // **TODO: ** Resetear el valor de las variable `operador`
    operador = ""
}

//Función que actualiza el display (pantalla) de la calculadora.
function actualizarDisplay() {
    // **TODO: ** Asignarle al elemento HTML "display" el valor de la variable `valorEnPantalla`
}

//Función que se ejecuta cuando se pulsa en un número. Agrega el número pulsado al número que hay en el display
function agregarNumero(symbol) {
    // **TODO: ** Concatenar al valor de la variable `valorEnPantalla` el número que se ha pulsado (variable `symbol`). Por ejemplo, si en display había un "3" y se pulsa "5", que ahora se muestre "35"
    // **TODO: ** Actualizar el display
}

//Función que se ejecuta cuando pulsa en un operador (+, -, *, /). Copia lo que hay en el display a la variable `operador1` y se prepara para pedir el operador2
function operadorPulsado(symbol) {
    // ** TODO: ** Asignarle a la variable `operando1` el valor de la variable `valorEnPantalla`. Ten en cuenta que `operando1` es de tipo numérico y `valorEnPantalla` de texto
    // ** TODO: ** Asignarle a la variable `operador` el operando pulsado, que está almacenado en la variable `symbol`
    // ** TODO: ** Resetear el valor de la variable `valorEnPantalla`
}

//Función que se ejecuta cuando se pulsa el botón calcular (=). Muestra el resultado en el display
function calcular() {
    //PISTA: Fíjate que los comentarios están tabulados. Eso quiere decir hay código dentro de alguna estructura. Borra esta línea también

    // ** TODO ** Controlar que el código de esta función solo se ejecute si la variable `operando1` tiene algún valor, es decir, si es distinto de "null"
        // ** TODO ** Asignarle a la variable `operando2` el valor de la variable `valorEnPantalla`
        // ** TODO ** Usar una estructura "según" o "switch" para que haga una operación u otra según el valor de la variable `operador`
            // ** TODO ** Caso de que el operador sea "+":
                // ** TODO ** Que sume los dos operandos y el resultado se guarde en la variable `valorEnPantalla`
            // ** TODO ** Caso de que el operador sea "-": 
                // ** TODO ** Que al operando1 se le reste operando2 y el resultado se guarde en la variable `valorEnPantalla`
            // ** TODO ** Caso de que el operador sea "*": 
                // ** TODO ** Que multiplique los operandos y el resultado se guarde en la variable `valorEnPantalla`
            // ** TODO ** Caso de que el operador sea "/": 
                // ** TODO ** Que al operando1 se le divida el operando2 y el resultado se guarde en la variable `valorEnPantalla`
                // ** TODO (varias líneas) ** Controlar que la división no se haga si `operando2` es "0" y mostrar un mensaje que diga "¡No se puede dividir entre 0!" en el display
                
        // ** TODO ** Llegados aquí, la operación ya debe estar hecha y almacenada en `valorEnPantalla`. Actualizar el display llamando a la función que lo hace
        // ** TODO ** Llegados aquí, el resultado ya debe mostrarse en el display. Resetear las variables llamando a la función que lo hace. 