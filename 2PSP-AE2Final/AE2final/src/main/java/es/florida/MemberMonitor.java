package es.florida;

import java.io.*;

public class MemberMonitor {
    public static void main(String[] args) throws IOException, InterruptedException {
        String ruta = System.getProperty("user.dir")+"\\out\\production\\2PSP-AE2final";
        int a = 0;
        String aux = "";
        String aux2 = "";
        File f = new File("members.txt");
        while(true){
            Thread.sleep(3000);
            FileReader reader = null;
            try {
                reader = new FileReader(f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bReader = new BufferedReader(reader);
            String line;
            while((line = bReader.readLine())!=null){
                aux = line;
            }
            if(!(aux.equals(aux2))){
                aux2 = aux;
                ProcessBuilder builder = new ProcessBuilder("java","-cp",ruta,"es.florida.MailSender",aux);
                builder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
                Process pMail = builder.start();
            }
            a++;
            bReader.close();
        }
    }
}
