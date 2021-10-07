import java.util.Scanner;

public class RegistrarVenda {
    private CadastrarCliente clienteDaVenda;
    private String tipoPagamento;

    //Antes de aplicar a função de Vender temos que fazer um scanner para colocar o numero do cliente;
    public void Vender(int numeroCliente) {
        for (int i = 0; i < ArrayDeLista.getListarCliente().size(); i++) {
            if (ArrayDeLista.getListarCliente().get(i).getNumero() == numeroCliente) {
                var listaProdutos = new ListarProduto();
                listaProdutos.MostraProduto(ArrayDeLista.getListarProduto());
                Scanner scannerRegistro = new Scanner(System.in);
                System.out.println("Qual desses produtos deseja comprar? : ");
                String compra = scannerRegistro.next();
                for (int j = 0; j < ArrayDeLista.getListarProduto().size(); j++) {
                    if (ArrayDeLista.getListarProduto().get(j).getDescricao() == compra) {
                        //Realizar a compra em si.
                    }else {
                        System.out.println("Esse produto não está em estoque");
                        break;
                    }
                }
                break;
            }else{
                System.out.println("Esse numero de cliente não existe");
            }
        }
    }

    public RegistrarVenda(int numeroCliente){
        
        
    }
    public static void ValidarVenda() {
        
    }
}
