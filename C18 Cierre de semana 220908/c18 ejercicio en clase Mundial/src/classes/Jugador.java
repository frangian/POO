package classes;

public class Jugador {
    private String posicion, apellido;
    private int nroCamiseta;

    public Jugador(String posicion, String apellido, int nroCamiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +"posicion='" + posicion + ", apellido='" + apellido + ", nroCamiseta=" + nroCamiseta +'}';
    }
}
