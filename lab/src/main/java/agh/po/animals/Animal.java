package agh.po.animals;

public abstract class Animal {
    protected String name;
    protected Integer legs;

    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    public abstract String getDescription();


    public Integer getLegs() {
        return legs;
    }

    public abstract void glos();
}
