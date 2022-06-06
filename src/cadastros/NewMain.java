
package cadastros;

public class NewMain {

    public static void main(String[] args) {
        
        //------------------------------------------------------------------------------
        Funcionario vendedor1 = new Vendas();
        
        vendedor1.setNome("Vinicius Jose Abrantes");
        vendedor1.setCpf("12598574536l");
        vendedor1.setEmail("vinicius2001@hotmail.com");
        vendedor1.setContatoTelefonico("(71)3387-8247");
        vendedor1.setMatriculaFunc(20220508);
        vendedor1.setCargo("Aux Adm II");
        System.out.println(vendedor1.toString() + ", Matricula= " +vendedor1.getMatriculaFunc()+ ", Cargo= " + vendedor1.getCargo());
        vendedor1.registrarBiometria();
        System.out.println("\n");
        //------------------------------------------------------------------------------
        Financeiro contador1 = new Financeiro();
        
        contador1.setNome("Leonardo Silva");
        contador1.setCpf("054452563647l");
        contador1.setEmail("leo_contabilidade@gmail.com");
        contador1.setContatoTelefonico("(74)988563214");
        contador1.setMatriculaFunc(202205092);
        contador1.setCargo("Contador");
        contador1.setNumeroCrc("12345");
        contador1.registrarBiometria();
        contador1.pagar();
        System.out.println(contador1.toString()+ ", Matricula= " +vendedor1.getMatriculaFunc()+ ", Cargo= " + vendedor1.getCargo()+ " Numero CRC=" + contador1.getNumeroCrc());
        System.out.println("\n");
        
        //------------------------------------------------------------------------------
        
        Transporte motorista1 = new Transporte();
        
        motorista1.setNome("Charles Leclerc");
        motorista1.setCpf("14565232589");
        motorista1.setEmail("charlinho_leclerc2022@ferrari.com.it");
        motorista1.setContatoTelefonico("(71)988218899");
        motorista1.setMatriculaFunc(20220509);
        motorista1.setCargo("Motorista");
        motorista1.setCategoriaCnh("B");
        motorista1.registrarBiometria();
        System.out.println(motorista1.toString()+ ", Matricula= " +motorista1.getMatriculaFunc()+ ", Cargo= " + motorista1.getCargo() + " com CNH categoria "+motorista1.getCategoriaCnh());
        motorista1.transportar(true);
        motorista1.transportar(85.20f);
        System.out.println("\n");
        //---------------------------------------------------------------------------
          
        Fornecedor representante1 = new Fornecedor();

        representante1.setNome("Joey Witson");
        representante1.setEmail("witson_joey@angolini.com.us");
        representante1.setContatoTelefonico("(71)36954523");
        representante1.setCnpj("44829653000153l");
        representante1.setRazaoSocial("Angolini & Angolini Ltda.");
        System.out.println("\n");
        
        //---------------------------------------------------------------------------
                
        
               
        
    }
    
    
}
