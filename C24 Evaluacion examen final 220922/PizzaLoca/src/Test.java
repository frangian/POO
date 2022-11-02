import classes.*;
import factories.PizzaFactory;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria("Pizza Loca");

        Pizza muzarella = PizzaFactory.getInstance().crearPizza(PizzaFactory.pizzaSimple, "Pizza de muzzarella", "queso y salsa de tomate");
        ((PizzaSimple)muzarella).setPrecioBase(750.00);
        ((PizzaSimple)muzarella).setGrande(false);
        pizzeria.agregarPizza(muzarella);

        Pizza muzarellaGrande = PizzaFactory.getInstance().crearPizza(PizzaFactory.pizzaSimple, "Pizza de muzzarella grande", "queso y salsa de tomate");
        ((PizzaSimple)muzarellaGrande).setPrecioBase(750.00);
        ((PizzaSimple)muzarellaGrande).setGrande(true);
        pizzeria.agregarPizza(muzarellaGrande);

        Pizza especial = PizzaFactory.getInstance().crearPizza(PizzaFactory.pizzaSimple, "Pizza de especial", "queso, jamon, tiras de morron, aceituna, y salsa de tomate");
        ((PizzaSimple)especial).setPrecioBase(850.00);
        ((PizzaSimple)especial).setGrande(false);
        pizzeria.agregarPizza(especial);

        Pizza especialGrande = PizzaFactory.getInstance().crearPizza(PizzaFactory.pizzaSimple, "Pizza de especial grande", "queso, jamon, tiras de morron, aceituna, y salsa de tomate");
        ((PizzaSimple)especialGrande).setPrecioBase(850.00);
        ((PizzaSimple)especialGrande).setGrande(true);
        pizzeria.agregarPizza(especialGrande);

        Pizza anana = PizzaFactory.getInstance().crearPizza(PizzaFactory.pizzaSimple, "Pizza de anana", "queso y salsa de tomate con rodajas de anana");
        ((PizzaSimple)anana).setPrecioBase(950.00);
        ((PizzaSimple)anana).setGrande(false);
        pizzeria.agregarPizza(anana);

        Pizza ananaGrande = PizzaFactory.getInstance().crearPizza(PizzaFactory.pizzaSimple, "Pizza de anana grande", "queso y salsa de tomate con rodajas de anana");
        ((PizzaSimple)ananaGrande).setPrecioBase(950.00);
        ((PizzaSimple)ananaGrande).setGrande(true);
        pizzeria.agregarPizza(ananaGrande);

        Pizza combinadaLoca = PizzaFactory.getInstance().crearPizza(PizzaFactory.pizzaCombinada, "Pizza Combinada Loca", "mitad especial mitad anana");
        ((PizzaCombinada)combinadaLoca).agregarPizzas(especial);
        ((PizzaCombinada)combinadaLoca).agregarPizzas(anana);
        pizzeria.agregarPizza(combinadaLoca);

        List<String> verPizzas = pizzeria.mostrarPizzas();
        for (String pizzas : verPizzas) {
            System.out.println(pizzas);
        }
    }
}