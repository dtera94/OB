//Crea una clase Persona con las siguientes variables:
//
//La edad ok
//
//El nombre ok
//
//El teléfono ok
//
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase.
//
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
// el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
// y con una variable salario que solo tenga la clase Trabajador.


public class Main {
    public static void main(String[] args) {
        Cliente usuario = new Cliente();
        usuario.Nombre = "daniel";
        usuario.Edad = 27;
        usuario.Telefono = 1234567890;
        usuario.credito = 1234;

        System.out.println("Me llamo "+ usuario.Nombre + ", tengo " + usuario.Edad + "años y mi numero de telefono es: " + usuario.Telefono + " y mi crédito es de: " + usuario.credito);

        Trabajador Trabajador1 = new Trabajador();
        Trabajador1.Nombre = "daniel";
        Trabajador1.Edad = 27;
        Trabajador1.Telefono = 1234;
        Trabajador1.salario = 600;

        System.out.println("Me llamo "+ Trabajador1.Nombre + ", tengo " + Trabajador1.Edad + "años y mi numero de telefono es: " + Trabajador1.Telefono + " y mi salario es de: " + Trabajador1.salario);

    }
}

class Persona {
    int Edad;
    String Nombre;
    int Telefono;
}

class Cliente  extends Persona {
    int credito;

}

class Trabajador extends Persona {
    int salario;
}