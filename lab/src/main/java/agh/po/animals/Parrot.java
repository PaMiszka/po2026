package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name){
        super(name, 2);
    }

    public String getDescription(){
        return "Imie papugi : " + name;
    }

    public void glos() {
        System.out.println("kra kra");
    }
}
