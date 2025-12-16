import java.util.Scanner;

public class EjercicioSistemaTransporte {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("==== TIPOS DE RUTA ====");
        System.out.println("1. Corto (S/ 3.00)");
        System.out.println("2. Medio  (S/ 5.00)");
        System.out.println("3. Largo  (S/ 8.00)");
        System.out.println("Seleccione una ruta: ");

        int ruta = scan.nextInt();
        double tarifa = 0;

        //Tipo de ruta:
        switch (ruta) {
            case 1:
                tarifa = 3.00;
                break;
            case 2:
                tarifa = 5.00;
                break;
            case 3:
                tarifa = 8.00;
                break;
            default:
                System.out.println("Error: El tipo de ruta no existe");
        }

        if (ruta == 1 || ruta == 2 || ruta == 3) {

            System.out.println("Ingrese su edad:");
            int edadPasajero = scan.nextInt();

            if (edadPasajero > 0) {

                System.out.println("¿Es estudiante?: (true/false)");
                boolean estudiante = scan.nextBoolean();

                double descuento = 0;

                //Es adulto mayor?
                if (edadPasajero >= 60) {
                    descuento = 0.30;
                }

                //Es estudiante y ya tiene un dscto?
                if (estudiante && descuento < 0.30) {
                    descuento = 0.20;
                }
                double pagoTotal = tarifa - (tarifa * descuento);

                //IMPRIMIR
                System.out.println("-------------------------");
                System.out.println("Tarifa:     S/" + tarifa);
                System.out.println("Descuento:  " + (descuento * 100) + "%");
                System.out.println("Pago Total: S/" + pagoTotal);
                System.out.println("-------------------------");
            } else {
                System.out.println("Error: La edad no puede ser negativa");
            }
            scan.close();

        }
        scan.close();
    }
}
