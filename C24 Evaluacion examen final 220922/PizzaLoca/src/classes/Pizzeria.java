package classes;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> pizzas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.pizzas = new ArrayList<>();
    }

    public List<String> mostrarPizzas(){
        List<String> verLista = new ArrayList<>();
        for (Pizza pizza:pizzas) {
            verLista.add(pizza.toString());
        }
        return verLista;
    }

    public void agregarPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }
}