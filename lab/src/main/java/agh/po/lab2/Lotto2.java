package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto2 {
    public static void main(String[] args){
        ArrayList<Integer> typy=new ArrayList<>();
        for (String arg : args){
            typy.add(Integer.parseInt(arg));
        }

        Random generator = new Random();
        ArrayList<Integer> wyniki = new ArrayList<>();
        while(wyniki.size()<6){
            int liczba = generator.nextInt(49)+1;
            if(!wyniki.contains(liczba)){
                wyniki.add(liczba);
            }
        }

        ArrayList<Integer> trafienia = new ArrayList<>(wyniki);
        trafienia.retainAll(typy);

        System.out.println("typy "+ typy);
        System.out.println("wylosowane liczby : " + wyniki);
        System.out.println("ïle trafien : " + trafienia.size());
    }
}
