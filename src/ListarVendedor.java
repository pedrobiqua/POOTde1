import java.util.ArrayList;

public class ListarVendedor {


    private ArrayList<CadastrarVendedor> ListarVendedor;

    public ListarVendedor() {
        this.ListarVendedor = new ArrayList<CadastrarVendedor>();
    }

    public void MostraVendedor(ArrayList<CadastrarVendedor> mostra) {
        for (int i = 0; i < mostra.size(); i++) {
            System.out.println(mostra.get(i).getNome());
            System.out.println(mostra.get(i).getSobrenome());
            //por enquanto isso...
        }
    }

    public void adicCadastrarVendedor(CadastrarVendedor CadastrarVendedor) {
        this.ListarVendedor.add(CadastrarVendedor); //Adiciona na ListarVendedor
    }

    public ArrayList<CadastrarVendedor> getListarVendedor() {
        return ListarVendedor;
    }
}