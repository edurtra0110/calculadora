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
 
    valorEnPantalla = "";
    
    operando1 = null;
   
    operando2 = null;
 
    operador = ""; //Puede ser +, -, *, /
}

//Función que actualiza el display (pantalla) de la calculadora.
function actualizarDisplay() {
    document.getElementById("display").innerHTML= valorEnPantalla;
}

//Función que se ejecuta cuando se pulsa en un número. Agrega el número pulsado al número que hay en el display
function agregarNumero(symbol) {
     valorEnPantalla = valorEnPantalla + symbol;
       actualizarDisplay();
}

//Función que se ejecuta cuando pulsa en un operador (+, -, *, /). Copia lo que hay en el display a la variable `operador1` y se prepara para pedir el operador2
function operadorPulsado(symbol) {
    operando1 = parseInt(valorEnPantalla);
      operador = symbol;
        valorEnPantalla ="";
}

//Función que se ejecuta cuando se pulsa el botón calcular (=). Muestra el resultado en el display
function calcular() {
    //PISTA: Fíjate que los comentarios están tabulados. Eso quiere decir hay código dentro de alguna estructura. Borra esta línea también

    // ** TODO ** Controlar que el código de esta función solo se ejecute si la variable `operando1` tiene algún valor, es decir, si es distinto de "null"
     if (operador != ""){
         
       switch(operador) {
             case "+":
               valorEnPantalla = operando1 + operando2;
                 break;
             case "-":
                valorEnPantalla = operando1 - operando2;
                 break;
             case "*":
                 valorEnPantalla = operando1 * operando2;
                 break;
             case "/":
                 valorEnPantalla = operando1 / operando2;
                 break;
       }
     }
         
                // ** TODO (varias líneas) ** Controlar que la división no se haga si `operando2` es "0" y mostrar un mensaje que diga "¡No se puede dividir entre 0!" en el display
                
        // ** TODO ** Llegados aquí, la operación ya debe estar hecha y almacenada en `valorEnPantalla`. Actualizar el display llamando a la función que lo hace
               actualizarDisplay();
        // ** TODO ** Llegados aquí, el resultado ya debe mostrarse en el display. Resetear las variables llamando a la función que lo hace. 
               resetearVariables();
} 
