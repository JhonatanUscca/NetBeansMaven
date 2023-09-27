/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serializable;


public class Personabean implements Serializable {
    private String primerNombre, segundoNombre, primerApellido, segundoApellido;
    
    public String getPrimerNombre(){
        return primerNombre;       
    }
    
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre(){
        return segundoNombre;       
    }
    
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    
    public String getPrimerApellido() {
        return primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }    

    
    public boolean validacion() {
        if (primerNombre.equals("Jhonatan") && segundoNombre.equals("Bilbao") && primerApellido.equals("Uscca") && segundoApellido.equals("Giraldo") ) {
            return true;
        } else {
            return false;
        }
    }
}
