import clases.Equipo;
import clases.Jugador;
import exceptions.EquipoException;

public class Main {
    public static void main(String[] args) {

        Equipo equipo = new Equipo("Argentina");
        String[] posiciones = {"ARQUERO","DEFENSOR","MEDIOCAMPISTA","DELANTERO"};
        try{
            for (int i=0; i<50; i++){
                int r = (int)(Math.random() * (4));
                String pos = posiciones[r];
                equipo.agragarJugador(new Jugador(pos,"Maradona"+(i+0),i+1));
            }
        } catch( Exception e){
            System.out.println(e.toString());
        }
        System.out.println("Jugadores del Equipo");
        equipo.printJugadores();
        System.out.println("------------- ------------- -------------");


        System.out.println("Estos son los reservas");
        for (Jugador jugador: equipo.obtenerReservas()) {
            System.out.println(jugador.toString());
        }
        System.out.println("------------- ------------- -------------");

        System.out.println("Cantidad de jugadores de la posicion que buscamos:");
        try {
        System.out.println(equipo.cantJugadores("ARQUERO"));
        } catch (EquipoException e){
            System.out.println(e.toString());
        }

    }
}