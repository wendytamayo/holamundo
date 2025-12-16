import java.util.Scanner;

public class EjercicioValidacionContraseña {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "java123";
        String claveIngresada;

        int intentos = 3;

        do {
            System.out.println("Ingresar clave:");
            claveIngresada = sc.nextLine();

            if (claveIngresada.equals(claveCorrecta)) {
                System.out.println("Acceso concedido");
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("intentos restantes: " + intentos);

                }
            }
        }
        while (!claveIngresada.equals(claveCorrecta) && intentos > 0);

        if (!claveIngresada.equals(claveCorrecta) && intentos == 0) {

            System.out.println("Cuenta bloqueada");
        }
        sc.close();
    }
}
