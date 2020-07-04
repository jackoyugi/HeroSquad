import models.Hero;
import models.Squad;

import static spark.Spark.staticFileLocation;
public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        Hero.setUpNewHero();
        Hero.setUpNewHero1();
        Squad.setUpNewSquad();
        Squad.setUpNewSquad1();
    }
}
