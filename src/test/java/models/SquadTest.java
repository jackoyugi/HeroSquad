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
}