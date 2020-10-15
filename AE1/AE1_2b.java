import java.util.ArrayList;
import java.util.Iterator;

class AE1_2b {
    public static void main(String[] args) {
        ArrayList Nombres = new ArrayList();
        Nombres.add("Alejandro");
        Nombres.add("Noelia");
        Nombres.add("Adrian Javier");
        Nombres.add("Adri");
        Nombres.add("Pau");
        Nombres.add("Manel");

        Iterator<String> nombreIterator = Nombres.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.println(elemento);
        }
    }
}