import java.util.Scanner;

class AE1_3 {
    public static void main(String[] args) {

        System.out.print ("Introduce un numero mayor que 0: ");

        String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner (System.in);

        entradaTeclado = entradaEscaner.nextLine ();

        int numero = Integer.parseInt(entradaTeclado);
        int totalSuma = 0;

        if(numero >= 0) {
            for (int i = 0; i <= numero; ++i) {
                if (i % 2 == 0) {
                    totalSuma += i;
                }
            }
            System.out.println ("La suma es: " + totalSuma);
        }else{
            System.out.println ("El numero introducido tiene que ser mayor que 0.");
        }
    }
}