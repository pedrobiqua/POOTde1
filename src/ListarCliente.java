import java.util.ArrayList;

public class ListarCliente {

    private ArrayList<CadastrarCliente> ListarCliente;

    public ListarCliente() {
        this.ListarCliente = new ArrayList<CadastrarCliente>();

    }

    public void MostraClientes(ArrayList<CadastrarCliente> mostra) {
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
            System.out.println(mostra.get(i).getNumero());
        }
    }

    public void adicCadastrarCliente(CadastrarCliente cadastrarCliente){
        this.ListarCliente.add(cadastrarCliente); //Adiciona na listarCliente
    }

    public ArrayList<CadastrarCliente> getListarCliente() {
        return ListarCliente;
    }
}
