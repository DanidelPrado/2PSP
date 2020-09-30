import java.util.Scanner;

class AE1_6 {
    public static void NumInvSum (int numeros[]) {
            for(int i = 0; i < numeros.length; ++i) {
                System.out.print("Introduce un numero: ");

                String entradaTeclado = "";

                Scanner entradaEscaner = new Scanner(System.in);

                entradaTeclado = entradaEscaner.nextLine();

                int numero = Integer.parseInt(entradaTeclado);

                numeros[i] = numero;
            }
                for(int j = 4; j != -1; --j){
                    System.out.println (numeros[j]);
                }

                int totalSum = 0;

                for(int x = 0; x < numeros.length; ++x){
                    totalSum += numeros[x];
                }
            System.out.println("La suma total es: " + totalSum);
    }
    public static void main(String[] args) {
        int nums[];
        nums = new int[5];
        NumInvSum(nums);
    }
}