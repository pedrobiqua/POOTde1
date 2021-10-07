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
            System.out.println(mostra.get(i).getDataDeNascimento());
            System.out.println(mostra.get(i).getTelefone());
            System.out.println(mostra.get(i).getCPF());
            System.out.println(mostra.get(i).getCidade());
            System.out.println(mostra.get(i).getEstado());
            System.out.println(mostra.get(i).getPais());
            System.out.println(mostra.get(i).getEndereço());
            System.out.println(mostra.get(i).getDataDeCadastro());
            //falta senha e login
        }
    }

    public void adicCadastrarVendedor(CadastrarVendedor CadastrarVendedor) {
        ArrayDeLista.getListarVendedor().add(CadastrarVendedor); //Adiciona na ListarVendedor
    }

    public ArrayList<CadastrarVendedor> getListarVendedor() {
        return ListarVendedor;
    }
}