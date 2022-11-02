public class ExamenFinal extends Examen implements Comparable{
    private int notaOral;
    private String descripcionTema;

    public ExamenFinal(String titulo, String enunciado, int notaOral, Alumno alumno, String descripcionTema){
        super(titulo, enunciado, notaOral, alumno);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }

    public int getNotaOral() {
        return notaOral;
    }

    @Override
    public boolean aprobado(){
        if (super.getNota() >= 4 && this.notaOral >= 4){
            return true;
        } else {
            return false;
        }
    }
    public int compareTo(Object objeto){
        ExamenFinal examenXParametro = (ExamenFinal)objeto;
        double promedioLocal = (super.getNota() + this.notaOral)/2;
        double promedioParametro = (examenXParametro.getNota() + examenXParametro.getNotaOral())/2;
        if (promedioLocal > promedioParametro){
            return 1;
        }else if (promedioLocal < promedioParametro){
            return -1;
        } else {
            return 0;
        }
    }
}
