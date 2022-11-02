public class ClienteException extends Exception{

    public ClienteException(){
        super();
    }
    public ClienteException(String message){
        super(message);
    }
    @Override
    public String toString() {
        return "Error: " + this.getClass().getName() + "Mensaje: " + this.getMessage();
    }
}
