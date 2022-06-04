
package cadastros;

public class Transporte extends Funcionario{
    
    private String categoriaCnh;
    
    public void transportar(boolean frete){
        if ( frete ){
            
            System.out.println("Motorista retirou mercaria e será entregue no local.");
            
        }else {
            
            System.out.println("Mercadoria disponivel para retirada.");
        }
                       
    }
    public void transportar (float valorFrete ){
        if ( valorFrete > 60 ){
            System.out.println("A mercadoria será entregue em até 24h");
        }else {
            System.out.println("Mercadoria será entregue em até 30 dias");
        }
    }
    
    
    @Override
    public void registrarBiometria() {
        System.out.println("Biometria do motorista atualizada.");
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }
    
    
    
}
