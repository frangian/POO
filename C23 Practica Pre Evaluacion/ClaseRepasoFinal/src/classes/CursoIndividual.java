package classes;

public class CursoIndividual implements Curso {
    private String nombre, descripcion;
    private double cargaHoraria, duracion, valorHora;

    public CursoIndividual(String nombre, String descripcion) {
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
        return (this.valorHora * this.duracion * this.cargaHoraria);
    }

    @Override
    public String toString() {
        return "CursoIndividual{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", duracion=" + duracion +
                ", valor total=" + this.calcularPrecio() +
                '}';
    }
}
