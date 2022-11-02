package factories;

import classes.Curso;
import classes.CursoIndividual;
import classes.ProgramaIntensivo;

public class CursoFactory {
    private static CursoFactory instance;
    public static final String  CURSO_INDIVIDUAL = "CursoIndividual";
    public static final String PROGRAMA_INTENSIVO = "ProgramaIntensivo";

    private CursoFactory() {
    }

    public static CursoFactory getInstance(){
        if (instance == null){
            instance = new CursoFactory();
        }
        return instance;
    }

    public Curso cursoFactory(String codigo, String nombre, String descripcion){
        switch (codigo){
            case CURSO_INDIVIDUAL:
                return new CursoIndividual(nombre,descripcion);
            case PROGRAMA_INTENSIVO:
                return new ProgramaIntensivo(nombre,descripcion);
//            case "Taller":
//                return new Taller(nombre,descripcion);
        }
        return null;
    }



}
