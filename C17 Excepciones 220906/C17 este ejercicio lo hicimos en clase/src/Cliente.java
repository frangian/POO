public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private Double saldo;
    private Double deuda;
    private Double limite;

    public Cliente(String nombre, String apellido, String DNI, Double saldo, Double deuda, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.saldo = saldo;
        this.deuda = deuda;
        this.limite = limite;
    }

    public void comprar(Double importe){

    }

    public Double saldarDeuda(Double importe) throws  ClienteEx {
        if(deuda < importe){
        throw new ClienteEx("tu deuda es de "+deuda+" y estas intentando pagar "+importe);
        }
        deuda -= importe;
        return deuda;
    }


}
