package models;

import java.util.ArrayList;

public class Squad {
    private final int squadId;
    private int SquadId;
    private String squadName;
    private int squadSize;
    private String cause;
    private ArrayList<Hero> squadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();

   public Squad(String name, int size, String cause){
       squadName = name;
       squadSize = size;
       this.cause = cause;
       this.squadMembers = new ArrayList<>();
       instances.add(this);
       this.squadId = instances.size();
   }


    public static Squad setUpNewSquad() {

        return new Squad ("upezi",10, "kenyan best");
    }

    public static Squad setUpNewSquad1() {
       return new Squad ("upizipoa", 10, "alltimes");

    }

    public String getName() {
       return squadName;
    }
}
