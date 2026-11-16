package agh.po.animals;

public class Dog extends Animal{
    public Dog(String name){
        super(name, 4);
    }

    public String getDescription(){
        return "Imie psa : " + name;
    }

    public void makeSound() {
        System.out.println("hau hau");
    }
}
