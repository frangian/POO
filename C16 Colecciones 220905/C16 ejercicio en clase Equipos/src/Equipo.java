import java.util.ArrayList;
import java.util.List;
public class Equipo {
    private String nombre;
    private List<Jugador> listaJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador){
        this.listaJugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        this.listaJugadores.sort(null);
        for (Jugador jugador : listaJugadores) {
            if (jugador.isTitular()){
                System.out.println(jugador);
            }
        }
    }

    public int cantidadJugadoresLesionados(){
        int contador = 0;
        for (Jugador jugador: listaJugadores) {
            if(jugador.isTitular() && jugador.getLesionado()){
                contador ++;
            }
        }
        return contador;
    }
}
