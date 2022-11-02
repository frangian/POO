public class Main {
    public static void main(String[] args) {

    Socio socio = new Socio("1","Juan",1500,"Funcional");
    SocioPileta socioPileta = new SocioPileta("2","Pepe",1500,"Pileta",700,true);
    SocioPileta socioPileta2 = new SocioPileta("3","Ricardo",1500,"Pileta",700,false);


        System.out.println(socio.toString());
        System.out.println(socioPileta.toString());

        System.out.println("Costo del habilitado: "+socioPileta.calcularCostoMensual());
        System.out.println("Costo del NO habilitado: "+socioPileta2.calcularCostoMensual());

    }
}