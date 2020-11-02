import java.util.Scanner;
public class AE1_7 {

    public static void NivSal () {

            System.out.print("Introduce tu nombre: ");

            String nombre = "";

            Scanner entradaEscaner = new Scanner(System.in);

            nombre = entradaEscaner.nextLine();

        System.out.print("Introduce tus anyos de experiencia: ");

        String anyosString= "";

        anyosString = entradaEscaner.nextLine();

        int anyos = Integer.parseInt(anyosString);

        if (anyos < 1) {
            System.out.println("Desarrollador Junior L1 – 15000-18000" );
        } else if (anyos >= 1 && anyos <= 2){
            System.out.println("Desarrollador Junior L2 – 18000-22000" );
        } else if (anyos >= 3 && anyos < 5){
            System.out.println("Desarrollador Senior L1 – 22000-28000" );
        } else if (anyos >= 5 && anyos <= 8){
            System.out.println("Desarrollador Senior L2 – 28000-36000" );
        } else if (anyos > 8){
            System.out.println("Analista / Arquitecto. Salario a convenir en base a rol");
        }

    }
    public static void main(String[] args) {
        NivSal();
    }
}