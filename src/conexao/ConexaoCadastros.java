
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoCadastros {    
    
    public Connection conectaBD(){
        Connection conn = null;
        
        
        try {            
            String url = "jdbc:mysql://localhost:3306/cadastro_sistema_erp_bd?user=root&password=";
            conn = DriverManager.getConnection(url);           
                        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Conexao_Cadastro_Home " + erro.getMessage());
        }
        return conn;
                   
        
    }  
        
}