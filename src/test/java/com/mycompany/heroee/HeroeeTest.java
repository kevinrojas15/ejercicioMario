/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.heroee;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vanes
 */
public class HeroeeTest {
    
    public HeroeeTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   

    /**
     * Test of avanzar method, of class Heroee.
     */
    @org.junit.jupiter.api.Test
    public void testAvanzar() {
        System.out.println("avanzar");
        Heroee instance = new Heroee("Mario",9);
        instance.avanzar();
        System.out.println("saltando: " + instance.isSaltando());


        
    }

    /**
     * Test of saltar method, of class Heroee.
     */
    @org.junit.jupiter.api.Test
    public void testSaltar() {
        System.out.println("saltar");
        Heroee instance = new Heroee("Mario",9);
        instance.saltar();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getVidas method, of class Heroee.
     */
    @org.junit.jupiter.api.Test
    public void testGetVidas() {
        System.out.println("getVidas");
        Heroee instance = new Heroee("Mario",9);
//        int expResult = 0;
        int result = instance.getVidas();
//        assertEquals(expResult, result);
        System.out.println("vidas: " + result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
