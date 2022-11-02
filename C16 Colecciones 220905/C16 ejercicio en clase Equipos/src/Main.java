import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Camada 1");

        equipo.addJugador(new Jugador(11,"ricardo",true,true));
        equipo.addJugador(new Jugador(1,"pepe",false,true));
        equipo.addJugador(new Jugador(10,"messi",true,true));
        equipo.addJugador(new Jugador(3,"jose",true,false));
        equipo.addJugador(new Jugador(2,"fernando",true,true));

        equipo.mostrarJugadoresTitulares();
       // System.out.println(equipo.cantidadJugadoresLesionados());



    }
}