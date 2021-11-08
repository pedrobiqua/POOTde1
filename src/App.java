import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        CadastrarFornecedor fornecedor = new CadastrarFornecedor("Jose Francisco", "Tio", "0967892341", "pedrobiqua@gmail.com", "3456677722", "Curitiba", "PR", "BRASIL", "Silva Jardim", "2/11/2021", 1);
        CadastrarProduto produto = new CadastrarProduto("Coca", 20, 3.00f, fornecedor);
        CadastrarCliente clientObject = new CadastrarCliente("KAUE", "FRANCISCO", "24/09/2001", "3466-6969", "099.999.000-00", "CURITIBA", "PR", "Brasil", "Rua do Leão", "13/10/2021", 1);
        ListarCliente listarCliente = new ListarCliente();
        ListarProduto listarProduto = new ListarProduto();
        ListarFornecedor listarFornecedor = new ListarFornecedor();
        Scanner scan = new Scanner(System.in);

        System.out.println("Login: ");
        String admLogin = scan.nextLine();

        System.out.println("Senha: ");
        String admSenha = scan.nextLine();

        listarFornecedor.adicCadastrarFornecedor(fornecedor);
        listarCliente.adicCadastrarCliente(clientObject);
        listarProduto.adicCadastrarProduto(produto);

        listarProduto.MostraProduto(produto);
        boolean run = true;
        //listarProduto.MostraProduto(produto);
        while(run){
            if (admLogin.equals("admin") && admSenha.equals("admin")) {
                Menu.RodarMenu();
                run = false;
            }
        }
        scan.close();
        
    }
}
