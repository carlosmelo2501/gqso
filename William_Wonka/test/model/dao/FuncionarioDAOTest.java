/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mike Kennedy
 */
public class FuncionarioDAOTest {
    
    Funcionario funcionario;
    FuncionarioDAO dao;
    public FuncionarioDAOTest() {
    }

    @Test
    public void create() {
    
        funcionario = new Funcionario ("2312312","Milks","23423","25/01/2000");
        dao = new FuncionarioDAO();
      
        if (dao.create(funcionario)){
            System.out.println("Funcionario salvo");
        
        }else{
            fail("Deu ruim!");
            
        }
    
    }
    
}
