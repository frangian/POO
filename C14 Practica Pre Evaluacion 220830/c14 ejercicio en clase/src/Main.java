public class Main {
    public static void main(String[] args) {
        Alumno al = new Alumno("Juan", "Perez",1);
        Examen ex = new ExamenParcial("POO","LALALA",3,al,4);
        Examen ex2 = new ExamenFinal("POO", "lalala",4,al,"se la jugo con todo");
        System.out.println("Aprobo el examen: "+ex.aprobado());
        System.out.println("1 "+((ExamenParcial)ex).esRecuperable());
        System.out.println("2 "+((ExamenParcial)ex).esRecuperable());
        System.out.println("3 "+((ExamenParcial)ex).esRecuperable());
        System.out.println("4 "+((ExamenParcial)ex).esRecuperable());

    }
}