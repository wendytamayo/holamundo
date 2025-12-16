
public class EjercicioCondicionales {

    public static void main(String[] args) {

        int puntaje =-10;
        String rango="";

        if (puntaje>=0 && puntaje <=20){
            rango="Muy bajo";
        }

        if (puntaje>=21 && puntaje <=50){
            rango="Bajo";
        }

        if (puntaje>=51 && puntaje <=80){
            rango="Medio";
        }

        if (puntaje>=81 && puntaje <=100){
            rango="Alto";
        }

        //fuera de rango
        if (puntaje < 0 || puntaje >100){
            rango="Puntaje invalido";
        }

        System.out.println("Rango: "+ rango);
    }
}
