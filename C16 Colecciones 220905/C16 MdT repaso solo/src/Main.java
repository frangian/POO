public class Main {
    public static void main(String[] args) {
        PaisProcedencia china = new PaisProcedencia("China");
        PaisProcedencia eeuu = new PaisProcedencia("EEUU");
        PaisProcedencia brasil = new PaisProcedencia("Brasil");
        PaisProcedencia rusia = new PaisProcedencia("China");
        PaisProcedencia canada = new PaisProcedencia("China");
        PaisProcedencia desconocida = new PaisProcedencia("Desconocida");

        Puerto puertoBsAs = new Puerto("Buenos Aires");

        puertoBsAs.ingresarContenedor(new Contenedor(4,desconocida,false));
        puertoBsAs.ingresarContenedor(new Contenedor(1,china,true));
        puertoBsAs.ingresarContenedor(new Contenedor(2,brasil,false));
        puertoBsAs.ingresarContenedor(new Contenedor(3,china,true));
        puertoBsAs.ingresarContenedor(new Contenedor(5,eeuu,false));
        puertoBsAs.ingresarContenedor(new Contenedor(6,desconocida,true));

        puertoBsAs.mostrarContenedores();
        System.out.println(puertoBsAs.cantContPeligrosos());

    }
}