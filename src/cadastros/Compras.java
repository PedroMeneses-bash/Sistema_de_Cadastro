
package cadastros;

public class Compras extends Funcionario{
    
    public void comprar(){
        System.out.println("Compra de insumos realizada.");
        
    }
    
    @Override
    public void registrarBiometria() {
        System.out.println("Biometria do cotador atualizada.");
    }
    
    
}
