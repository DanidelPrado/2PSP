package es.florida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String ruta = System.getProperty("user.dir")+"\\out\\production\\2PSP-AE2final";
        ProcessBuilder builder = new ProcessBuilder("java", "-cp", ruta, "es.florida.MemberCreator");
        builder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        Process p1 = builder.start();
        ProcessBuilder builder2 = new ProcessBuilder("java", "-cp", ruta, "es.florida.MemberMonitor");
        builder2.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        Process p2 = builder2.start();
    }
}
