package factories;

import classes.Curso;
import classes.CursoIndividual;
import classes.ProgramaIntensivo;

public class CursoFactory {
    private static CursoFactory instance;
    public static final String CURSO_INDIVIDUAL = "Curso Individual";
    public static final String PROGRAMA_INTENSIVO = "Programa Intensivo";


    private CursoFactory() {
    }

    public static CursoFactory getInstance() {
        if (instance == null){
            instance = new CursoFactory();
        }
        return instance;
    }

    public Curso crearCurso(String codigo, String nombre, String descripcion){
        switch(codigo){
            case CURSO_INDIVIDUAL:
                return new CursoIndividual(nombre, descripcion);
            case PROGRAMA_INTENSIVO:
                return new ProgramaIntensivo(nombre, descripcion);
        }
        return null;
    }

}
