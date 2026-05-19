import java.util.UUID;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {

    public static void main(String args []) {

        Boolean booleano = true;
        Character letra = 'A';

        System.out.println("CARACTER Y BOOLEANO: ");
        System.out.println("Resultado de booleano XOR false: " + Boolean.logicalXor(false, booleano));
        System.out.println("¿El caracter es mayúscula?: " + Character.isUpperCase(letra));

        Byte byterm = 127;
        Short corto = Short.parseShort("1245");
        Integer entero = 848;
        Long largo = 12323L;
        Float numeroDecimal = Float.MAX_VALUE;
        Double doble = Double.MIN_VALUE;

        Byte byte2 = 12;

        String veredicto = (byterm.compareTo(byte2) == 0) ? "Verdadero" : "Falso";

        System.out.println("\nPRIMITIVOS NUMÉRICOS: ");
        System.out.println("¿" + byterm  +" es igual a " + byte2 + "?: " + veredicto);
        System.out.println("Cadena a Short: " + corto);
        System.out.println("Entero en octal: " + Integer.toOctalString(entero));
        System.out.println("En binario: " + Long.toBinaryString(largo));
        System.out.println("¿Es NaN?: " + numeroDecimal.isNaN());
        System.out.println("Valor mínimo double: " + doble);

        UUID id = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();

        System.out.println("\nCOMPARANDO UUIDs: ");
        System.out.println("Primer id único: " + id);
        System.out.println("Segundo id único: " + id2);
        System.out.println("¿Son iguales?: " + compararUUIDs(id, id2));

        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();

        LocalDateTime horaYFechaAhora = LocalDateTime.of(fechaActual, horaActual);

        System.out.println("\nHORA Y FECHA ACTUALES: ");
        System.out.println(horaYFechaAhora);

    }

    static boolean compararUUIDs(UUID id1, UUID id2){

        return (id1.equals(id2));

    }

}