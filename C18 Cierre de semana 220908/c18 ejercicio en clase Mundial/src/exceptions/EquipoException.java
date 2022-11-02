package exceptions;

public class EquipoException extends Exception{
    public EquipoException(){
        super();
    }

    public EquipoException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Error: " + this.getClass() + "Mensaje: "+ this.getMessage();
    }
}
