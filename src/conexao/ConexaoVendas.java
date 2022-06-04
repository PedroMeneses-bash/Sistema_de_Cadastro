
package conexao;

import cadastros.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoVendas {
    
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarVendedor(Vendas objCadastroVendas){
        String sql = "insert into vendas (idVendedor, nome, cpf, emailPessoal, contatoTelefonico, cargo) values (default, ?,?,?,?,?)";
        
        conn = new ConexaoCadastros().conectaBD();
        
        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1 , objCadastroVendas.getNome());
            pstm.setString(2 , objCadastroVendas.getCpf());
            pstm.setString(3 , objCadastroVendas.getEmail());
            pstm.setString(4 , objCadastroVendas.getContatoTelefonico());
            pstm.setString(5 , objCadastroVendas.getCargo());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
            
        } catch (SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Conexao_Vendas "+ erro );
        }
        
    }
    
    
}
