package classes;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada implements Pizza{
    private String nombre, descripcion;
    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pizzas = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.00;
        int cantidadPizzas = 0;

        for (Pizza pizza:pizzas) {
            precioTotal += pizza.calcularPrecio();
            cantidadPizzas++;
        }
        return (precioTotal / cantidadPizzas);
    }
    public void agregarPizzas (Pizza pizza){
        this.pizzas.add(pizza);
    }

    @Override
    public String toString() {
        return "Pizzas Combinadas{" +
                "Nombre: '" + this.nombre + '\'' +
                ", Precio: $ " + this.calcularPrecio() +
                '}';
    }
}
