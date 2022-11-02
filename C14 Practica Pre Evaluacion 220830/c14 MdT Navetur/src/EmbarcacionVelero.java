import java.util.Date;

public class EmbarcacionVelero extends Embarcacion {
    private int cantidadMastiles;

    public EmbarcacionVelero(double valorBase, double valorAdicional, int anioFabricacion, double longitudMetros, Capitan capitan, int cantidadMastiles) {
        super(valorBase, valorAdicional, anioFabricacion, longitudMetros, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }
    public String evaluarTamanio(){
        if (this.cantidadMastiles <= 4){
            return "tamaño chico";
        } else {
            return "tamaño grande";
        }
    }
}
