import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//        try {
//        Integer num1 = 5/0;
//            num1.compareTo(3);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("hasta aca llegue");

//        ArrayList<Integer> numeros = new ArrayList<>();
//        numeros.add(8);
//        numeros.add(2);
//        numeros.add(3);
//        try {
//            System.out.println(numeros.get(6));        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("hasta aca llegue");

Cliente cliente = new Cliente("pepe","argento","123456",500.0,2000.0,1000.0);

        try {
            System.out.println(cliente.saldarDeuda(5000.0));
        } catch (ArithmeticException e){
            System.out.println("Error de aritmetica");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("se ejecuto saldarDeuda de Cliente");
        }

        System.out.println("prueba");
    }
}