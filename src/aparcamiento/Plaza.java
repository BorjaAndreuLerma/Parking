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
public class Plaza {
    private Vehiculo v;
    private int num_plaza, sotano;
    private String tipo;

    public Plaza(int num_plaza, int sotano) {
        this.num_plaza = num_plaza;
        this.sotano = sotano;
    }
    
    public int precio(){
        int resultado=0;
        
        return resultado;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public int getNum_plaza() {
        return num_plaza;
    }

    public void setNum_plaza(int num_plaza) {
        this.num_plaza = num_plaza;
    }

    public int getSotano() {
        return sotano;
    }

    public void setSotano(int sotano) {
        this.sotano = sotano;
    }

    public String getTipo() {
        return tipo;
    }

    public String setTipo(String tipo) {
        String resultado="";
       
        if(tipo.equalsIgnoreCase("c")||(tipo.equalsIgnoreCase("m"))){
            resultado="Tipo añadido"; 
            this.tipo = tipo;
        } else {
            resultado="Tipo incorrecto";
        }
        return resultado;
    }
    
    
}
