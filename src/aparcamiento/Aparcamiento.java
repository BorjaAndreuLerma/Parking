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
public class Aparcamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1=new Coche("largo","4y6gg3","fg334f");
        System.out.println(c1.setTipo("wthbdfv"));
        System.out.println(c1);
        Vehiculo v1=new Vehiculo("frqwf","ewfge");
        v1.setTelefono("65724");
        System.out.println(v1.telefono);
        v1.setTelefono("123456789");
        System.out.println(v1.telefono);
    }
    
}
