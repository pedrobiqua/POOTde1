import java.util.Scanner;

public class RegistrarVenda {
    private int clienteDaVenda;
    private float precoProduto;
    private float pagCredito;
    private float pagDebito;
    private float pagDinheiro;

    //Antes de aplicar a função de Vender temos que fazer um scanner para colocar o numero do cliente;
    public void Vender(int numeroCliente) {
        for (int i = 0; i < ArrayDeLista.getListarCliente().size(); i++) {
            if (ArrayDeLista.getListarCliente().get(i).getNumero() == numeroCliente) {
                
                clienteDaVenda = ArrayDeLista.getListarCliente().get(i).getNumero();
                var listaProdutos = new ListarProduto();
                listaProdutos.MostraProduto(ArrayDeLista.getListarProduto());
                Scanner scannerRegistro = new Scanner(System.in);
                System.out.println("Qual desses produtos deseja comprar? : ");
                String compra = scannerRegistro.next();

                for (int j = 0; j < ArrayDeLista.getListarProduto().size(); j++) {
                    if (ArrayDeLista.getListarProduto().get(j).getDescricao() == compra) {

                        //Realizar a compra em si.
                        Scanner tipoPagamento = new Scanner(System.in);
                        System.out.println("Qual será a forma de pagamento? ");
                        String formaPag = tipoPagamento.next();
                        switch (formaPag) {
                            case "crédito": 

                                
                                float precoCredito = ArrayDeLista.getListarProduto().get(j).getPreço();
                                pagCredito += precoCredito;

                                int diminuirEstoque = ArrayDeLista.getListarProduto().get(j).getQuantidade() - 1;
                                
                                ArrayDeLista.getListarProduto().get(j).setQuantidade(diminuirEstoque);
                                System.out.printf("O estoque do produto comprado agora é ", diminuirEstoque);
                                break;
                        
                            case "débito":
                                float precoDebito = ArrayDeLista.getListarProduto().get(j).getPreço();
                                pagDebito += precoDebito;

                                int diminuirEstoque1 = ArrayDeLista.getListarProduto().get(j).getQuantidade() - 1;
                                
                                ArrayDeLista.getListarProduto().get(j).setQuantidade(diminuirEstoque1);
                                System.out.printf("O estoque do produto comprado agora é ", diminuirEstoque1);
                                break;
                            
                            case "dinheiro":
                                float precoDinheiro = ArrayDeLista.getListarProduto().get(j).getPreço();
                                pagDinheiro += precoDinheiro;

                                int diminuirEstoque2 = ArrayDeLista.getListarProduto().get(j).getQuantidade() - 1;
                                
                                ArrayDeLista.getListarProduto().get(j).setQuantidade(diminuirEstoque2);
                                System.out.printf("O estoque do produto comprado agora é ", diminuirEstoque2);
                                break;

                            default:
                                System.out.println("Nenhum tipo de pagamento foi aceito");
                                break;
                        }

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
        Vender(numeroCliente);// Toda vez que o programa instaciar o RegistrarVenda irá rodar a função de venda, utilizando o numero do cliente
        //Digitado anterioriamente.
        
    }
    public static void ValidarVenda(int numeroCliente) {
        for (int i = 0; i < ArrayDeLista.getRegistro().size(); i++) {
            if (ArrayDeLista.getRegistro().get(i).clienteDaVenda == numeroCliente) {
                System.out.println("Compra autorizada");
            }else{
                System.out.println("Compra não autorizada");
            }
        }
    }
}
