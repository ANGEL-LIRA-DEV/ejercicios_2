import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Angel");
        nombres.add("Luis");
        nombres.add("Ana");

        LinkedList<String> listaEnlazada = new LinkedList<>(nombres);

        System.out.println(listaEnlazada);

    }

}