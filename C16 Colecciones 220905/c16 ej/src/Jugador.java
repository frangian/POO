public class Jugador implements Comparable<Jugador>{
    private Integer numeroCamiseta;
    private String nombre;
    private boolean lesionado, titular;

    public Jugador(Integer numeroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public boolean isTitular() {
        return titular;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    @Override
    public String toString() {
        return "nro Camiseta "+ numeroCamiseta + ", nombre: " + this.nombre;
    }

    @Override
    public int compareTo(Jugador o) {
//      return this.nombre.compareTo(o.nombre);

        return this.numeroCamiseta.compareTo(o.numeroCamiseta); //importante para usar el metodo compareTo declarar el tipo de dato como objeto Integer y no como primitivo int

//        if (this.numeroCamiseta > o.numeroCamiseta){
//            return 1;
//        } else if (this.numeroCamiseta < o.numeroCamiseta) {
//            return -1;
//        } else {
//            return 0;
//        }
    }

}
