
package conexao;

import cadastros.Financeiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoFinanceiro {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarContador(Financeiro objCadastroContador){
        String sql = "insert into financeiro (idContador, nome, cpf, emailPessoal, contatoTelefonico, numeroCrc, cargo) values (default, ?,?,?,?,?,?)";
        
        conn = new ConexaoCadastros().conectaBD();
        
        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1 , objCadastroContador.getNome());
            pstm.setString(2 , objCadastroContador.getCpf());
            pstm.setString(3 , objCadastroContador.getEmail());
            pstm.setString(4 , objCadastroContador.getContatoTelefonico());
            pstm.setString(5 , objCadastroContador.getNumeroCrc());
            pstm.setString(6 , objCadastroContador.getCargo());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
            
        } catch (SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Conexao_Financeiro "+ erro );
        }
        
    }
    
    
    
}
