package factories;

import classes.*;

public class CursoFactory {
    private static CursoFactory instance;
    public static final String cursoIndependiente = "CursoIndividual";
    public static final String taller = "Taller";
    public static final String programaIntensivo = "ProgramaIntensivo";
    public static final String carrera = "Carrera";

    private void CursoFactory(){};

    public static CursoFactory getInstance() {
        if(instance == null){
        instance = new CursoFactory();}
        return instance;
    }

    public Curso crearCurso(String codigo, String nombre, String descripcion){
        switch(codigo){
            case cursoIndependiente:
                return new CursoIndependiente(nombre, descripcion);
            case taller:
                return new Taller(nombre, descripcion);
            case programaIntensivo:
                return new ProgramaIntensivo(nombre, descripcion);
            case carrera:
                return new Carrera(nombre, descripcion);
        }
        return null;
    }
}
