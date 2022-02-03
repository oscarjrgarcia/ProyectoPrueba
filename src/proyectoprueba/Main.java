
package proyectoprueba;

import proyectoprueba.entidades.Canario;
import proyectoprueba.entidades.Gato;
import proyectoprueba.entidades.Persona;


public class Main {

 
    public static void main(String[] args) {
        Persona p = new Persona("Javier", "Fernandez", 32);
        Gato g = new Gato("Michi", 2);
        Canario c = new Canario("Piolin", 1);
        
        p.cantar();
        g.maullar();
        c.cantar();
    }

}
