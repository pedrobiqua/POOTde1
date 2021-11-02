import java.util.ArrayList;

public class ListarProduto {

    private ArrayList<CadastrarProduto> ListarProduto;

    public ListarProduto() {
        this.ListarProduto = new ArrayList<CadastrarProduto>();
    }

    public void MostraProduto(ArrayList<CadastrarProduto> mostra) {
        for (int i = 0; i < mostra.size(); i++) {
            System.out.println("|____________________________________");
            System.out.println("Descrição: "+ mostra.get(i).getDescricao()+ 
            " | Quantidade de Produtos: "+ mostra.get(i).getQuantidade());
            System.out.println("Preço do Produto: " + mostra.get(i).getPreço());
            System.out.println("Fornecedor: " + mostra.get(i).getForrnecedor1().getRazaoSocial());
            System.out.println("|____________________________________");
        }
    }
 //Apenas para teste, SOBRECARGA DE METODO
    public void MostraProduto(CadastrarProduto mostra) {
        
        System.out.println("Descrição: "+ mostra.getDescricao()+ 
        " | Quantidade de Produtos: "+ mostra.getQuantidade());
        System.out.println("Preço do Produto: " + mostra.getPreço());
        System.out.println("Fornecedor: " + mostra.getForrnecedor1().getRazaoSocial());
        
    }

    public void adicCadastrarProduto(CadastrarProduto CadastrarProduto) {
        ArrayDeLista.getListarProduto().add(CadastrarProduto); //Adiciona na ListarProduto
    }

    public ArrayList<CadastrarProduto> getListarProduto() {
        return ListarProduto;
    }
}