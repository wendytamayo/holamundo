public class BucleForEach {

    public static void main(String[] args) {

        //for each busqueda sin indice
        String[] nombres = {"Ana", "Jean", "Jordy", "Jean Pierre"};
        for (String n : nombres) {
            System.out.println(n);
        }

        //Recorrer un arreglo de nombre y mostrar solo
        //los que empienzan con una letra especifica

        String[] artistas = {"Adele", "Artic Monkeys", "Faraon", "Bruno Mars", "Avici"};
        System.out.println("Artistas que empiecen con la letra b");
        for (String artista : artistas) {
            if (artista.startsWith("b")) {
                System.out.println(artista);
            }
        }


    }


}
