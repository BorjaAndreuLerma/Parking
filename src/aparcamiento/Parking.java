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
import java.text.*;
import java.util.*;

public class Parking {

    private String nombreParking, direccion;
    private Map<Integer, Plaza> ListaPlazas = new HashMap<>();

    public Parking(String nombreParking) {
        this.nombreParking = nombreParking;
        Plaza p1 = new Plaza(1, 1);
        p1.setTipo('c');
        ListaPlazas.put(11, p1);
        Plaza p2 = new Plaza(2, 1);
        p2.setTipo('c');
        ListaPlazas.put(12, p2);
        Plaza p3 = new Plaza(3, 1);
        p3.setTipo('c');
        ListaPlazas.put(13, p3);
        Plaza p4 = new Plaza(4, 1);
        p4.setTipo('c');
        ListaPlazas.put(14, p4);
        Plaza p5 = new Plaza(1, 2);
        p5.setTipo('c');
        ListaPlazas.put(21, p5);
        Plaza p6 = new Plaza(2, 2);
        p6.setTipo('c');
        ListaPlazas.put(22, p6);
        Plaza p7 = new Plaza(3, 2);
        p7.setTipo('c');
        ListaPlazas.put(23, p7);
        Plaza p8 = new Plaza(4, 2);
        p8.setTipo('c');
        ListaPlazas.put(24, p8);
    }

    public String alquilar(Vehiculo v) {
        String resultado = "";
        if (v instanceof Coche) {
            Iterator<Integer> it=ListaPlazas.keySet().iterator()
                    while(it.hasNext()){
                        Integer clave=it.next();
                        Plaza valor=ListaPlazas.get(clave);                        
                    }
        }
        return resultado;
    }

    public String getNombreParking() {
        return nombreParking;
    }

    public void setNombreParking(String nombreParking) {
        this.nombreParking = nombreParking;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map<Integer, Plaza> getListaPlazas() {
        return ListaPlazas;
    }

    public void setListaPlazas(Map<Integer, Plaza> ListaPlazas) {
        this.ListaPlazas = ListaPlazas;
    }
}
