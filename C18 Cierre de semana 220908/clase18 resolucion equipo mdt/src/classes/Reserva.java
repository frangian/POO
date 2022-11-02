package classes;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private String codigo;

    private List recorrido  = new ArrayList<>();
    private int cantPersonas, precioBoleto = 50;

    public Reserva(String codigo, List recorrido, int cantPersonas){
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
    }

    public int precio(){
        int precio = cantPersonas * precioBoleto;
        return precio;
    }

}
