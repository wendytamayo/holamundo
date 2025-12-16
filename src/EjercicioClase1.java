import java.util.Scanner;
public class EjercicioClase1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar nombre del alumno");
        String nombre = scan.nextLine();

        System.out.println("Ingresar Nota del primer examen");
        int examen1 = scan.nextInt();

        System.out.println("Ingresar Nota del segundo examen");
        int examen2 = scan.nextInt();

        System.out.println("Ingresar Nota del trabajo final");
        int trabajoFinal = scan.nextInt();

        System.out.println("Ingresar edad del alumno");
        int edad = scan.nextInt();

        double promedio= (examen1*0.30)+(examen2*0.30)+(double)(trabajoFinal*0.40);

        //Validar si aprueba
        boolean resultado = (promedio >=11);
        String aprueba = (resultado=true)? "Aprobado":"Desaprobado";

      // Comentario por edad
        String comentarioEdad=(edad<18)? "Alumno menor de edad, se recomienda\n" +
                "acompañamiento":"";


        // Comentario por aprobar
        String comentarioAprobar=(resultado=true)? "¡Felicitaciones!":"Debe reforzar sus estudios";

        // Comentario por adicional
        String comentarioAdicional=(promedio>=10 && promedio<=10.99)? "El alumno está a 1 punto o menos de aprobar":"Rendimiento crítico";

        System.out.println("------------------");
        System.out.println("REPORTE ACADEMICO");
        System.out.println("------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio final: " + promedio);
        System.out.println("Resultado: " + aprueba);
        System.out.println("Comentarios: " + comentarioEdad + " " + comentarioAprobar + "" + comentarioAdicional);


    }

}


