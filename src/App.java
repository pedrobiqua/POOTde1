public class App {
    public static void main(String[] args) throws Exception {
        
        //Contas pré-programadas
        CadastrarFornecedor fornecedor = new CadastrarFornecedor("Jose Francisco", "Tio", "0967892341", "pedrobiqua@gmail.com", "3456677722", "Curitiba", "PR", "BRASIL", "Silva Jardim", "2/11/2021", 1);
        CadastrarProduto produto = new CadastrarProduto("Coca", 20, 3.00f, fornecedor);
        CadastrarCliente clientObject = new CadastrarCliente("KAUE", "FRANCISCO", "24/09/2001", "3466-6969", "099.999.000-00", "CURITIBA", "PR", "Brasil", "Rua do Leão", "13/10/2021", 1);
        CadastrarVendedor vendedor1 = new CadastrarVendedor("Thiago", "Barboza", "12/05/2000", "37868909", "009.786.908-90", "Curitiba", "PR", "BRASIL", "Rua Westphalen", "08/11/2021", "hugo", "1234");
        ListarCliente listarCliente = new ListarCliente();
        ListarProduto listarProduto = new ListarProduto();
        ListarFornecedor listarFornecedor = new ListarFornecedor();
        ListarVendedor listarVendedor = new ListarVendedor();

        //Adicionando na lista static
        listarVendedor.adicCadastrarVendedor(vendedor1);
        listarFornecedor.adicCadastrarFornecedor(fornecedor);
        listarCliente.adicCadastrarCliente(clientObject);
        listarProduto.adicCadastrarProduto(produto);

        Menu.RodarMenu();
        
        
    }

    public static int ValidaConta(String admLogin, String admSenha) {
         //Função de login e senha para o admin e vendedor
        if (admLogin.equals("admin") && admSenha.equals("admin")) {
            return 1;
        }
        for (int i = 0; i < ArrayDeLista.getListarVendedor().size(); i++) {
            if (ArrayDeLista.getListarVendedor().get(i).getLogin().equals(admLogin) && ArrayDeLista.getListarVendedor().get(i).getSenha().equals(admSenha)) {
                return 2;
            }
        }
        
        return 0;
}
}
