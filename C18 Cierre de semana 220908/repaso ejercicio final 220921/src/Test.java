import classes.*;
import factories.CursoFactory;

public class Test {
    public static void main(String[] args) {
        Instituto DH = new Instituto("DigitalHouse");

        Curso frontEnd = CursoFactory.getInstance().crearCurso(CursoFactory.cursoIndependiente,"Front End","Este es un curso de Front");
        Curso backEnd = CursoFactory.getInstance().crearCurso(CursoFactory.cursoIndependiente,"Back End","Este es un curso de Back");
        Curso fullstack = CursoFactory.getInstance().crearCurso(CursoFactory.programaIntensivo,"Fullstack","Este es un programaIntensivo de Fullstack");
        Curso metodologia = CursoFactory.getInstance().crearCurso(CursoFactory.taller,"Metodologia","Este es un taller de Metodologia");
        Curso ctd = CursoFactory.getInstance().crearCurso(CursoFactory.carrera,"CTD","Este es un carrera de Programacion");

        ((CursoIndependiente)frontEnd).setDuracion(2);
        ((CursoIndependiente)frontEnd).setCargaHoraria(16);
        ((CursoIndependiente)frontEnd).setValorHora(1000);


        ((CursoIndependiente)backEnd).setDuracion(2);
        ((CursoIndependiente)backEnd).setCargaHoraria(20);
        ((CursoIndependiente)backEnd).setValorHora(900);

        ((ProgramaIntensivo)fullstack).setBonificacion(20);
        ((ProgramaIntensivo)fullstack).agregarCurso(frontEnd);
        ((ProgramaIntensivo)fullstack).agregarCurso(backEnd);

        ((Taller)metodologia).setPrecioTP(100);
        ((Taller)metodologia).setTrabajosPracticos(10);

        ((Carrera)ctd).setCostoBasico(1000);
        ((Carrera)ctd).agregarCurso(frontEnd);
        ((Carrera)ctd).agregarCurso(backEnd);
        ((Carrera)ctd).agregarTaller(metodologia);


        ((Instituto)DH).agregarCursos(frontEnd);
        ((Instituto)DH).agregarCursos(backEnd);
        ((Instituto)DH).agregarCursos(metodologia);
        ((Instituto)DH).agregarCursos(fullstack);
        ((Instituto)DH).agregarCursos(ctd);

        System.out.println(DH.generarInforme());


    }
}