public class Main {
    public static void main(String[] args) {

     Perro perro1 = new Perro("Doberman", 2020,"Toto",
             5.5,true,true,false);
        System.out.println("El perro "+perro1.getNombre()+" tiene "+perro1.edadPerro(perro1.getAnioNacimiento()));
        System.out.println(perro1.getNombre()+" puede perderse? "+perro1.factiblePerderse()+
                ". Puede ser adoptado: "+perro1.enviarAdopcion());
    }
}
