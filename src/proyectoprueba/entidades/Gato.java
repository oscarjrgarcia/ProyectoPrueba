package proyectoprueba.entidades;


public class Gato {
    private String nombre;
    private Integer edad;

    public Gato() {
    }

    public Gato(String nombre, Integer edad) {
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
        return "Gato{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void maullar(){
        System.out.println(nombre+" está maullando:");
        System.out.println("MIAUUU");
    }
}
