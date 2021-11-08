public class Validacao {
    public static void EditarCliente(String VariavelEditavel, int i, String alteracao) {
        switch (VariavelEditavel) {
            case "nome":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setNome(alteracao);
                    }
                }
                break;
            case "sobrenome":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setSobrenome(alteracao);
                    }
                }
                break;
            case "dataNasc":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setDataDeNascimento(alteracao);
                    }
                }
                break;
            case "tel":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setTelefone(alteracao);
                    }
                }
                break;
            case "cpf":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setCPF(alteracao);
                    }
                }
                break;
            case "cidade":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setCidade(alteracao);
                    }
                }
                break;
            case "estado":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setEstado(alteracao);
                    }
                }
                break;
            case "pais":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setPais(alteracao);
                    }
                }
                break;
            case "endereco":
                for (int j = 0; j < ArrayDeLista.getListarCliente().size(); j++) {
                    if (i == ArrayDeLista.getListarCliente().get(j).getNumero()) {
                        ArrayDeLista.getListarCliente().get(j).setEndereço(alteracao);
                    }
                }
                break;
            case "dataCast":
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
    public static void EditarVendedor() {

    }

    public static void RemoverVendedor() {

    }

    public static void EditarFornecedor(String VariavelEditavel, int i, String alteracao) {
        switch (VariavelEditavel) {
            case "nome":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setNomeFornecedor(alteracao);
                    }
                }
                break;
            case "razao":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setRazaoSocial(alteracao);
                    }
                }
                break;
            case "cnpj":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setCNPJ(alteracao);
                    }
                }
                break;
            case "tel":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setTelefone(alteracao);
                    }
                }
                break;
            case "email":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setEmail(alteracao);
                    }
                }
                break;
            case "cidade":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setCidade(alteracao);
                    }
                }
                break;
            case "estado":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setEstado(alteracao);
                    }
                }
                break;
            case "pais":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setPais(alteracao);
                    }
                }
                break;
            case "endereco":
                for (int j = 0; j < ArrayDeLista.getListarFornecedor().size(); j++) {
                    if (i == ArrayDeLista.getListarFornecedor().get(j).getNumero()) {
                        ArrayDeLista.getListarFornecedor().get(j).setEndereco(alteracao);
                    }
                }
                break;
            case "dataCast":
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

    public static void EditarProduto() {
        
    }

    public static void RemoverProduto() {
        
    }
}
