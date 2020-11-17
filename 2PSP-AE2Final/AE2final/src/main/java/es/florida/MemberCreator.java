package es.florida;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberCreator {
    public static void main(String[] args) throws InterruptedException, IOException {
        File f = new File("members.txt");
        File lock = new File("lock.txt");
        int member = 0;
        if(f.exists()){
            f.delete();
        }
        if(lock.exists()){
            lock.delete();
        }
        while(true) {
            if(!(lock.exists())) {
                try {
                    FileWriter writer = new FileWriter(f, true);
                    PrintWriter print = new PrintWriter(writer);
                    print.println(member + "@gmail.com");
                    member++;
                    print.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
