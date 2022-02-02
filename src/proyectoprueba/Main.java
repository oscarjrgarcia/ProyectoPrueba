
package proyectoprueba;

import proyectoprueba.entidades.Gato;
import proyectoprueba.entidades.Persona;


public class Main {

 
    public static void main(String[] args) {
        Persona p = new Persona("Javier", "Fernandez", 32);
        Gato g = new Gato("Michi", 2);
        
        p.cantar();
        g.maullar();
    }

}
