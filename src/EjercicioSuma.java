import java.util.Scanner;

public class EjercicioSuma {

    public static void main(String[] args) {

        //Sumar numero hasta que el usuario escriba el 0
        Scanner scan = new Scanner(System.in);

        int suma = 0;

        System.out.println("Ingresa un numero para sumar:");
        int numero = scan.nextInt();

        while (numero != 0) {
            suma += numero;

            System.out.println("Ingresa otro numero para sumar:");
            numero = scan.nextInt();
        }

        System.out.println("Suma: " + suma);

        scan.close();
    }
}
