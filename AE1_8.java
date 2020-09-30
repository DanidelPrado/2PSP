import java.util.Scanner;

public class AE1_8 {

    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        int contador = 0;


        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }

        return contador < 1;
    }

    public static void Intervalos () {
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis();
        System.out.print("Introduce el 1er numero: ");

        String num1 = "";

        Scanner entradaEscaner = new Scanner(System.in);

        num1 = entradaEscaner.nextLine();

        int numero1 = Integer.parseInt(num1);

        System.out.print("Introduce el 2ndo numero: ");

        String num2 = "";

        num2 = entradaEscaner.nextLine();

        int numero2 = Integer.parseInt(num2);

        for(int i = numero1; i <= numero2; ++i){
            if(esPrimo(i)) {
                System.out.println(i + " es primo");
            } else{
                System.out.println(i + " no es primo");
            }
        }
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

    }

    public static void main(String[] args) {
        Intervalos();
    }
}