package proyectoprueba.entidades;


public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    public boolean esMayor(){
        return edad >= 18;
    }
    
    public void cantar(){
        System.out.println(nombre+" está cantando:");
        System.out.println("La cucaracha, la cucaracha. Ya no puede caminar...");
    }
}
