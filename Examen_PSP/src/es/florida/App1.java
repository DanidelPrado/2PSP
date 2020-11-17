package es.florida;
import java.io.*;

public class App1 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File archivoOriginal = new File("origen.txt");
            File archivoCopia = new File("destino.txt");
            inputStream = new FileInputStream(archivoOriginal);
            outputStream = new FileOutputStream(archivoCopia);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
