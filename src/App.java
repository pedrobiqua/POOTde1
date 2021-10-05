public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("O sistema ainda está em desenvolvimento");

        CadastrarCliente cliente1 = new CadastrarCliente("Pedro", "Quadros", "24 de maio", "3333-3333", "909090-9090-09", "Curitiba", "Paraná", "Brasil", "Rua do Governador", "05 de out", 01);
        CadastrarFornecedor fornecedor1 = new CadastrarFornecedor("João", "João tio da Coca", "9000777", "cocadojoao@gmail.com", "3490-9087", "Matinhos", "Paraná", "Brasil", "Rua Guarapuava", "05 de out", 01);
        CadastrarProduto produto1 = new CadastrarProduto("Coca Geladinha", 10, 3.50f, "João tio da coca");
        CadastrarVendedor vendedor1 = new CadastrarVendedor("Toco", "Silva", "26 de outubro", "3434-3535", "909999-999990-78", "Curitiba", "Paraná", "Brasil", "Rua Rui Barbosa", "05 de out", "toco123", "12345");

        ListarCliente lista = new ListarCliente();

        lista.adicCadastrarCliente(cliente1);

        lista.MostarClientes(lista.getListarCliente());

    }
}
