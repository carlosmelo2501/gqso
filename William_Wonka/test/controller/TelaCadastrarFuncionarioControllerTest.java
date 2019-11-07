/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Mike Kennedy
 */
public class TelaCadastrarFuncionarioControllerTest {
    
    private TelaCadastrarFuncionarioController instance;
    public TelaCadastrarFuncionarioControllerTest() {
        instance = new TelaCadastrarFuncionarioController();
    }
    
    
    @Before
    public void setUp() {
       
    }

    /**
     * Test of conferirCpf method, of class TelaCadastrarFuncionarioController.
     */
    @Test
    public void testConferirCpf() {
        
        String cpf = "";  
        boolean expResult = false;
        
        assertEquals(expResult ,instance.conferirCpf(cpf));
       
    }

    /**
     * Test of conferirRG method, of class TelaCadastrarFuncionarioController.
     */
   
    @Test
    public void testConferirRg() {
        
        String rg = "";  
        
        boolean expResult = false;
        
        assertEquals(expResult ,instance.conferirRG(rg));
       
    }

    /**
     * Test of initialize method, of class TelaCadastrarFuncionarioController.
     */
    @Ignore
    public void testInitialize() {
       
        URL url = null;
        ResourceBundle rb = null;        
        instance.initialize(url, rb);
        
    }
    
}
