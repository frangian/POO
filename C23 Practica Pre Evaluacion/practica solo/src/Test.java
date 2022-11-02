import classes.*;
import factories.*;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        Instituto DH = new Instituto("Digital Hosue");

        Curso front = CursoFactory.getInstance().crearCurso(CursoFactory.CURSO_INDIVIDUAL,"Front","front");
        Curso back = CursoFactory.getInstance().crearCurso(CursoFactory.CURSO_INDIVIDUAL,"Back","back");
        Curso fullstack = CursoFactory.getInstance().crearCurso(CursoFactory.PROGRAMA_INTENSIVO,"Fullstack","fullstack");

        ((CursoIndividual)front).setDuracion(2);
        ((CursoIndividual)front).setCargaHoraria(16);
        ((CursoIndividual)front).setValorHora(1000);

        ((CursoIndividual)back).setDuracion(2);
        ((CursoIndividual)back).setCargaHoraria(20);
        ((CursoIndividual)back).setValorHora(900);

        ((ProgramaIntensivo)fullstack).setBonificacion(20);
        ((ProgramaIntensivo)fullstack).agregarCurso(front);
        ((ProgramaIntensivo)fullstack).agregarCurso(back);

        DH.agregarCurso(front);
        DH.agregarCurso(back);
        DH.agregarCurso(fullstack);

        List<String> informes = DH.generarInforme();
        for (String informe: informes) {
            System.out.println(informe);
        }



    }
}