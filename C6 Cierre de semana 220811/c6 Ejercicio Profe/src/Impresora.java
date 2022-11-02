import java.util.Date;

public class Impresora {
    //Atributos
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion = new Date();
    private int cantidadHojas = 0;

    //Constructor
    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion){
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
    }
    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion, int cantidadHojas){
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.cantidadHojas = cantidadHojas;
    }

    //get


    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    //Metodos
    public boolean tieneHojas(){
        if(this.cantidadHojas > 0){
            return true;
        } else {
            return false;
        }
    }
    public void incrementarHojas(int cantidadHojas){
        this.cantidadHojas += cantidadHojas;
    }
    public String imprimir(String texto, boolean tipoImpresion){
        if (texto != "") {
            if (tipoImpresion) {
                return texto + " Este texto es en negro";
            } else {
                return texto + "Este texto es en color";
            }
        } else {
            return "No me mandaste nada para imprimir";
        }
    }
}
