/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

/**
 *
 * @author daw1
 */
public class Coche extends Vehiculo{
    private String tipo;

    public Coche(String tipo, String matricula, String nif) {
        super(matricula, nif);
         if(tipo.equalsIgnoreCase("corto")||(tipo.equalsIgnoreCase("largo"))){      
            this.tipo = tipo;
        } 
    }

    public String getTipo() {
        return tipo;
    }

    public String setTipo(String tipo) {
        String resultado="";       
        if(tipo.equalsIgnoreCase("corto")||(tipo.equalsIgnoreCase("largo"))){
            resultado="Tipo añadido"; 
            this.tipo = tipo;
        } else {
            resultado="Tipo incorrecto";
        }
        return resultado;
    }
        
}
