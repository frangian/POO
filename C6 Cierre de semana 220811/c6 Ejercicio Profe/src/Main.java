import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date fecha = new Date(1991,9,25);
        Impresora impre = new Impresora("Epson","USB",fecha);
        Impresora impre2 = new Impresora("Samsung","WIFI",fecha,10);

        impre.incrementarHojas(40);
        if(impre.tieneHojas()){
            System.out.println(impre.imprimir("Hola chicos y chicas",true));
        } else {
            System.out.println("La impresora no tiene hojas");
        }
        System.out.println(impre.getFechaFabricacion());
    }
}