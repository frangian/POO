package classes;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<Curso> cursoList;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.cursoList = new ArrayList<>();
    }

    public List<String> generarInforme(){
        List<String> informe = new ArrayList<>();
        for (Curso curso: cursoList) {
            informe.add(curso.toString());
        }
        return informe;
    }

    public void agregarCurso(Curso curso){
        this.cursoList.add(curso);
    }
}
