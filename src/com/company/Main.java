package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        //Obiekt klasy
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj najmniejsza liczbe przedzialu do stworzenia boku trojkata: ");
        int a = scan.nextInt();
        System.out.println("Podaj najwieksza liczbe przedzialu do stworzenia boku trojkata: ");
        int b = scan.nextInt();
        int x = rand.nextInt((b-a+1)+a);
        int z = rand.nextInt((b-a+1)+a);
        int c = rand.nextInt((b-a+1)+a);
        System.out.println("Bok a: "+x+ " Bok b: "+z+ " Bok c: "+c);
        System.out.println(Pole.Poletrojkata(z,x,c));

    }
}
