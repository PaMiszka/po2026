package agh.po.animals;

public class Snake extends Animal{
    public Snake(String name){
        super(name, 0);
    }

    public String getDescription(){
        return "Imie węża : " + name;
    }

    public void glos() {
        System.out.println("sssss");
    }
}
