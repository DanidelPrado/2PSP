package es.florida;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberCreator implements Runnable {

    private int miembro = 0;

    @Override
    public void run() {
        File file = new File("miembros.txt");
        file.delete();
        while(true) {
            if(Lock.blocked) {
                addMember();
            }
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void addMember(){
        File file = new File("miembros.txt");
        try {
            FileWriter filewriter = new FileWriter(file,true);
            PrintWriter fileprint = new PrintWriter(filewriter);
            fileprint.println(miembro + "@gmail.com");
            miembro++;
            fileprint.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
