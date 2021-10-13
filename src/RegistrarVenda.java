import java.util.Scanner;

public class RegistrarVenda {
    private int clienteDaVenda;
    private String tipoDoPagamento;
    private float precoProduto;
    private float pagCredito;
    private float pagDebito;
    private float pagDinheiro;

    //======Get=====

    public int getClienteDaVenda() {
        return clienteDaVenda;
    }

    public float getPagCredito() {
        return pagCredito;
    }

    public float getPagDebito() {
        return pagDebito;
    }

    public float getPagDinheiro() {
        return pagDinheiro;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public String getTipoDoPagamento() {
        return tipoDoPagamento;
    }

    //======Set=====

    public void setClienteDaVenda(int clienteDaVenda) {
        this.clienteDaVenda = clienteDaVenda;
    }

    public void setPagCredito(float pagCredito) {
        this.pagCredito = pagCredito;
    }

    public void setPagDebito(float pagDebito) {
        this.pagDebito = pagDebito;
    }

    public void setPagDinheiro(float pagDinheiro) {
        this.pagDinheiro = pagDinheiro;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setTipoDoPagamento(String tipoDoPagamento) {
        this.tipoDoPagamento = tipoDoPagamento;
    }
    
    //Antes de aplicar a função de Vender temos que fazer um scanner para colocar o numero do cliente;
    public void Vender(int numeroCliente) {
        for (int i = 0; i < ArrayDeLista.getListarCliente().size(); i++) {
            if (ArrayDeLista.getListarCliente().get(i).getNumero() == numeroCliente) {
                
                clienteDaVenda = ArrayDeLista.getListarCliente().get(i).getNumero();
                var listaProdutos = new ListarProduto();
                listaProdutos.MostraProduto(ArrayDeLista.getListarProduto());
                Scanner scannerRegistro = new Scanner(System.in);
                System.out.printf("Qual desses produtos deseja comprar? : ");
                String compra = scannerRegistro.next();

                for (int j = 0; j < ArrayDeLista.getListarProduto().size(); j++) {
                    if (compra.equals(ArrayDeLista.getListarProduto().get(j).getDescricao())){

                        //Realizar a compra em si.
                        Scanner tipoPagamento = new Scanner(System.in);
                        System.out.println("Qual será a forma de pagamento? (1)-Crédito\n(2)-Débito\n(3)-Dinheiro");
                        int formaPag = tipoPagamento.nextInt();


                        switch (formaPag) {
                            case 1: 

                                
                                float precoCredito = ArrayDeLista.getListarProduto().get(j).getPreço();
                                pagCredito += precoCredito;

                                int diminuirEstoque = ArrayDeLista.getListarProduto().get(j).getQuantidade() - 1;
                                
                                ArrayDeLista.getListarProduto().get(j).setQuantidade(diminuirEstoque);
                                System.out.printf("O estoque do produto comprado agora é " + diminuirEstoque);
                                tipoDoPagamento = "Crédito";
                                break;
                        
                            case 2:
                                float precoDebito = ArrayDeLista.getListarProduto().get(j).getPreço();
                                pagDebito += precoDebito;

                                int diminuirEstoque1 = ArrayDeLista.getListarProduto().get(j).getQuantidade() - 1;
                                
                                ArrayDeLista.getListarProduto().get(j).setQuantidade(diminuirEstoque1);
                                System.out.printf("O estoque do produto comprado agora é ", diminuirEstoque1);
                                tipoDoPagamento = "Débito";
                                break;
                            
                            case 3:
                                float precoDinheiro = ArrayDeLista.getListarProduto().get(j).getPreço();
                                pagDinheiro += precoDinheiro;

                                int diminuirEstoque2 = ArrayDeLista.getListarProduto().get(j).getQuantidade() - 1;
                                
                                ArrayDeLista.getListarProduto().get(j).setQuantidade(diminuirEstoque2);
                                System.out.printf("O estoque do produto comprado agora é ", diminuirEstoque2);
                                tipoDoPagamento = "Dinheiro";
                                break;

                            default:
                                System.out.println("Nenhum tipo de pagamento foi aceito");
                                break;
                        }

                    }else {
                        System.out.println("Esse produto não está em estoque");
                    }
                }
            }else{
                System.out.println("Esse numero de cliente não existe");
            }
        }
    }

    public RegistrarVenda(int numeroCliente){
        Vender(numeroCliente);  // Toda vez que o programa instaciar o RegistrarVenda irá rodar a função de venda, utilizando o numero do cliente
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
