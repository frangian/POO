import java.util.ArrayList;
import java.util.List;
public class Contenedor {
    private int numeroIdentificador;
    private List<Pais> paisList;
    private boolean transportaMaterialesPeligrosos;

    public Contenedor(int numeroIdentificador, boolean transportaMaterialesPeligrosos) {
        this.numeroIdentificador = numeroIdentificador;
        this.paisList = new ArrayList<>();
        this.transportaMaterialesPeligrosos = transportaMaterialesPeligrosos;
    }

    public void addPais(Pais pais) { this.paisList.add(pais);}

    public int cantidadContenedorePeligrosos(){
        int contador = 0;
        for (Pais pais: paisList){
            if (pais.getNombrePais()== "Desconocido"){
                contador ++;
            }
        }
        return contador;
    }
}
