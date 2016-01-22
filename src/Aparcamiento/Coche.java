package Aparcamiento;

public class Coche extends Vehiculo{
    private String tipo;

    public Coche(String tipo, String matricula, String dni) {
        super(matricula, dni);
         if(tipo.equalsIgnoreCase("Corto")||tipo.equalsIgnoreCase("Largo")){
            this.tipo = tipo;
        } 
    }

    public String getTipo() {
        return tipo;
    }

    public String setTipo(String tipo) {
        String resultado="";
        if(tipo.equalsIgnoreCase("Corto")||tipo.equalsIgnoreCase("Largo")){
            resultado="Tipo añadido";
            this.tipo = tipo;
        }else {
            resultado="Tipo incorrecto";
        }
        return resultado;
    }   
    
}
