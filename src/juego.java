import java.util.Scanner;

public class juego {
    private dado[] dados = new dado[5];
    private jugador[] jugadores;
    Scanner teclado = new Scanner(System.in);

    void menu (){
        inicializiaciones();
        registrarjugadores();
        jugar();

    }

    void inicializiaciones (){
        for ( int i = 0 ; i  < dados.length ; i++){
            dados[i] = new dado(1, false);
        }
        System.out.print( "cuantos jugadores van a participar?: ");
        int cantidadjugadores = teclado.nextInt();
        jugadores = new jugador[cantidadjugadores];

    }

    void registrarjugadores (){
        System.out.println("registrar");
        for (int i = 0 ; i < jugadores.length ; i++){
            System.out.print("como se llama el jugador?: ");
            String nombre = teclado.next();
            jugadores[i] = new jugador(nombre,0 );
        }

    }


    void jugar (){
        System.out.println(" \n Empiecen a jugar");
        for (int i = 0 ; i < jugadores.length ; i++){
            jugadores[i].mostrar();
        }

    }
}
