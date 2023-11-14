public class dado {

    private int     numero;
    private boolean volverALanzar;


    public dado(int numero, boolean volverALanzar){
        this.numero = numero;
        this.volverALanzar = volverALanzar;
    }

    public  int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public boolean isVolverALanzar(){
        return volverALanzar;
    }

    public void setVolverALanzar(boolean volverALanzar){
        this.volverALanzar = volverALanzar;
    }

    void mostrar () {System.out.print( numero + " " );



    }


}
