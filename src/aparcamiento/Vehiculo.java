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
public class Vehiculo {

    protected String matricula, modelo, color, telefono, nif;

    public Vehiculo(String matricula, String nif) {
        this.matricula = matricula;
        this.nif = nif;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getTeléfono() {
        return telefono;
    }

    public String setTelefono(String telefono) {
        String resultado = "Telefono incorrecto";
        if (telefono.length() == 9) {
            resultado = "Telefono añadido";
            this.telefono = telefono;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Datos vehícluo: " + matricula + " " + modelo + " " + color;
    }
}
