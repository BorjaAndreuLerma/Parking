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
public class Moto extends Vehiculo{
    private int num_ruedas;

    public Moto(String matricula, String nif) {
        super(matricula, nif);
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }
    
    
}
