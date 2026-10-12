package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        Random generator = new Random();
        ArrayList<Integer> wyniki = new ArrayList<>();

        while(wyniki.size()<6){
            int liczba = generator.nextInt(49)+1;

            if(!wyniki.contains(liczba)){
                wyniki.add(liczba);
            }
        }
        System.out.println(wyniki);
    }
}
