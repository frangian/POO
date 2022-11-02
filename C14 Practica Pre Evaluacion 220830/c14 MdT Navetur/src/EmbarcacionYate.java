public class EmbarcacionYate extends Embarcacion implements Comparable {
    private int cantidadCamarotes;

    public EmbarcacionYate(double valorBase, double valorAdicional, int anioFabricacion, double longitudMetros, Capitan capitan, int cantidadCamarotes) {
        super(valorBase, valorAdicional, anioFabricacion, longitudMetros, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int compareTo(Object o){
        EmbarcacionYate yate = (EmbarcacionYate) o;
        if (this.cantidadCamarotes > yate.cantidadCamarotes ){
            return 1;
        } else if (this.cantidadCamarotes < yate.cantidadCamarotes ){
            return -1;
        } else {
            return 0;
        }
    }
}