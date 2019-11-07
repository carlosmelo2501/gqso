
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Funcionario;

/**
 *
 * @author Mike Kennedy
 */
public class FuncionarioDAO {
    
    private Connection con = null;
    
    public FuncionarioDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Funcionario funcionario){
    
        PreparedStatement stmt = null;

        String sql = "INSERT INTO Funcionarios (CPF, nome, RG, data_de_nascimento) VALUES (?,?,?,?)";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,funcionario.getCPF());
            stmt.setString(2,funcionario.getNome());
            stmt.setString(3,funcionario.getRG());
            stmt.setString(4,funcionario.getDtNascimento());
            stmt.executeUpdate();
            return true;
                    } catch (SQLException deuRuim) {
                        System.err.println("Deu ruim:\nNão adicionado\n"+deuRuim);
                        return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        
        }
        
    
    }
}
