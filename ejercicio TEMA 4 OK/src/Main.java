public class Main {
    public static void main(String[] args) {

        // CASO NUMERO 1
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo,
        // negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        System.out.println("caso 1" + "\n");

        int numeroIf = 4;
        if(numeroIf == 0) {
            System.out.println("El numero es 0");
        } else if(numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        // CASO NUMERO 2
        //Crea un bucle While, este bucle tendrá que tener como condición que la variable
        // numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //
        //Mostrarlo por pantalla cada vez que se ejecute.
        System.out.println("caso 2" + "\n");

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // CASO NUMERO 3
        //Para el bucle Do While, deberás crear la misma estructura que en el While,
        // pero solo se debe ejecutar una vez.

        System.out.println("caso 3" + "\n");

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);


        // CASO NUMERO 4
        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y
        // su condición será que la variable sea igual o menor que 3,
        // se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        System.out.println("caso 4" + "\n");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // CASO NUMERO 5
        //Por último, para el Switch, deberás crear la variable estacion, y
        // distintos case para las cuatro estaciones del año.
        // Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
        // informando de la estación en la que está.
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.
        System.out.println("caso 5" + "\n");

        String estacion = "INVIERNO";
        switch (estacion) {
            case "VERANO":
                System.out.println("ES VERANO");
                break;
            case "PRIMAVERA":
                System.out.println("ES PRIMAVERA");
                break;
            case "OTOÑO":
                System.out.println("ES OTONO");
                break;
            case "INVIERNO":
                System.out.println("ES INVIERNO");
                break;
            default:
                System.out.println("NO ES UNA ESTACION");
                break;
        }


    }
}