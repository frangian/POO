public class Jugador implements Comparable<Jugador>{
    private Integer nroCamiseta;
    private String nombre;
    private boolean lesionado, titular;

    public Jugador(int nroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public boolean isTitular() {
        return titular;
    }

    public boolean getLesionado() {
        return lesionado;
    }
    // esto es un metodo comun que java no lo usa para ordenar.

//    public int compareTo(Jugador jugador, String dato){
//        return 0;
//    }


    @Override
    public int compareTo(Jugador jugador) {

        //return this.nombre.compareTo(jugador.nombre);
        return  this.nroCamiseta.compareTo(jugador.nroCamiseta);

//        if (this.nroCamiseta > jugador.nroCamiseta){
//            return 1;
//        } else if (this.nroCamiseta < jugador.nroCamiseta) {
//            return  -1;
//        } else {
//            return 0;
//        }
    }



    @Override
    public String toString() {
        return "nro Camiseta: " + this.nroCamiseta + " nombre: " + this.nombre;
    }
}
