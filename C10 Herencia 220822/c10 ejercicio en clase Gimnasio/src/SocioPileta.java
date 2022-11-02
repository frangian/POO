public class SocioPileta extends Socio{
    private double costoPileta;
    private boolean habilitado;

    public SocioPileta(String numeroSocio, String nombre, double costoMensual, String actividad, double costoPileta, boolean habilitado){
        super(numeroSocio, nombre, costoMensual, actividad);
        this.costoPileta = costoPileta;
        this.habilitado = habilitado;
    }

    @Override
    public double calcularCostoMensual() {
        if(this.habilitado){
            return super.calcularCostoMensual() + this.costoPileta;
        } else {
            return super.calcularCostoMensual();
        }
    }

    public String toString() {
        return super.toString() + " Costo Pileta: "+this.costoPileta+ " habilitado: "+this.habilitado;
    }
}
