import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Alimentemos a los perritos
        //atributos o datos
        Scanner sc = new Scanner(System.in);
        String nombre;
        double cantidad_de_comida;
        //ingeso de datos
        System.out.println("Bienvenido a nuestro programa de control de comidas");
        System.out.println("Ingese el nombre del perro: ");
        nombre = sc.next();
        System.out.println("Ingrese la cantidad de alimento que come el perro: ");
        cantidad_de_comida = sc.nextDouble();

        while (cantidad_de_comida < 3){
            System.out.println("Recorda que el perro "+nombre+" debe comer al menos 3kg de comida");
            System.out.println("Ingrese nuevamente la cantidad de comida");
            cantidad_de_comida = sc.nextDouble();
        }
        System.out.println("La cantidad de paquetes para alimentar a "+nombre+
                " es de: "+ cuantosPaquetes(cantidad_de_comida));
    }

    public static int cuantosPaquetes(double cantidad_comida){
        Scanner sc = new Scanner(System.in);
        double peso_total_paquetes = 0;
        int cantidad_de_paquetes = 0;
        while (cantidad_comida > peso_total_paquetes){
            System.out.println("Ingrese el peso del paquete");
            peso_total_paquetes += sc.nextDouble();
            cantidad_de_paquetes ++;
        }
        return cantidad_de_paquetes;
    }
}