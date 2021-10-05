public class CadastrarProduto {

    private String Descricao;
    private int Quantidade;
    private Float Preço;
    private String Fornecedor;

    public CadastrarProduto(String Descricao, int Quantidade, Float Preço,String Fornecedor){
        this.Descricao = Descricao;
        this.Quantidade = Quantidade;
        this.Preço = Preço;
        this.Fornecedor = Fornecedor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public Float getPreço() {
        return Preço;
    }

    public void setPreço(Float preço) {
        Preço = preço;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        Fornecedor = fornecedor;
    }

}
