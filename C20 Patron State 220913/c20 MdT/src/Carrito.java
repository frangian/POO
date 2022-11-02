import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> conjuntoProductos;
    private StateCarrito estado;

    public Carrito() {
        this.estado = new Vacio(this);
        this.conjuntoProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto1){
        this.estado.agregarProducto(producto1);
    }

    public void vaciarCarrito(){
        this.estado.vaciarCarrito();
    }

    public void volverPuntoAnterior(){
        this.estado.volverPuntoAnterior();
    };


    public void pasarSiguienteEstado(){
        this.estado.pasarSiguienteEstado();
    };
}
