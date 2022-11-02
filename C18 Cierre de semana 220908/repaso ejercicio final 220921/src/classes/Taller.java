package classes;

public class Taller implements Curso{
    private String nombre, descripcion;
    private double trabajosPracticos, precioTP;

    public Taller(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setTrabajosPracticos(double trabajosPracticos) {
        this.trabajosPracticos = trabajosPracticos;
    }

    public void setPrecioTP(double precioTP) {
        this.precioTP = precioTP;
    }

    @Override
    public double calcularPrecio() {
        return this.trabajosPracticos * this.precioTP;
    }

    @Override
    public String toString() {
        return "Taller{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", trabajosPracticos=" + trabajosPracticos +
                ", Costo total =" + this.calcularPrecio() +
                '}';
    }
}
