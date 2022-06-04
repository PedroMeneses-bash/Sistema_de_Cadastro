
package cadastros;


public class Funcionario extends Pessoa{
    
    private int matriculaFunc;
    private String cargo;
    
    public void deixarCargo(){
        
    }
    
    @Override
    public void registrarBiometria() {
    }

    public int getMatriculaFunc() {
        return matriculaFunc;
    }

    public void setMatriculaFunc(int matriculaFunc) {
        this.matriculaFunc = matriculaFunc;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    
}
