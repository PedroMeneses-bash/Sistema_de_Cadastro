
package cadastros;

public abstract class Pessoa {
 
    protected String nome;
    protected String cpf;
    protected String email;
    protected String contatoTelefonico;
    
    public abstract void registrarBiometria();

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContatoTelefonico() {
        return contatoTelefonico;
    }

    public void setContatoTelefonico(String contatoTelefonico) {
        this.contatoTelefonico = contatoTelefonico;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", contatoTelefonico=" + contatoTelefonico;
    }
    
    
    
    
}