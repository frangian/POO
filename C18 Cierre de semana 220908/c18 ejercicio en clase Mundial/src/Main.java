import classes.Equipo;
import classes.Jugador;
import exceptions.EquipoException;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("ArgentinaColombia");
        String[] posiciones = {"ARQUERO", "DEFENSOR", "MEDIOCAMPISTA", "DELANTERO"};
        try{
            for (int i=0; i<23; i++){
                int r =(int)(Math.random() * (4));
                String pos = posiciones[r];
                equipo.agregarJugador(new Jugador(pos,"Maradona"+(i+1),i+1));
            }
        }catch (EquipoException e){
            System.out.println(e.toString());
        }

        System.out.println("Jugadores del Equpo");
        equipo.printJugadores();
        System.out.println("--------------- --------------- ---------------");

        System.out.println("Estos son los reservas");
        for (Jugador jugador: equipo.obtenerReservas()) {
            System.out.println(jugador.toString());
        }

        try{
            System.out.println(equipo.cantidadJugadores("arquero"));
        }catch (EquipoException e){
            System.out.println(e.toString());
        }
    }
}