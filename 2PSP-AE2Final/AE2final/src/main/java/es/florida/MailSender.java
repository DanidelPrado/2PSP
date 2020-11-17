package es.florida;

import java.io.*;
import java.nio.channels.FileLock;

public class MailSender {
    public static void main(String[] args) throws IOException, InterruptedException {
        File lock = new File("lock.txt");
        lock.createNewFile();
        File f = new File("members.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bReader = new BufferedReader(reader);
        String aux;
        while(!(aux = bReader.readLine()).equals(args[0])){
            System.out.println("Correo enviado a "+aux+"\n"+args[0]+" es un nuevo integrante");
            Thread.sleep(1000);
        }
        try {
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        lock.delete();
    }
}
