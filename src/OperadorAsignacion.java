public class OperadorAsignacion {

    public static void main(String[] args) {
        int x =1;
        int y=1;
        // x=20;
        // x -=3;
        // x *=3;
        // x /=3;
        x &=y;
        System.out.println("Valor: "+x);
        System.out.println(Integer.toBinaryString(x));

        System.out.println(Integer.toBinaryString(y));
    }
}
