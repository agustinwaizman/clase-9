public class App {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setEdad(23);
        cliente.setNombre("Agustin");
        cliente.setTelefono("3624680121");
        System.out.println("la edad es: " + cliente.getEdad());
        System.out.println("el nombre es: " + cliente.getNombre());
        System.out.println("el telefono es: " + cliente.getTelefono());
        System.out.println("su credito es: $" + cliente.credito);
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(27);
        trabajador.setNombre("Franco");
        trabajador.setTelefono("362526321");
        System.out.println("la edad es: " + trabajador.getEdad());
        System.out.println("el nombre es: " + trabajador.getNombre());
        System.out.println("el telefono es: " + trabajador.getTelefono());
        System.out.println("su salario es: $" + trabajador.salario);
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
class Cliente extends Persona {
    int credito = 1000;
}
class Trabajador extends Persona {
    int salario = 4000;
}


// Crea una clase Persona con las siguientes variables:
// La edad
// El nombre
// El teléfono
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.