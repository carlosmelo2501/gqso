
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mike Kennedy
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver" ;
    private static final String URL = "jdbc:mysql://localhost:3306/William_Wonka";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection(){
    
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL,USER,PASSWORD);    
                    
                    } catch (ClassNotFoundException | SQLException deuRuim) {
                        throw new RuntimeException("Erro ao executar", deuRuim);
        }
    
    }
    
    public static void closeConnection (Connection con){
    
        if(con!=null){
            try {
                con.close();
            } catch (SQLException deuRuim) {
                System.err.println("Deu ruim: "+deuRuim); 
            }
        }
    }
    public static void closeConnection (Connection con, PreparedStatement stmt){
    
        if(stmt!=null){
            try {
                con.close();
            } catch (SQLException deuRuim) {
                 System.err.println("Deu ruim: "+deuRuim);
            }
        }
        closeConnection(con);
    }
    public static void closeConnection (Connection con, PreparedStatement stmt, ResultSet rs){
    
        if(rs!=null){
            try {
                con.close();
            } catch (SQLException deuRuim) {
                 System.err.println("Deu ruim: "+deuRuim);
            }
        }
        closeConnection(con,stmt);
    }
}
