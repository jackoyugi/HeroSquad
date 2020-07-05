import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;
public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        Hero.setUpNewHero();
        Hero.setUpNewHero1();
        Squad.setUpNewSquad();
        Squad.setUpNewSquad1();

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero-form", (req, re) ->{
                Map<String, Object> model = new HashMap<>();
                return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());
    }

}
