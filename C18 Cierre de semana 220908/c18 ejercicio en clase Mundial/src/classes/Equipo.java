package classes;
import exceptions.EquipoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Equipo {
    private String nombreEquipo;
    private List<Jugador> jugadorList;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.jugadorList = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) throws EquipoException {
        if (jugadorList.size() == 23){
            throw new EquipoException("El equipo esta completo, no puede agergar mas jugadores.");
        }
        jugadorList.add(jugador);
    }

    public void printJugadores(){
        for (Jugador jugador:jugadorList) {
            System.out.println(jugador.toString());
        }
    }

    public List<Jugador> obtenerReservas(){
        List<Jugador> jugadoresReserva = new ArrayList<>();
        for (int i=18; i<jugadorList.size(); i++) {
            jugadoresReserva.add(jugadorList.get(i));
        }
        return jugadoresReserva;
    }

    public int cantidadJugadores(String posicion) throws EquipoException{
        //posicion = posicion.toUpperCase();
        List<String> posiciones = new Vector<>();
        posiciones.add("ARQUERO");
        posiciones.add("MEDIOCAMPISTA");
        posiciones.add("DEFENSOR");
        posiciones.add("DELANTERO");
        int contador = 0;
        if(!posiciones.contains(posicion)){
            throw new EquipoException("Esta posicion no existe");
        }
        for (Jugador jugador: jugadorList) {
            if(jugador.getPosicion() == posicion){
                contador ++;
            }
        }
        return contador;
    }


}
