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
    private char tipo;

    public Plaza(int num_plaza, int sotano) {
        this.num_plaza = num_plaza;
        this.sotano = sotano;
    }

    public int precio() {
        int resultado = 0;
        if (v != null) {
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (c.getTipo().equalsIgnoreCase("largo")) {
                    resultado = 55;
                } else {
                    resultado = 40;
                }
            } else {
                resultado = 25;
            }
            if (sotano >= 2) {
                resultado = resultado - 5;
            }
        } else {
            resultado = 0;
        }
        return resultado;
    }
    
    @Override
    public String toString(){ 
        String resultado="Nº Plaza: "+num_plaza+"  Sotano: "+sotano+"\n";
        if(v!=null){
            resultado=resultado.concat(v+"\n"+"Precio= "+precio()+" euros");
        }
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

    public char getTipo() {
        return tipo;
    }

    public String setTipo(char tipo) {
        String resultado = "";

        if (tipo=='c' || tipo=='m' || tipo=='C' || tipo=='M') {
            resultado = "Tipo añadido";
            this.tipo = tipo;
        } else {
            resultado = "Tipo incorrecto";
        }
        return resultado;
    }

}
