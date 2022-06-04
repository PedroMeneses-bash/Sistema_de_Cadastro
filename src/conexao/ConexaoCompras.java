
package conexao;

import cadastros.Compras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoCompras {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarComprador(Compras objcadastrocompras){
        String sql = "insert into compras (idComprador, nome, cpf, emailPessoal, contatoTelefonico, cargo) values (default, ?,?,?,?,?)";
        
        conn = new ConexaoCadastros().conectaBD();
        
        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1 , objcadastrocompras.getNome());
            pstm.setString(2 , objcadastrocompras.getCpf());
            pstm.setString(3 , objcadastrocompras.getEmail());
            pstm.setString(4 , objcadastrocompras.getContatoTelefonico());
            pstm.setString(5 , objcadastrocompras.getCargo());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
            
        } catch (SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Conexao_Compras "+ erro );
        }
        
    }
    
    
    
    
}
