
package cadastros;


public class Vendas extends Funcionario{
    
    
    public void vender(){
        
        System.out.println("Venda realizada!");
        
    }
    
     @Override
    public void registrarBiometria() {
        System.out.println("Biometria do cotador atualizada.");
    }
    
    
}
