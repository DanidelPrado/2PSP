package es.florida;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ANE_Randoms {

    public static void Fichero_Nums() throws IOException {
        File numerosRandom=new File("NumsRandoms.txt");
        long startTime = System.currentTimeMillis();
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(numerosRandom));
        PrintWriter printer = new PrintWriter(bw);
        int numAleatorio = 0;

        Random numRandom = new Random();

        for (int i = 0; i<100; i++){
            numAleatorio = (int)(numRandom.nextGaussian()*100-1);
            printer.println(numAleatorio);
            printer.flush();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Ha tardado "+(endTime-startTime)+"ms en escribir");

    }

    public static List<Integer> LeerNumsRandoms() throws IOException {
        File file = new File("NumsRandoms.txt");
        Scanner scanner = new Scanner(file);
        long startTime = System.currentTimeMillis();
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Ha tardado "+(endTime-startTime)+"ms en leer");

        return integers;
    }

    public static void SumaNumsRandoms(List<Integer> NumsLeidos) throws IOException{
        int sumaTotal = 0;
        for(int i = 0; i < NumsLeidos.size(); i++){
            sumaTotal += NumsLeidos.indexOf(i);
        }
        System.out.println("La suma total es " + sumaTotal);
    }

    public static void main(String[] args) throws IOException {
        Fichero_Nums();
        SumaNumsRandoms(LeerNumsRandoms());
    }
    }