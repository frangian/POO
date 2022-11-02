package classes;

import java.util.ArrayList;
import java.util.List;

public class Carrera  implements Curso{
    private String nombre, descripcion;
    private double costoBasico;
    private List<Curso> cursos;
    private List<Curso> talleres;

    public Carrera(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cursos = new ArrayList<>();
        this.talleres = new ArrayList<>();
    }

    public void setCostoBasico(double costoBasico) {
        this.costoBasico = costoBasico;
    }
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    public void agregarTaller(Curso curso){
        this.talleres.add(curso);
    }
    @Override
    public double calcularPrecio() {
        double costoTotal = 0;
        for (Curso curso: cursos) {
            costoTotal += curso.calcularPrecio();
        }
        for (Curso curso: talleres) {
            costoTotal += curso.calcularPrecio();
        }
        return costoTotal + this.costoBasico;
    }


}
