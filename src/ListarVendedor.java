import java.util.ArrayList;

public class ListarVendedor {


    private ArrayList<CadastrarVendedor> ListarVendedor;

    public ListarVendedor() {
        this.ListarVendedor = new ArrayList<CadastrarVendedor>();
    }

    public void MostraVendedor(ArrayList<CadastrarVendedor> mostra) {
        for (int i = 0; i < mostra.size(); i++) {
            System.out.println("|____________________________________");
            System.out.println("| Nome do Vendedor: " + mostra.get(i).getNome() + " " + mostra.get(i).getSobrenome());
            System.out.println("|____________________________________");
            System.out.println("| Data de Nascimento: " + mostra.get(i).getDataDeNascimento());
            System.out.println("| Telefone: " + mostra.get(i).getTelefone());
            System.out.println("| CPF: " + mostra.get(i).getCPF());
            System.out.println("| Cidade: " + mostra.get(i).getCidade());
            System.out.println("| Estado: " + mostra.get(i).getEstado());
            System.out.println("| País: " + mostra.get(i).getPais());
            System.out.println("| Endereço: " + mostra.get(i).getEndereço());
            System.out.println("| Data do Cadastro: " + mostra.get(i).getDataDeCadastro());
            System.out.println("|____________________________________ \n \n");
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