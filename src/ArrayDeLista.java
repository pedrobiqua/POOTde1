import java.util.ArrayList;

public class ArrayDeLista {

    private static ArrayList<CadastrarCliente> ListarCliente = new ArrayList<CadastrarCliente>();
    private static ArrayList<CadastrarFornecedor> ListarFornecedor = new ArrayList<CadastrarFornecedor>();
    private static ArrayList<CadastrarProduto> ListarProduto = new ArrayList<CadastrarProduto>();
    private static ArrayList<CadastrarVendedor> ListarVendedor = new ArrayList<CadastrarVendedor>();


    public static ArrayList<CadastrarVendedor> getListarVendedor() {
        return ListarVendedor;
    }
    
    public static ArrayList<CadastrarProduto> getListarProduto() {
        return ListarProduto;
    }

    public static ArrayList<CadastrarFornecedor> getListarFornecedor() {
        return ListarFornecedor;
    }

    public static ArrayList<CadastrarCliente> getListarCliente() {
        return ListarCliente;
    }
}
