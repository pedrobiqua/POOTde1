import java.util.ArrayList;

public class ArrayDeLista {

    private static ArrayList<CadastrarCliente> ListarCliente = new ArrayList<CadastrarCliente>();
    private static ArrayList<CadastrarFornecedor> ListarFornecedor = new ArrayList<CadastrarFornecedor>();
    private static ArrayList<CadastrarProduto> ListarProduto = new ArrayList<CadastrarProduto>();
    private static ArrayList<CadastrarVendedor> ListarVendedor = new ArrayList<CadastrarVendedor>();
    private static ArrayList<RegistrarVenda> Registro = new ArrayList<RegistrarVenda>();
    

    public static void setListarProduto(ArrayList<CadastrarProduto> listarProduto) {
        ListarProduto = listarProduto;
    }

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

    public static ArrayList<RegistrarVenda> getRegistro() {
        return Registro;
    }
}
