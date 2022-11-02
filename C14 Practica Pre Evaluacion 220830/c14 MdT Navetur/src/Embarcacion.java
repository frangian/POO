import java.util.Date;

public class Embarcacion{
    private double valorBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double longitudMetros;
    private Capitan capitan;

    public Embarcacion(double valorBase, double valorAdicional, int anioFabricacion, double longitudMetros, Capitan capitan) {
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.longitudMetros = longitudMetros;
        this.capitan = capitan;
    }

    public double calcularAlquiler(){
        if(this.anioFabricacion > 2020){
            return this.valorBase + this.valorAdicional;
        } else {
            return this.valorBase;
        }
    }

}
