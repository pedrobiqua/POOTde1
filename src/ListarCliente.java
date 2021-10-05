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
            //por enquanto isso...
        }

    }

    public void adicCadastrarCliente(CadastrarCliente cadastrarCliente){
        this.ListarCliente.add(cadastrarCliente); //Adiciona na listarCliente
    }

    public ArrayList<CadastrarCliente> getListarCliente() {
        return ListarCliente;
    }
}
