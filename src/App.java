public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("O sistema ainda está em desenvolvimento");

        CadastrarCliente cliente1 = new CadastrarCliente("Pedro", "Quadros", "24 de maio", "3333-3333", "909090-9090-09", "Curitiba", "Paraná", "Brasil", "Rua do Governador", "05 de out", 01);
        CadastrarFornecedor fornecedor1;

        ListarCliente lista = new ListarCliente();

        lista.adicCadastrarCliente(cliente1);

        lista.MostarClientes(lista.getListarCliente());

    }
}
