package es.florida;
import java.io.*;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        String text="";
        Scanner entradaScanner = null;
        boolean contiene = false;
        String line;
        int num = 1;
        Scanner scanner = new Scanner(System.in);
        File f = new File("destino.txt");
        try {
            String ruta = System.getProperty("user.dir") + "origen.txt";
            File d = new File(ruta);
            entradaScanner = new Scanner(f);
            while (entradaScanner.hasNext()) {
                line = entradaScanner.nextLine();
                if (!(line.contains("x")||(line.contains("z")))) {
                    System.out.println(line);
                    contiene = true;
                    text = text + line+"\n";
                }
                num++;
            }
            if(!contiene){
                System.out.println("No existe en el fichero.");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "Seleccione un archivo primero");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entradaScanner != null) {
                entradaScanner.close();
            }
        }
        System.out.println(text);
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("destino.txt");
            pw = new PrintWriter(fichero);
            pw.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
