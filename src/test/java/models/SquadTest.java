package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setUpNewSquad() {
    }

    @Test
    public void setUpNewSquad1() {
    }
    @Test
    public void newSquad_instantiatesCorrectly_true(){
        Squad newSquad = Squad.setUpNewSquad();
        assertTrue(newSquad instanceof Squad);
    }
    @Test
    public void newSquad_getName_String(){
        Squad Squad = new Squad("upezi", 10, "kenyan best");
        assertEquals("upezi", Squad.getName());
    }
    @Test
    public void newSquad_getSize_Int(){
        Squad Squad = new Squad ("upezi", 10, "kenyan best");
        assertEquals(10, Squad.getSize());
    }
    @Test
    public void newSquad_getCause_String(){
        Squad Squad = new Squad ("upezi", 10, "kenyan best");
        assertEquals("kenyan best", Squad.getCause());
    }
    @Test
    public void newSquad_getInstancesCorrectly_true(){
        Squad Squad = new Squad("upezi", 10, "kenyan best");
        Squad anotherSquad = new Squad("upezi", 10, "kenyan best");
        assertEquals(true,Squad.getInstances().contains(Squad));
        assertEquals(true, Squad.getInstances().contains(anotherSquad));
    }
    @Test
    public void newSquad_getSquadMembers_Array(){
        Squad Squad = new Squad("upezi", 10, "kenyan best");
        Hero Hero = new Hero ("ajab", 30, "toxic", "visible");
        Hero newHero1 = new Hero("ajab", 30, "toxic", "visible");
        Squad.setSquadMembers(Hero);
        assertEquals("ajab", Squad.getSquadMembers().get(0).getName());
    }
    @Test
    public void newSquad_allTestSquadMembers_Array(){
        Hero Hero = new Hero("ajab", 30, "toxic", "visible");
        Squad Squad = new Squad("upezi", 30, "kenyan best");
        Squad.clearAllSquadMembers();
        Squad.getSquadMembers().add(Hero);
        Squad.getSquadMembers().add(Hero);
        assertEquals("ajab", Squad.getSquadMembers().get(0).getName());
    }
    @Test
    public void addMember_addMemberToSquad_Hero(){
        Hero Hero = new Hero ("ajab", 30, "toxic", "visible");
        Squad testSquad = new Squad ("upezi", 10, "kenyan best");
        Squad newSquad = Squad.findBySquadId(1);
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(Hero);
        newSquad.getSquadMembers().add(Hero);
        assertEquals(2, newSquad.getSquadMembers().size());
    }
    @Test
    public void setNewMember_hero(){
        Hero.clearAllHeroes();
        Hero Hero = new Hero ("ajab", 30, "toxic", "visible");
        Squad testSquad = new Squad ("upezi", 10, "kenyan best");
        testSquad.setSquadMembers(Hero);
        assertEquals(1, testSquad.getSquadMembers().get(0).getId());
    }
    @Test
    public void newSquad_getId_Int(){
        Hero.clearAllHeroes();
        Hero newHero = Hero.setUpNewHero();
        Hero anotherHero = Hero.setUpNewHero();
        Hero another1 = Hero.setUpNewHero();
        assertEquals(3, another1.getId());
    }

}