package factories;

import classes.*;

public class PizzaFactory {

    // ATRIBUTOS
    private static PizzaFactory instance;
    public static final String pizzaSimple = "Pizza Chica";
    public static final String pizzaCombinada = "Pizza Combinada";

    public static PizzaFactory getInstance() {
        if (instance == null) {
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String codigo, String nombre, String descripcion) {
        switch (codigo) {
            case pizzaSimple:
                return new PizzaSimple(nombre, descripcion);
            case pizzaCombinada:
                return new PizzaCombinada(nombre, descripcion);
        }
        return null;
    }
}