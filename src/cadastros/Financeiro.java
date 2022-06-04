
package cadastros;

public class Financeiro extends Funcionario{
    
    private String numeroCrc;
    
    public void pagar(){
        System.out.println("Pagamento realizado.");
        
    }
    @Override
    public void registrarBiometria() {
        System.out.println("Biometria do contador atualizada.");
    }

    public String getNumeroCrc() {
        return numeroCrc;
    }

    public void setNumeroCrc(String numeroCrc) {
        this.numeroCrc = numeroCrc;
    }
    
    
}
