package Aparcamiento;

public class Vehiculo {
    protected String matricula, modelo, color, telefono, dni;
    

    public Vehiculo(String matricula, String dni) {
        this.matricula = matricula;
        this.dni = dni;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String setTelefono(String telefono) {
        String resultado="Telefono incorrecto";
        if (telefono.length()==9){
            this.telefono=telefono;
            resultado="Telefono añadido";
        }
        return resultado;
    }
    
    @Override
    public String toString(){
      return "Datos vehículo: "+matricula+" "+modelo+" "+color;
}
}
