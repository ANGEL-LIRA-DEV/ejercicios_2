public class Main {

    public static void main(String args []) {

        int edad = 19;

        // if simple
        if(edad > 18){

            System.out.println("Eres mayor de edad");

        } else{

            System.out.println("Eres menor de edad");

        }

        // switch
        switch (edad){
            case 18:
                System.out.println("Ahora eres mayor de edad");
                break;

            default:
                System.out.println("No tienes 18");

        }

        // operador ternario
        System.out.println("Eres: " + validarEdad(edad));

    }

    static String validarEdad(int edad){

        return (edad >= 18)? "MAYOR": "MENOR";

    }

}