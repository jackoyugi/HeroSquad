package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setUpNewHero() {
    }

    @Test
    public void setUpNewHero1() {
    }
    @Test
    public void newHero_instantiatesCorrectly_true(){
        Hero newHero = Hero.setUpNewHero();
        assertEquals(true, newHero instanceof Hero);
    }

    @Test
    public void newHero_getName_String(){
        Hero Hero = new Hero ("ajab", 30, "toxic", "visible");
        assertEquals("ajab", Hero.getName());
    }
    @Test
    public void newHero_getAge_Int(){
        Hero Hero = new Hero("ajab",30, "toxin", "visible");
        assertEquals(30, Hero.getAge());
    }
    @Test
    public void newHero_getPower_String(){
        Hero Hero = new Hero("ajab", 30, "toxic", "visible");
        assertEquals("toxic", Hero.getPower());
    }
    @Test
    public void newHero_getWeakness_String(){
        Hero Hero = new Hero ("ajab", 30, "toxic", "visible");
        assertEquals("visible", Hero.getWeakness());
    }
    @Test
    public void newHero_getAllInstances_true(){
        Hero Hero = new Hero("ajab", 30, "toxic", "visible");
        Hero anotherHero = new Hero("ajab", 30, "toxic", "visible");
        assertEquals(true, Hero.getAllInstances().contains(Hero));
        assertEquals(true, Hero.getAllInstances(). contains(anotherHero));
    }
    @Test
    public void newHero_getId_Int(){
        Hero.clearAllHeroes();
        Hero newHero = Hero.setUpNewHero();
        Hero anotherHero = Hero.setUpNewHero();
        Hero another1 = Hero.setUpNewHero();
        assertEquals(3, another1.getId());
    }
    @Test
    public void newHero_findById_id(){
        Hero.clearAllHeroes();
        Hero newHero = Hero.setUpNewHero();
        Hero another = Hero.setUpNewHero();
        assertEquals(2, Hero.findById(another.getId()).getId());
    }


}