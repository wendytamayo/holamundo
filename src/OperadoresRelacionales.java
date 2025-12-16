public class OperadoresRelacionales {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        //igualdad
        boolean res1= (a==b);
        System.out.println("igualdad :"+res1);

        //diferencia
        boolean res2= (a!=b);
        System.out.println("diferencia :"+res2);

        //mayor que
        boolean res3 = ( a> b );
        System.out.println("Mayor que :"+res3);

        //menor que
        boolean res4= (a<b);
        System.out.println("Menor que :"+res4);

        //
        String dato1="Holq";
        String dato2="Hola";
        boolean res6= (dato1==dato2);
        System.out.println("igualdad String:"+res6);
    }
}
