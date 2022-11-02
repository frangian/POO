package classes;

public class CursoIndependiente  implements Curso{
    private String nombre, descripcion;
    private double cargaHoraria, duracion, valorHora;

    public CursoIndependiente(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return this.cargaHoraria * this.valorHora * this.duracion;
    }

    @Override
    public String toString() {
        return "CursoIndependiente{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", duracion=" + duracion +
                ", costoTotal=" + this.calcularPrecio() +
                '}';
    }
}
