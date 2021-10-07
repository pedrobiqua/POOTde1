import java.util.ArrayList;

public class ListarFornecedor {

    private ArrayList<CadastrarFornecedor> ListarFornecedor;

    public ListarFornecedor() {
        this.ListarFornecedor = new ArrayList<CadastrarFornecedor>();
    }

    public void MostraFornecedor(ArrayList<CadastrarFornecedor> mostra) {
        for (int i = 0; i < mostra.size(); i++) {
            System.out.println(mostra.get(i).getNomeFornecedor());
            System.out.println(mostra.get(i).getRazaoSocial());
            System.out.println(mostra.get(i).getCNPJ());
            System.out.println(mostra.get(i).getEmail());
            System.out.println(mostra.get(i).getTelefone());
            System.out.println(mostra.get(i).getCidade());
            System.out.println(mostra.get(i).getEstado());
            System.out.println(mostra.get(i).getPais());
            System.out.println(mostra.get(i).getEndereco());
            System.out.println(mostra.get(i).getNumero());
            System.out.println(mostra.get(i).getDataCadastro());
        }
    }

    public void adicCadastrarFornecedor(CadastrarFornecedor CadastrarFornecedor){
        ArrayDeLista.getListarFornecedor().add(CadastrarFornecedor); //Adiciona na ListarFornecedor
    }

    public ArrayList<CadastrarFornecedor> getListarFornecedor() {
        return ListarFornecedor;
    }
}