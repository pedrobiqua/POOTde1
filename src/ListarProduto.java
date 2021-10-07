import java.util.ArrayList;

public class ListarProduto {

    private ArrayList<CadastrarProduto> ListarProduto;

    public ListarProduto() {
        this.ListarProduto = new ArrayList<CadastrarProduto>();
    }

    public void MostraProduto(ArrayList<CadastrarProduto> mostra) {
        for (int i = 0; i < mostra.size(); i++) {
            System.out.println(mostra.get(i).getDescricao());
            System.out.println(mostra.get(i).getQuantidade());
            System.out.println(mostra.get(i).getPreço());
            System.out.println(mostra.get(i).getFornecedor());
        }
    }

    public void adicCadastrarProduto(CadastrarProduto CadastrarProduto) {
        ArrayDeLista.getListarProduto().add(CadastrarProduto); //Adiciona na ListarProduto
    }

    public ArrayList<CadastrarProduto> getListarProduto() {
        return ListarProduto;
    }
}