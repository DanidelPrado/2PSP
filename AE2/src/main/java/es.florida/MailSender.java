package es.florida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MailSender{

    public static void sendMessages(String nombre){
        try {
            Lock.lock();
            FileReader reader = new FileReader("miembros.txt");
            BufferedReader bReader = new BufferedReader(reader);
            String aux;
            while(!(aux = bReader.readLine()).equals(nombre)){
                Thread.sleep(1000);
                System.out.println("Se ha enviado un correo a " + aux + ", "+ nombre + " es un nuevo miembro");
            }
            bReader.close();
            Lock.unlock();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}