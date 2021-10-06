public class CadastrarCliente {

    //Declarando as Variaveis...
    private String Nome;
    private String Sobrenome;
    private String dataDeNascimento;
    private String Telefone;
    private String CPF;
    private String Cidade;
    private String Estado;
    private String Pais = "Brasil"; // Valor default
    private String Endereço;
    private String DataDeCadastro;
    private int Numero;

    public CadastrarCliente(String Nome, String Sobrenome, String dataDeNascimento,String Telefone,
                            String CPF, String Cidade, String Estado, String Pais, String Endereço,
                            String DataDeCadastro, int Numero){
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.Telefone = Telefone;
        this.CPF = CPF;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Pais = Pais;
        this.Endereço = Endereço;
        this.DataDeCadastro = DataDeCadastro;
        this.Numero = Numero;
    }


    //DeclararMetodo
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public String getDataDeCadastro() {
        return DataDeCadastro;
    }

    public void setDataDeCadastro(String dataDeCadastro) {
        DataDeCadastro = dataDeCadastro;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

}
