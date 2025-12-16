public class EjercicioNumeroMayor {

    public static void main(String[] args) {
        //Buscar el numero mayor en un arreglo
        int[] valores = {45, 15, 8, 40, 22, 9};
        int mayor = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }
        System.out.println("Mayor: " + mayor);
    }
}
