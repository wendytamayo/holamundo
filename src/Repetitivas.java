public class Repetitivas {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("---------ARRAYS----------");

        int[] numeros = {4, 8, 12, 10};
        int suma = 0;
        for (int j = 0; j < numeros.length; j++) {
            suma += numeros[j];
        }
        System.out.println("Suma total: " + suma);

        System.out.println("---------WHILE----------");
        int p = 10;
        while (p > 4) {
            System.out.println(p);
            p--;
        }

    }


}
