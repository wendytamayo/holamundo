
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = scan.nextInt();

        System.out.println("tu nombre: "+ nombre +", tu edad es: " + edad);

    }
}
