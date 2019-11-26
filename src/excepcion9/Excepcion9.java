package excepcion9;
import java.util.Scanner;

public class Excepcion9 {

        public static void main(String[] args) {
            try{
                double x = leerValor();
                System.out.println("Raíz cuadrada de " + x + " = " + Math.sqrt(x));
                
            } catch (Error707 e){
                System.out.println(e.getMessage());
            }
        
    }
        public static double leerValor() throws Error707 {
            Scanner teclado=new Scanner (System.in);
            System.out.print("introduce número > 0");
            double n= teclado.nextDouble();
            if (n <= 0){
                throw new Error707("El número debe ser positivo");
            }
            return n;
        }
}
       

    


