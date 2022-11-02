import java.time.LocalDate;
import java.util.Scanner;
import java.sql.Time;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        Time tiempo = new Time(10,05,06);
        LocalTime tiempo2 = LocalTime.now();
        System.out.println(tiempo);
        System.out.println(tiempo2);



/*        Scanner sc = new Scanner(System.in);

        try{
            int numero = sc.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("siempre paso por aca sin importar donde entré en la estructura");
        }
        System.out.println("Pase por aca");*/

        Cliente cliente = new Cliente("Pablo", "Palacios", "10258789", 2000);
        cliente.setDeuda(700);
        System.out.println(cliente.toString());
        try{
            cliente.comprar(1000);
        }catch (ClienteException e){
            System.out.println(e.toString());
        }finally {
            System.out.println(cliente.toString());
        }

        try{
            cliente.pagarDeuda(2000);
        }catch (ClienteException e){
            System.out.println(e.toString());
        }finally {
            System.out.println(cliente.toString());
        }




    }
}