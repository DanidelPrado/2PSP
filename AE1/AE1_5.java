public class AE1_5 {
    public static void DevolverMayor (int numeros[]) {
        int mayor = 0;
        for(int i = 0; i < numeros.length; ++i){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mas grande del array es: " + mayor);
    }
    public static void main(String[] args) {


        int nums[] = {2,3,7,1,5,17};
        DevolverMayor(nums);
    }
}