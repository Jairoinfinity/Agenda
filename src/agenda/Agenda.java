package agenda;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author EAG
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contacto h = new Contacto("Ana","Bernal Caceres",666666666,"Calle falsa","Nota");
        
        
        HashMap<String, Contacto> contacto = new HashMap();


        contacto.put("Ana",h);
        contacto.put("Jairo",h);
        System.out.println(contacto.get("Jairo").datosContacto());
    }
    
}
