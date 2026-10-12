package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto1 {
    public static void main(String[] args){
        ArrayList<Integer> typy = new ArrayList<>();
        for(String arg : args){
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
        System.out.println("wyniki : " + wyniki);
        System.out.println("typy : " + typy);

        typy.retainAll(wyniki);

        System.out.println("liczba trafien " + typy.size());
    }
}
