public class Validacao {
    public static void EditarCliente(String VariavelEditavel, int i, String alteracao) {
        switch (VariavelEditavel) {
            case "1":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setNome(alteracao);
                    }
                }
                break;
            case "2":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setSobrenome(alteracao);
                    }
                }
                break;
            case "3":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setDataDeNascimento(alteracao);
                    }
                }
                break;
            case "4":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setTelefone(alteracao);
                    }
                }
                break;
            case "5":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setCPF(alteracao);
                    }
                }
                break;
            case "6":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setCidade(alteracao);
                    }
                }
                break;
            case "7":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setEstado(alteracao);
                    }
                }
                break;
            case "8":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setPais(alteracao);
                    }
                }
                break;
            case "9":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setEndereço(alteracao);
                    }
                }
                break;
            case "10":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setDataDeCadastro(alteracao);
                    }
                }
                break;
            
            default:
                System.out.println("Não existe esse campo. . .");
                break;
        }
    }

    public static void RemoverCliente(int Cliente) {
        for (int i = 0; i < ArrayDeLista.getListarCliente().size(); i++) {
            if (ArrayDeLista.getListarCliente().get(i).getNumero() == Cliente) {
                ArrayDeLista.getListarCliente().remove(i);
            }
        }
    }
    //--------------------------------------------------------
    public static void EditarVendedor(String NumeroAlteracao, String alteracao, String cpf) {
        switch (NumeroAlteracao) {
            case "1":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setNome(alteracao);
                    }
                }
                break;
            case "2":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setSobrenome(alteracao);
                    }
                }
                break;
            case "3":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setDataDeNascimento(alteracao);
                    }
                }
                break;
            case "4":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setTelefone(alteracao);
                    }
                }
                break;
            case "5":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setCPF(alteracao);
                    }
                }
                break;
            case "6":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setCidade(alteracao);
                    }
                }
                break;
            case "7":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setEstado(alteracao);
                    }
                }
                break;
            case "8":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setPais(alteracao);
                    }
                }
                break;
            case "9":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setEndereço(alteracao);
                    }
                }
                break;
            case "10":
                for (int j = 0; j < ArrayDeLista.getListarVendedor().size(); j++) {
                    if (ArrayDeLista.getListarVendedor().get(j).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(j).setDataDeCadastro(alteracao);
                    }
                }
                break;
            
            case "11":
                for (int i = 0; i < ArrayDeLista.getListarVendedor().size(); i++) {
                    if (ArrayDeLista.getListarVendedor().get(i).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(i).setLogin(alteracao);
                    }
                }
            case "12":
                for (int i = 0; i < ArrayDeLista.getListarVendedor().size(); i++) {
                    if (ArrayDeLista.getListarVendedor().get(i).getCPF().equals(cpf)) {
                        ArrayDeLista.getListarVendedor().get(i).setSenha(alteracao);
                    }
                }
            
            default:
                System.out.println("Não existe esse campo. . .");
                break;
        }
        
    }

    public static void RemoverVendedor(String cpf) {
        for (int i = 0; i < ArrayDeLista.getListarVendedor().size(); i++) {
            if (ArrayDeLista.getListarVendedor().get(i).getCPF().equals(cpf)) {
                ArrayDeLista.getListarVendedor().remove(i);
            }
        }
    }
    //--------------------------------------------------------
    public static void EditarFornecedor(String VariavelEditavel, int i, String alteracao) {
        switch (VariavelEditavel) {
            case "1":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setNomeFornecedor(alteracao);
                    }
                }
                break;
            case "2":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setRazaoSocial(alteracao);
                    }
                }
                break;
            case "3":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setCNPJ(alteracao);
                    }
                }
                break;
            case "4":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setTelefone(alteracao);
                    }
                }
                break;
            case "5":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setEmail(alteracao);
                    }
                }
                break;
            case "6":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setCidade(alteracao);
                    }
                }
                break;
            case "7":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setEstado(alteracao);
                    }
                }
                break;
            case "8":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setPais(alteracao);
                    }
                }
                break;
            case "9":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setEndereco(alteracao);
                    }
                }
                break;
            case "10":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setDataCadastro(alteracao);
                    }
                }
                break;

            default:
                System.out.println("Não existe esse campo. . .");
                break;
        }
    }

    public static void RemoverFornecedor(int Fornecedor) {
        for (int i = 0; i < ArrayDeLista.getListarFornecedor().size(); i++) {
            if (ArrayDeLista.getListarFornecedor().get(i).getNumero() == Fornecedor) {
                ArrayDeLista.getListarFornecedor().remove(i);
            }
        }
    }

    public static void EditarProduto(String cnpj, String Alteracao, String descricao) {
        for (int i = 0; i < ArrayDeLista.getListarProduto().size(); i++) {
            if (ArrayDeLista.getListarProduto().get(i).getForrnecedor1().getCNPJ().equals(cnpj) && ArrayDeLista.getListarProduto().get(i).getDescricao().equals(descricao)) {
                ArrayDeLista.getListarProduto().get(i).setDescricao(Alteracao);
            }
        }
    }

    public static void EditarProduto(String cnpj, Float Ateracao, String descricao) {
        for (int i = 0; i < ArrayDeLista.getListarProduto().size(); i++) {
            if (ArrayDeLista.getListarProduto().get(i).getForrnecedor1().getCNPJ().equals(cnpj) && ArrayDeLista.getListarProduto().get(i).getDescricao().equals(descricao)) {
                ArrayDeLista.getListarProduto().get(i).setPreço(Ateracao);
            }
        }
    }

    public static void EditarProduto(String cnpj, int Ateracao, String descricao) {
        for (int i = 0; i < ArrayDeLista.getListarProduto().size(); i++) {
            if (ArrayDeLista.getListarProduto().get(i).getForrnecedor1().getCNPJ().equals(cnpj) && ArrayDeLista.getListarProduto().get(i).getDescricao().equals(descricao)) {
                ArrayDeLista.getListarProduto().get(i).setQuantidade(Ateracao);
            }
        }
    }

    public static void RemoverProduto(String cnpj, String descricao) {
        for (int i = 0; i < ArrayDeLista.getListarProduto().size(); i++) {
            if (ArrayDeLista.getListarProduto().get(i).getForrnecedor1().getCNPJ().equals(cnpj) && ArrayDeLista.getListarProduto().get(i).getDescricao().equals(descricao)) {
                ArrayDeLista.getListarProduto().remove(i);
            }
        }
    }

    public static CadastrarVendedor BuscaVendedor(String login, String Senha){
        for (int i = 0; i < ArrayDeLista.getListarVendedor().size(); i++) {
            if (ArrayDeLista.getListarVendedor().get(i).getLogin().equals(login) && ArrayDeLista.getListarVendedor().get(i).getSenha().equals(Senha)) {
                return ArrayDeLista.getListarVendedor().get(i);
            }
            
        }
        CadastrarVendedor vendedor = new CadastrarVendedor("Não foi possivel encontrar - Nome", "Sobrenome", "dataDeNascimento", "Telefone", "CPF", "Cidade", "Estado", "País", "Endereço", "DataDeCadastro", "login", "Senha");
        return vendedor;

    }
}
