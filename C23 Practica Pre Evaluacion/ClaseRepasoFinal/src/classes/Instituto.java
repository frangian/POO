package classes;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<Curso> cursos;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }

    public List<String> generarInforme(){
        List<String> informe = new ArrayList<>();
        for (Curso curso:cursos) {
            informe.add(curso.toString());
        }
        return informe;
    }

}
