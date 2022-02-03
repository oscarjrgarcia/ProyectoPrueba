package proyectoprueba.entidades;


public class Canario {
    private String nombre;
    private Integer edad;

    public Canario() {
    }

    public Canario(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Canario{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void cantar(){
        System.out.println(nombre+" está cantando:");
        System.out.println("Piooo pioooo");
    }
}
