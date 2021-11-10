import java.util.ArrayList;

public class ListarFornecedor {

    private ArrayList<CadastrarFornecedor> ListarFornecedor;

    public ListarFornecedor() {
        this.ListarFornecedor = new ArrayList<CadastrarFornecedor>();
    }

    public void MostraFornecedor(ArrayList<CadastrarFornecedor> mostra) {
        for (int i = 0; i < mostra.size(); i++) {
            System.out.println("|____________________________________");
            System.out.println("| Nome do Fornecedor: " + mostra.get(i).getNomeFornecedor());
            System.out.println("| Nome do Razão Social: " + mostra.get(i).getRazaoSocial());
            System.out.println("| CNPJ: " + mostra.get(i).getCNPJ());
            System.out.println("|____________________________________");
            System.out.println("| Email: " + mostra.get(i).getEmail());
            System.out.println("| Telefone: " + mostra.get(i).getTelefone());
            System.out.println("| Cidade: " + mostra.get(i).getCidade());
            System.out.println("| Estado " + mostra.get(i).getEstado());
            System.out.println("| País: " + mostra.get(i).getPais());
            System.out.println("| Email: " + mostra.get(i).getEndereco());
            System.out.println("| Número ID do Fornecedor: " + mostra.get(i).getNumero());
            System.out.println("| Data de Cadastro: " + mostra.get(i).getDataCadastro());
            System.out.println("|____________________________________\n \n");
        }
    }

    public void adicCadastrarFornecedor(CadastrarFornecedor CadastrarFornecedor){
        ArrayDeLista.getListarFornecedor().add(CadastrarFornecedor); //Adiciona na ListarFornecedor
    }

    public ArrayList<CadastrarFornecedor> getListarFornecedor() {
        return ListarFornecedor;
    }
}