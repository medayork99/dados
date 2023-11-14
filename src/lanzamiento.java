public class lanzamiento {

    private int valor;

    public lanzamiento () {
        this.valor = lanzar();
    }

    public int lanzar() {
        return (int) (Math.random() * 6) + 1;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    void mostrar (){
        System.out.println(lanzamiento + "El lanzamiento fue de " + valor);
    }
}

