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


}