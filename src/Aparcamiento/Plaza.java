package Aparcamiento;

public class Plaza{
    private Vehiculo v;
    private int num_plaza, sotano;
    private String tipo;

    public Plaza(int num_plaza, int sotano) {
        this.num_plaza = num_plaza;
        this.sotano = sotano;
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
        if(tipo.equalsIgnoreCase("C")||tipo.equalsIgnoreCase("M")){
            resultado="Tipo añadido";
            this.tipo = tipo;
        }else {
            resultado="Tipo incorrecto";
        }
        return resultado;
    }
    /*
    public int precio(){       
        double paga;    
    }
    */
}
