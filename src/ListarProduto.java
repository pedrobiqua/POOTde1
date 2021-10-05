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
            //por enquanto isso...
        }
    }

    public void adicCadastrarProduto(CadastrarProduto CadastrarProduto) {
        this.ListarProduto.add(CadastrarProduto); //Adiciona na ListarProduto
    }

    public ArrayList<CadastrarProduto> getListarProduto() {
        return ListarProduto;
    }
}