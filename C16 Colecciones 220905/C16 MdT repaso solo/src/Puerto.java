import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre = "Buenos Aires";
    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();
    }
    public void ingresarContenedor(Contenedor contenedor){
        this.contenedores.add(contenedor);
    }
    public void mostrarContenedores(){
        this.contenedores.sort(null);
        System.out.println(contenedores);
//        for (Contenedor contenedor:contenedores) {
//            if (contenedor.getTransportaMaterialesPeligrosos()) {
//                System.out.println(contenedor);
//            }
//        }
    }
    public Integer cantContPeligrosos(){
        int contador = 0;
        for (Contenedor contenedor:contenedores) {
            if(contenedor.getTransportaMaterialesPeligrosos()){
                contador ++;
            }
        }
        return contador;
    };
};


