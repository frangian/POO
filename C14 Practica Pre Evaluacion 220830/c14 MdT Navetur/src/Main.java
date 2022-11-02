public class Main {
    public static void main(String[] args) {

        Capitan capitan = new Capitan("Juan","Perez","001");
        EmbarcacionYate yate = new EmbarcacionYate(100,50,2019,10,capitan,2);
        EmbarcacionYate yate1= new EmbarcacionYate(80,50,2021,15,capitan,5);
        EmbarcacionVelero velero = new EmbarcacionVelero(100,50,2021,10,capitan,3);

        System.out.println(yate.calcularAlquiler());
        System.out.println(yate.compareTo(yate1));
        System.out.println(velero.evaluarTamanio());

        Embarcacion velero1 = new EmbarcacionVelero(100,50,2010,20,capitan,3);
        System.out.println(((EmbarcacionVelero)velero1).evaluarTamanio());

    }
}