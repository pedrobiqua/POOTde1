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

    public static void EditarFornecedor() {
        
    }

    public static void RemoverFornecedor() {
        
    }

    public static void EditarProduto() {
        
    }

    public static void RemoverProduto() {
        
    }
}
