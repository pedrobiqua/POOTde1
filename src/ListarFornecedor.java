import java.util.ArrayList;

public class ListarFornecedor {

    private ArrayList<CadastrarFornecedor> ListarFornecedor;

    public ListarFornecedor() {
        this.ListarFornecedor = new ArrayList<CadastrarFornecedor>();

    }

    public void MostarFornecedor(ArrayList<CadastrarFornecedor> mostra) {
        for (int i = 0; i < mostra.size(); i++) {
            System.out.println(mostra.get(i).getNomeFornecedor());
            System.out.println(mostra.get(i).getRazaoSocial());
            //por enquanto isso...
        }

    }

    public void adicCadastrarFornecedor(CadastrarFornecedor CadastrarFornecedor){
        this.ListarFornecedor.add(CadastrarFornecedor); //Adiciona na ListarFornecedor
    }

    public ArrayList<CadastrarFornecedor> getListarFornecedor() {
        return ListarFornecedor;
    }
}