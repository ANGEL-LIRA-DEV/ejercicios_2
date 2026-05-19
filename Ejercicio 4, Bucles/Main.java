import java.util.UUID;
import java.util.ArrayList;

public class Main {

    public static void main(String args []) {

        Integer[] arreglo = new Integer[]{1, 2, 3};

        System.out.print("BUCLE FOR: ");
        // for simple
        for(int i = 0; i < arreglo.length; i++){

            System.out.print(arreglo[i] + " ");

        }

        System.out.print("\nBUCLE FOR EACH: ");
        // for each
        for(Integer entero : arreglo){

            System.out.print(entero + " ");

        }

        System.out.print("\nBUCLE WHILE: ");
        // while
        int i = 0;
        while (i < 5) {

            System.out.print(i + " ");
            i++;

        }

        System.out.println("\n\nUSO DO-WHILE");
        // bucle do-while
        int j = 6;
        do{
            System.out.println("Hola");
            j++;
        } while(j <= 8);

        ArrayList<UUID> ids = new ArrayList<>();

        ids.add(UUID.randomUUID());
        ids.add(UUID.randomUUID());
        ids.add(UUID.randomUUID());

        ids.sort(null);

        System.out.println("\nLOS UUID se pueden ordenar");
        ids.stream().forEach(System.out::println);

    }

}