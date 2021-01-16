package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     double gradosC, gradosF;
     int num_caracteristicas = 0;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Porfavor ingrese centigrados");
     gradosC = in.nextDouble();
     gradosF = 32 + (9 * gradosC / 5) ;
     System.out.println(gradosC +" graods centigrados " + gradosF + " grados farenheit");

    }
}
