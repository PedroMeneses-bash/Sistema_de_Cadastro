
package cadastros;


public class Fornecedor extends Pessoa implements Temporario{

    private String cnpj;
    private String razaoSocial;
          
    
    @Override
    public void registrarBiometria() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void registroDeBiometriaTemporaria() {
        System.out.println("Registro Válido por 7 dias. ");
    }
    
    
}
