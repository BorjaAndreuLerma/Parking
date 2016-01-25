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
        Coche c1 = new Coche("corto", "4y6gg3", "fg334f");
        Moto m1 = new Moto("fegef", "5464");
        System.out.println(c1.setTipo("wthbdfv"));
        System.out.println(c1);
        Vehiculo v1 = new Vehiculo("frqwf", "ewfge");
        v1.setTelefono("65724");
        System.out.println(v1.telefono);
        v1.setTelefono("123456789");
        System.out.println(v1.telefono);
        Plaza p1 = new Plaza(201, 2);
        Plaza p2 = new Plaza(101, 1);
        System.out.println("__________________");
        p1.setV(m1);
        p2.setV(m1);
        System.out.println("______________");
        System.out.println(p1.setTipo('c'));
        System.out.println(p1.setTipo('C'));
        System.out.println(p2.setTipo('t'));
        
        System.out.println(p1.precio());
        System.out.println(p2.precio());
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }

}
