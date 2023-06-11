import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
* En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/
public class Main {
    public static void main(String[] args) {
        positivoNegativo(-1);

        int numeroWhile = 0;
        while ( numeroWhile <= 3) {
            System.out.println("Incrementando el numero a " + numeroWhile);
            numeroWhile++;
        }

        int contador = 0;
        do {
            contador++;
            System.out.println("Desde la funcion doWhile " + contador);
        } while (contador < 1);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Incrementando desde el for, " + numeroFor);
        }

        utilizandoSwitch("verano");
        utilizandoSwitch("InVierno");

    }
    public static void positivoNegativo(int numero) {
        if (numero < 0) {
            System.out.println("El numero es Negativo");
        } else if (numero > 0) {
            System.out.println("El numero es Positivo");
        } else {
            System.out.println("El numero es 0");
        }
    }

    public static void utilizandoSwitch(String estacion) {
        switch (estacion) {
            case "verano":
                System.out.println("Estamos en Verano, sobra un poco de ropa!");
                break;
            case "primavera":
                System.out.println("Estamos en Primavera que la sangre altera!!");
                break;
            case "invierno":
                System.out.println("Estamos en Invierno, abrigate!");
                break;
            case "otoño":
                System.out.println("Estamos en Otoño!");
                break;
            default:
                System.out.println("Elige una estacion del año correcta, sin mayusculas.");
                break;
        }
    }
}