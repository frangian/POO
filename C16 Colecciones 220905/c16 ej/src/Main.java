import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Equipo equipo = new Equipo("Camada 1");
        equipo.addJugador(new Jugador(11,"Ricardo",true,true));
        equipo.addJugador(new Jugador(1,"Pepe",false,true));
        equipo.addJugador(new Jugador(10,"Messi",true,true));
        equipo.addJugador(new Jugador(3,"Jose",false,false));
        equipo.addJugador(new Jugador(2,"Fernando",true,false));

        equipo.mostrarJugadoresTitulares();

        System.out.println(equipo.cantidadJugadoresLesionados());

    }
}