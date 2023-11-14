public class jugador {
    private String nombre;
    private int puntos;

    public jugador(String nombre, int puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }

        public  String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public int getPuntos(){
            return puntos;
        }

        public void setPuntos(int puntos){
            this.puntos = puntos;
        }

        void mostrar (){
        System.out.println(nombre + " " + "tiene" + " " + puntos + " " + "puntos");
        }

        void lanzar (dado dado1, dado dado2){
        lanzamiento tirar =  new lanzamiento();
        lanzamiento tirar2 =  new lanzamiento();

        dado1.setNumero(tirar.getValor());

        dado2.setNumero((tirar2.getValor()));

        int suma = (dado1.getNumero() + dado2.getNumero() + puntos);


        if (suma %2 == 0) {
            setPuntos(dado1.getNumero()+ dado2.getNumero() + puntos + 5);
            System.out.println("Se le suma 5 puntos");
        }
        else {
            setPuntos(dado1.getNumero() + dado2.getNumero() + puntos);
        }

        }



}