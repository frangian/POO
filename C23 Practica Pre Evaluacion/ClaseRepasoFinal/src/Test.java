import classes.Curso;
import classes.CursoIndividual;
import classes.Instituto;
import classes.ProgramaIntensivo;
import factories.CursoFactory;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        Instituto instituto = new Instituto("Palace IT");
        //Creacion de cursos
        Curso fronEnd = CursoFactory.getInstance().cursoFactory("CursoIndividual", "Front End", "Este es un curso de Front");
        Curso backEnd = CursoFactory.getInstance().cursoFactory(CursoFactory.CURSO_INDIVIDUAL, "Back End", "Este es un curso de Back");
        Curso fullstack = CursoFactory.getInstance().cursoFactory(CursoFactory.PROGRAMA_INTENSIVO, "FullStack", "Este es un PI FullStack");


        // Esto es un curso de frontEnd
        ((CursoIndividual)fronEnd).setDuracion(2);
        ((CursoIndividual)fronEnd).setValorHora(1000);
        ((CursoIndividual)fronEnd).setCargaHoraria(16);

        ((CursoIndividual)backEnd).setCargaHoraria(20);
        ((CursoIndividual)backEnd).setDuracion(2);
        ((CursoIndividual)backEnd).setValorHora(900);

        // FullStack
        ((ProgramaIntensivo)fullstack).setBonificacion(20);
        ((ProgramaIntensivo)fullstack).agregarCursos(fronEnd);
        ((ProgramaIntensivo)fullstack).agregarCursos(backEnd);


        instituto.agregarCurso(fronEnd);
        instituto.agregarCurso(backEnd);
        instituto.agregarCurso(fullstack);


        List<String> informes = instituto.generarInforme();
        for (String informe:informes) {
            System.out.println(informe);
        }





    }
}