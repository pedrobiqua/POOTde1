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
    public static void EditarVendedor() {

    }

    public static void RemoverVendedor() {

    }

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

    public static void EditarProduto() {
        
    }

    public static void RemoverProduto() {
        
    }
}
