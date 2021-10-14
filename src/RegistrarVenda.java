import java.util.Scanner;

public class RegistrarVenda {
    private int clienteDaVenda;
    private String tipoDoPagamento;
    private float precoProduto;
    private float pagCredito = 0f;
    private float pagDebito = 0f;
    private float pagDinheiro = 0f;
    private float parcela = 0f;
    private float juros = 0f;
    private float jurosTotal = 0f;

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

                                Scanner parcelamento = new Scanner(System.in);
                                System.out.println("Quer parcelar? Em quantas vezes? (Máximo 10 vezes, digite 1 para pagar à vista)");
                                int parcelas = parcelamento.nextInt();

                                switch (parcelas) {
                                    case 1:
                                    System.out.format("Selecionado: Pagamento à vista no preço de %f \n", precoCredito);
                                    break;

                                    case 2:
                                    parcela = precoCredito / 2;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", parcela);
                                    break;

                                    case 3:
                                    parcela = precoCredito / 3;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", parcela);
                                    break;

                                    case 4:
                                    parcela = precoCredito / 4;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", parcela);
                                    break;

                                    case 5:
                                    parcela = precoCredito / 5;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", parcela);
                                    break;

                                    case 6:
                                    parcela = precoCredito / 6;
                                    juros = parcela + (parcela / 100 * 5);
                                    jurosTotal = juros * 6; 
                                    precoCredito = jurosTotal;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", juros);
                                    break;

                                    case 7:
                                    parcela = precoCredito / 7;
                                    juros = parcela + (parcela / 100 * 5);
                                    jurosTotal = juros * 7;
                                    precoCredito = jurosTotal;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", juros);
                                    break;

                                    case 8:
                                    parcela = precoCredito / 8;
                                    juros = parcela + (parcela / 100 * 5);
                                    jurosTotal = juros * 8;
                                    precoCredito = jurosTotal;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", juros);
                                    break;

                                    case 9:
                                    parcela = precoCredito / 9;
                                    juros = parcela + (parcela / 100 * 5);
                                    jurosTotal = juros * 9;
                                    precoCredito = jurosTotal;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", juros);
                                    break;

                                    case 10:
                                    parcela = precoCredito / 10;
                                    juros = parcela + (parcela / 100 * 5);
                                    jurosTotal = juros * 10;
                                    precoCredito = jurosTotal;
                                    System.out.format("Selecionado: Pagamento em 2 parcelas no preço de %f cada \n", juros);
                                    break;
                                }

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
