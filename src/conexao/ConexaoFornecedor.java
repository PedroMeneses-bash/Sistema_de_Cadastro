
package conexao;

import cadastros.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoFornecedor {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarFornecedor(Fornecedor objCadastroMotorista){
        String sql = "insert into fornecedor (idFornecedor, nome, cpf, emailPessoal, contatoTelefonico, cnpj, razaoSocial) values (default, ?,?,?,?,?,?)";
        
        conn = new ConexaoCadastros().conectaBD();
        
        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1 , objCadastroMotorista.getNome());
            pstm.setString(2 , objCadastroMotorista.getCpf());
            pstm.setString(3 , objCadastroMotorista.getEmail());
            pstm.setString(4 , objCadastroMotorista.getContatoTelefonico());
            pstm.setString(5 , objCadastroMotorista.getCnpj());
            pstm.setString(6 , objCadastroMotorista.getRazaoSocial());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
            
        } catch (SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Conexao_Fornecedor "+ erro );
        }
    
    
    }
    
    
}
