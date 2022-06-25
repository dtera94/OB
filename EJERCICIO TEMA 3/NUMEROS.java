package ParteUno;

public class Numeros {
    public static void main (String [] args){
        suma(3, 5, 2);
    }

    public static void suma(int numero1, int numero2, int numero3){
        int valorFinal = numero1 + numero2 + numero3;
        System.out.println(valorFinal);
    }
}