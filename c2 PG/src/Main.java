import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1: Definir 2 cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un mensaje.

        String cadena1 = "Arbol";
        String cadena2 = "Piedra";

        if (cadena1.equals(cadena2)) {
            //System.out.println("Son iguales");
        } else {
            //System.out.println("Son distintas");
        }
        //Ejercicio 2: Definir 2 Integer y determinar cual es mayor,
        // cual es menor o si son iguales. Informar el resultado obtenido

        Integer num1 = 4;
        Integer num2 = 3;
        int comparacion = num1.compareTo(num2);

        if (comparacion > 0){
        //    System.out.println("num1 es mayor");
        } else if (comparacion == 0) {
        //    System.out.println("son iguales");
        } else {
        //    System.out.println("num2 es mayor");
        }


        //Ejercitacion Ingeso de datos, Scanner
        //Ejercicion 1: Ingresa tu nombre y tu apellido por separado,
        // a partir de stas variables debes obtener en una tercera tus iniciales.

        Scanner scanner;

        scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        char inicialNombre;
        char inicialApellido;

//        System.out.println("Ingresa tu nombre");
        nombre = scanner.nextLine();
//        System.out.println("Ingresa tu apellido");
        apellido = scanner.nextLine();
        inicialNombre = nombre.charAt(0);
        inicialApellido = apellido.charAt(0);
        System.out.println(inicialNombre+inicialApellido);

    }
//    Ejercitacion Funciones;
//    Ejercicio 1: Hacer una funcion que reciba como parametro dos valores y devuelva
//     un booleano. La funcion debe comprobar si el primer numero es divisible por el segundo.

    public boolean esDivisible(int n, int divisor){
        return n%divisor == 0;
    }

}