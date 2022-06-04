
package conexao;

import cadastros.Transporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoTransporte {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarMotorista(Transporte objCadastroMotorista){
        String sql = "insert into transporte (idMotorista, nome, cpf, emailPessoal, contatoTelefonico, categoriaCnh, cargo) values (default, ?,?,?,?,?,?)";
        
        conn = new ConexaoCadastros().conectaBD();
        
        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1 , objCadastroMotorista.getNome());
            pstm.setString(2 , objCadastroMotorista.getCpf());
            pstm.setString(3 , objCadastroMotorista.getEmail());
            pstm.setString(4 , objCadastroMotorista.getContatoTelefonico());
            pstm.setString(5 , objCadastroMotorista.getCategoriaCnh());
            pstm.setString(6 , objCadastroMotorista.getCargo());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
            
        } catch (SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Conexao_Motorista "+ erro );
        }
    
    
    }
}