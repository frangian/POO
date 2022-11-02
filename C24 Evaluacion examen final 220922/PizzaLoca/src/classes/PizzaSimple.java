package classes;

public class PizzaSimple implements Pizza{

    private String nombre, descripcion;
    private Double precioBase;
    private boolean grande;

    public PizzaSimple(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public void setGrande(boolean grande) {
        this.grande = grande;
    }

    @Override
    public Double calcularPrecio() {
        if(grande){
            return precioBase * 2;
        }
        return precioBase;
    }

    @Override
    public String toString() {
        return "Pizzas Simples{" +
                "Nombre: " + nombre + '\'' +
                ", Precio: $ " + this.calcularPrecio() +
                '}';
    }
}
