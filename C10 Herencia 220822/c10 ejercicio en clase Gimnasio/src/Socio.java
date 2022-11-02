public class Socio {
    private String numeroSocio;
    private String nombre;
    private double costoMensual;
    private String actividad;

    public Socio(String numeroSocio, String nombre, double costoMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.costoMensual = costoMensual;
        this.actividad = actividad;
    }

    public double calcularCostoMensual(){
        return this.costoMensual;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "numeroSocio='" + numeroSocio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costoMensual=" + costoMensual +
                ", actividad='" + actividad + '\'' +
                '}';
    }
}
