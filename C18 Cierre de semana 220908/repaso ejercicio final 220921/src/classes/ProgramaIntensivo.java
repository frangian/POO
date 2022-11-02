package classes;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo  implements Curso{
    private String nombre, descripcion;
    private double bonificacion;
    private List<Curso> cursos;

    public ProgramaIntensivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cursos = new ArrayList<>();
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    };
    @Override
    public double calcularPrecio() {
        double costoTotal = 0;
        for (Curso curso: cursos) {
            costoTotal += curso.calcularPrecio();
        }
        return costoTotal = (costoTotal*bonificacion/100);
    }

}
