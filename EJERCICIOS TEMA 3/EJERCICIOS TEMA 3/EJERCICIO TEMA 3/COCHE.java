public class Coche {
    public static Integer puertas;

    public static void incrementar(){
        while(puertas = 3){
            puertas ++;
        }
    }

    public static void main(String[] args){
        Coche miCoche = new Coche();

        miCoche.puertas = 1;

        incrementar();

        System.out.println("¿cuantas puertas tiene el coche? : " + puertas);
    }
}
