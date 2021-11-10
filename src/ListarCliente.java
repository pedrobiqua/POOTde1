import java.util.ArrayList;

public class ListarCliente {

    private ArrayList<CadastrarCliente> ListarCliente;

    public ListarCliente() {
        this.ListarCliente = new ArrayList<CadastrarCliente>();

    }

    public void MostraClientes(ArrayList<CadastrarCliente> mostra) {
        for (int i = 0; i < mostra.size(); i++) { //print da lista de clientes
            System.out.println("|___________________________________");
            System.out.println("| Nome do cliente: " + mostra.get(i).getNome() + " " + mostra.get(i).getSobrenome());
            System.out.println("|___________________________________");
            System.out.println("| Data de Nascimento: " + mostra.get(i).getDataDeNascimento());
            System.out.println("|___________________________________");
            System.out.println("| Telefone: " + mostra.get(i).getTelefone());
            System.out.println("| CPF: " + mostra.get(i).getCPF());
            System.out.println("| Cidade: " + mostra.get(i).getCidade()+" Estado: " + mostra.get(i).getEstado());
            System.out.println("| Endereço: " + mostra.get(i).getEndereço());
            System.out.println("| País: " + mostra.get(i).getPais());
            System.out.println("|___________________________________");
            System.out.println("| Data do Cadastro: " + mostra.get(i).getDataDeCadastro());
            System.out.println("| Número ID do cliente: " + mostra.get(i).getNumero());
            System.out.println("|___________________________________\n \n");
        }
    }

    public void adicCadastrarCliente(CadastrarCliente cadastrarCliente){
        ArrayDeLista.getListarCliente().add(cadastrarCliente); //Adiciona na ListarCliente
    }

    public ArrayList<CadastrarCliente> getListarCliente() {
        return ListarCliente;
    }
}
