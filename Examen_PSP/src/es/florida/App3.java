package es.florida;

import java.io.*;

public class App3 {
    public static void main(String[] args) throws InterruptedException, IOException {
        String aux = "";
        String[] palabras1 = new String[5];
        String[] palabras2 = new String[5];
        String[] palabras3 = new String[5];
        String[] palabras4 = new String[5];
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis();
        File f = new File("origen.txt");
        while (true) {
            FileReader reader = null;
            try {
                reader = new FileReader(f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bReader = new BufferedReader(reader);
            String line;
            while ((line = bReader.readLine()) != null) {
                for (int i = 0; i < 5; i++) {
                    palabras1[i] = line.toString();
                }
                for (int i = 0; i < 5; i++) {
                    palabras2[i] = line.toString();
                }
                for (int i = 0; i < 5; i++) {
                    palabras3[i] = line.toString();
                }
                for (int i = 0; i < 5; i++) {
                    palabras4[i] = line.toString();
                }
            }
            System.out.println(palabras1 + " #");
            System.out.println(palabras2 + " #");
            System.out.println(palabras3 + " #");
            System.out.println(palabras4 + " #");
            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
        }
    }
}
