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
        long liczbalosowan = 0;
        long start = System.currentTimeMillis();

        while (true){
            liczbalosowan++;
            ArrayList<Integer> wyniki = new ArrayList<>();
            while(wyniki.size()<6){
                int liczba = generator.nextInt(49)+1;

                if(!wyniki.contains(liczba)){
                    wyniki.add(liczba);
                }
            }
            typy.retainAll(typy);
            if(wyniki.size()==6){
                break;
            }
        }
        long koniec=System.currentTimeMillis();
        long czas=koniec-start;


        System.out.println("liczba losowan"+liczbalosowan);
        System.out.println("czas w ms" + czas);
    }
}
