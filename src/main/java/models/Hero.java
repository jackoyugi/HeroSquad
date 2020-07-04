package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList();

    public Hero (String name, Integer age, String power, String weakness){
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();

    }
    public static Hero setUpNewHero() {
        return new Hero ("ajab",30, "toxic", "visible");
    }

    public String getName(){
        return this.name;
    }
    public static void setUpNewHero1() {
    }
}
