package es.florida;
import java.io.File;

import java.io.*;

public class MemberMonitor implements Runnable{

    @Override
    public void run() {
        checkMiembros();
    }

    private void checkMiembros(){
        String linea1 = "";
        String linea2 = "";
        File file = new File("miembros.txt");
        while(true) {

            if (file.isFile()) {
                try {
                    Thread.sleep(3000);
                    FileReader filereader = new FileReader(file);
                    BufferedReader buffReader = new BufferedReader(filereader);
                    String aux;
                    while((aux = buffReader.readLine()) != null){
                        linea1 = aux;
                    }
                    if(!(linea1.equals(linea2))){
                        linea2 = linea1;
                        MailSender.sendMessages(linea1);
                    }
                    buffReader.close();
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
