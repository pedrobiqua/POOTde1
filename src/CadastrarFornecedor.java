public class CadastrarFornecedor {

    private String NomeFornecedor;
    private String RazaoSocial;
    private String CNPJ;
    private String Email;
    private String Telefone;
    private String Cidade;
    private String Estado;
    private String Pais;
    private String Endereco;
    private int Numero;
    private String DataCadastro;

    public CadastrarFornecedor(String NomeFornecedor, String RazaoSocial, String CNPJ,String Email,
                            String Telefone, String Cidade, String Estado, String Pais, String Endereço,
                            String DataDeCadastro, int Numero){
        this.NomeFornecedor = NomeFornecedor;
        this.RazaoSocial = RazaoSocial;
        this.CNPJ = CNPJ;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Pais = Pais;
        this.Endereço = Endereço;
        this.DataDeCadastro= DataDeCadastro;
        this.Numero = Numero;
    }




    public String getNomeFornecedor() {
        return NomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        NomeFornecedor = nomeFornecedor;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        RazaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        DataCadastro = dataCadastro;
    }
}
