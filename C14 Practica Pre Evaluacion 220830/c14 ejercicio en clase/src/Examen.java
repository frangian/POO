public abstract class Examen {
    private String titulo;
    private String enunciado;
    private int nota;
    private Alumno alumno;


    public Examen(String titulo, String enunciado, int nota, Alumno alumno){
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }

    public int getNota() {
        return nota;
    }

    public abstract boolean aprobado();
}
