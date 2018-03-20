package agenda;

import java.util.ArrayList;

/**
 *
 * @author Jairo
 */
public class Contacto {
    //Atributos
    private String nombre;
    private String apellidos;
    private int numero;
    private String direccion;
    private String descripcion;
    
    public Contacto(String nombre, String apellidos, int numero, String direccion, String descripcion){
        setNombre(nombre);
        setApellidos(apellidos);
        setNumero(numero);
        setDireccion(direccion);
        setDescripcion(descripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if(apellidos != null && !apellidos.isEmpty()){
            this.apellidos = apellidos;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero > 600000000){
            this.numero = numero;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        
            this.direccion = direccion;
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        
            this.descripcion = descripcion;
        
    }
    
    public String datosContacto(){
        return "Nombre: "+getNombre()+"\nApellidos: "+getApellidos()+"\nNumero: "+
                getNumero()+"\nDireccion: "+getDireccion()+"\nNotas: "+getDescripcion();
    }
}
