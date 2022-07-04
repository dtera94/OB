public class Main {
    public static void main(String[] args) {

        persona persona = new persona();
        persona.setEdad ();
        persona.getNombre ("paco");
        persona.setTelefono (43033);

        System.out.println(persona.setEdad());
        System.out.println(persona.getNombre("paco"));
        System.out.println(persona.setTelefono(43033));


    }
}
//Para practicar la encapsulación:
//
//Crear clase Persona. ok
//
//Crear variables las privadas edad, nombre y telefono
// de la clase Persona.  ok
//
//Crear gets y sets de cada propiedad.
//
//Crear un objeto persona en el main.
//
//Utiliza los gets y sets para darle valores a las propiedades edad,
// nombre y telefono, por último muéstralas por consola.


class persona {
    private int Edad;
    private String Nombre;
    private int Telefono;

    public int setEdad() {
        this.Edad = setEdad();
        return Edad;
    }
    public String getNombre (String nombre){
        return Nombre;
    }
    public int setTelefono (int Telefono) {
        this.Telefono = setTelefono(43033);
        return Telefono;
    }

}





