package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    import java.util.Random;

    Animal[] animals = new Animal[100];

    public void uzupelnijZoo(){
        Random random = new Random();
        for (int i=0;i<animals.length;i++){
            int choice=random.nextInt(3);

            if(choice==0){
                animals[i]=new Parrot("papuga numer"+ i);
            }
            else if(choice==1){
                animals[i]=new Dog("pies numer"+i);
            }
            else{
                animals[i]=new Snake('waz numer'+i);
            }
        }
    }
    public int IleLacznieNog(){
        int wszystkienogi=0;
        for(int i=0;i<animals.length;i++){
            if(animals[i]!=null){
                wszystkienogi+=animals[i].getLegs();
            }
        }
        return wszystkienogi;
    }
    public static void main(String[] args){
        Zoo myZoo=new Zoo();
        myZoo.uzupelnijZoo();

        int legs = myZoo.IleLacznieNog();
        System.out.println("Ile wszystkich nog : "+legs);

        for (int i = 0; i < 5; i++) {
            Animal animal = myZoo.animals[i];
            int legs = animal.getLegs();
            String desc = animal.getDescription();
            animal.glos();
        }
    }

}
