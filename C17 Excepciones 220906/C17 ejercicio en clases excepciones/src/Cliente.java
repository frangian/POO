public class Cliente {
   private String nombre, apellido, dni;

   private Integer numero;
   private int numero1;

   private double deuda, limite;

   public Cliente(String nombre, String apellido, String dni, double limite) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.dni = dni;
      this.deuda = 0.0;
      this.limite = limite;
   }

   public void setDeuda(double deuda) {
      this.deuda = deuda;
   }

   //uando el cliente intenta comprar y el saldo supere su límite establecido no lo tengo que dejar

   public void comprar(double importe) throws ClienteException{
      double gastoTotal = this.deuda + importe;
      if (gastoTotal > this.limite){
         throw new ClienteException("El cliente intento comprar mas del limite autorizado.");
      }
      this.deuda = gastoTotal;
   }
   // cuando intente pagar y no tenga deuda.
   public void pagarDeuda(double importe) throws ClienteException{
      double saldoDeuda = this.deuda - importe;
      if (saldoDeuda < 0){
         throw new ClienteException("Maestro, me estas pagando de mas. Somos demasiado piolas!");
      }
      this.deuda = saldoDeuda;
   }

   @Override
   public String toString() {
      return "Cliente{" +
              "nombre='" + nombre + '\'' +
              ", apellido='" + apellido + '\'' +
              ", dni='" + dni + '\'' +
              ", deuda=" + deuda +
              ", limite=" + limite +
              '}';
   }
}
