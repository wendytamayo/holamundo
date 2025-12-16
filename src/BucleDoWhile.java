import java.util.Scanner;

public class BucleDoWhile {

    public static void main(String[] args) {
/*
        int i = 1;
        do {
            System.out.println("Ejecutando al menos una vez");
        } while (i > 0);
        */

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Saludar");
            System.out.println("0. Salir");
            System.out.println("Opcion");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Holaa!!");
            }
        } while (opcion != 0);

    }
}
