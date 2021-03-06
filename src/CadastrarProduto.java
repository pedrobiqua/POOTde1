public class CadastrarProduto {


    //Declarando as Variaveis...
    private String Descricao;
    private int Quantidade;
    private Float Preço;
    private String Fornecedor; //Depois colocar para tipo Cadastrar Fornecedor
    private CadastrarFornecedor Forrnecedor1;

    //construtor antigo da classe
    public CadastrarProduto(String Descricao, int Quantidade, Float Preço,String Fornecedor){ //Modo antigo
        this.Descricao = Descricao;
        this.Quantidade = Quantidade;
        this.Preço = Preço;
        this.Fornecedor = Fornecedor;
    }

    //construtor da classe
    public CadastrarProduto(String Descricao, int Quantidade, Float Preço,CadastrarFornecedor Fornecedor){
        this.Descricao = Descricao;
        this.Quantidade = Quantidade;
        this.Preço = Preço;
        this.Forrnecedor1 = Fornecedor;
    }

    //Declarando Método Get e Set
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

    public CadastrarFornecedor getForrnecedor1() {
        return Forrnecedor1;
    }

    public void setForrnecedor1(CadastrarFornecedor forrnecedor1) {
        Forrnecedor1 = forrnecedor1;
    }
    
}
