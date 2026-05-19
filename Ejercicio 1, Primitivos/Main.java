public class Main {

    public static void main(String args []) {

        byte byt = Byte.MAX_VALUE;
        short shor = Short.MAX_VALUE;
        int num = Integer.MAX_VALUE;
        long numGrande = Long.MAX_VALUE;
        float floa = Float.MAX_VALUE;
        double doubl = Double.MAX_VALUE;

        boolean bool = Boolean.FALSE;
        char letra = 67;

        // Provocar desbordamiento
        byt++;
        shor++;
        num++;
        numGrande++;
        floa++;
        doubl++;

        // Cambiar valor
        bool = !bool;
        letra++; // los chars pueden recorrerse como numeros

        System.out.println("Valores manipulados: ");
        System.out.println("boolean negado: " + bool);
        System.out.println("Letra ASCII 68: " + letra);

        System.out.println("\nNúmeros desbordados: ");
        System.out.println(byt);
        System.out.println(shor);
        System.out.println(num);
        System.out.println(numGrande);
        System.out.println(floa);
        System.out.println(doubl);

    }

}