import java.util.Scanner;

public class Menu {

    public static void RodarMenu() {

        Boolean running = true;
        ListarCliente ListaDeCliente = new ListarCliente();
        ListarProduto listarProduto = new ListarProduto();
        ListarFornecedor listarFornecedor = new ListarFornecedor();
        ListarVendedor listarVendedor = new ListarVendedor();
        ListarVendas listarVendas = new ListarVendas();
        int valida;

        while (running) {

            Scanner menu = new Scanner(System.in);

            System.out.print("\n\n##--Sistema de LOJA--##\n\n");
		    System.out.print("|---------------------------------|\n");
		    System.out.print("| Opção 1 - Cadastrar Cliente     |\n");
		    System.out.print("| Opção 2 - Listar Cliente        |\n");
            System.out.print("| Opção 3 - Cadastrar Fornecedor  |\n");
            System.out.print("| Opção 4 - Listar Fornecedor     |\n");
		    System.out.print("| Opção 5 - Cadastrar Vendedor    |\n");
            System.out.print("| Opção 6 - Listar Vendedor       |\n");
            System.out.print("| Opção 7 - Cadastrar Produto     |\n");
            System.out.print("| Opção 8 - Listar Produto        |\n");
            System.out.print("| Opção 9 - Vender                |\n");
            System.out.print("| Opção 10 - Mostrar Vendas do Dia|\n");
		    System.out.print("| Opção 11 - Fechamento do Dia    |\n");
            System.out.print("| Opção 12 - Sair                 |\n");
            System.out.print("| Project by: Pedro, Thiago e     |\n");
            System.out.print("|             Lukas               |\n");
		    System.out.print("|---------------------------------|\n");
		    System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                    //Roda essa parte do código
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Nome: ");
                    String nome = scanner.next();

                    System.out.print("Sobrenome: ");
                    String sobrenome = scanner.next();

                    System.out.print("Data de Nascimento: ");
                    String dataNascimento = scanner.next();
                    
                    System.out.print("Telefone: ");
                    String Telefone = scanner.next();

                    System.out.print("CPF: ");
                    String CPF = scanner.next();

                    System.out.print("Cidade: ");
                    String Cidade = scanner.next();

                    System.out.print("Estado: ");
                    String Estado = scanner.next();

                    System.out.print("País: ");
                    String Pais = scanner.next();

                    System.out.print("Endereço: ");
                    String Endereço = scanner.next();

                    System.out.print("Data de Cadastro: ");
                    String DataDeCadastro = scanner.next();

                    System.out.print("Numero: ");
                    int Numero = scanner.nextInt();

                    CadastrarCliente cliente = new CadastrarCliente(nome, sobrenome, dataNascimento, Telefone, CPF, Cidade, Estado, Pais, Endereço, DataDeCadastro, Numero);
                    ListaDeCliente.adicCadastrarCliente(cliente);
                    break;
                
                case 2:
                    //Roda essa opção
                    Scanner scanner2 = new Scanner(System.in);
                    ListaDeCliente.MostraClientes(ArrayDeLista.getListarCliente());

                    System.out.print("Login: ");
                    String login2 = scanner2.next();

                    System.out.print("Senha: ");
                    String senha2 = scanner2.next();
                    
                    valida = App.ValidaConta(login2, senha2);

                    if ( valida == 0) {
                        System.out.println("Essa conta não existe");
                    }else if (valida == 1) {
                        System.out.println("Bem vindo Admin . . .");

                        System.out.print("Você deseja \n - Editar[E], \n - Remover[R]: ");
                        String edicao2 = scanner2.next();

                        if(edicao2.equals("e") || edicao2.equals("E")){
                            System.out.print("Qual campo vc deseja editar?: ");
                            String campo = scanner2.next();

                            System.out.print("Qual o numero do cliente?: ");
                            int numbCliente = scanner2.nextInt();

                            System.out.print("Qual a alteracao?: ");
                            String alteraCliente = scanner2.next();
                            Validacao.EditarCliente(campo, numbCliente, alteraCliente);
                        }
                        if (edicao2.equals("r") || edicao2.equals("R")) {
                            System.out.print("Qual numero do Cliente que deseja remover?: ");
                            int campo = scanner2.nextInt();

                            Validacao.RemoverCliente(campo);

                        }

                    }else{
                        System.out.println("Bem vindo Vendedor . . . ");
                        System.out.print("Você deseja Editar[E]?: ");
                        String edicao2 = scanner2.next();

                        if(edicao2.equals("e") || edicao2.equals("E")) {
                            System.out.print("Qual campo vc deseja editar?: ");
                            String campo = scanner2.next();

                            System.out.print("Qual o numero do cliente?: ");
                            int numbCliente = scanner2.nextInt();

                            System.out.print("Qual a alteracao?: ");
                            String alteraCliente = scanner2.next();
                            Validacao.EditarCliente(campo, numbCliente, alteraCliente);
                        }
                    }
                    break;


                case 3:
                    //Roda essa parte do código
                    Scanner scanner3 = new Scanner(System.in);

                    System.out.print("Nome do Fornecedor: ");
                    String NomeFornecedor = scanner3.next();

                    System.out.print("Razão Social: ");
                    String RazaoSocial = scanner3.next();

                    System.out.print("CNPJ: ");
                    String CNPJ = scanner3.next();

                    System.out.print("Email: ");
                    String Email = scanner3.next();

                    System.out.print("Telefone: ");
                    String Telefone3 = scanner3.next();

                    System.out.print("Cidade: ");
                    String Cidade3 = scanner3.next();

                    System.out.print("Estado: ");
                    String Estado3 = scanner3.next();

                    System.out.print("País: ");
                    String Pais3 = scanner3.next();

                    System.out.print("Endereço: ");
                    String Endereco3 = scanner3.next();

                    System.out.print("Numero: ");
                    int Numero3 = scanner3.nextInt();

                    System.out.print("Data de Cadastro: ");
                    String DataCadastro = scanner3.next();

                    CadastrarFornecedor Fornecedor = new CadastrarFornecedor(NomeFornecedor, RazaoSocial, CNPJ, Email, Telefone3, Cidade3, Estado3, Pais3, Endereco3, DataCadastro, Numero3);
                    listarFornecedor.adicCadastrarFornecedor(Fornecedor);
                    break;

                case 4:
                    listarFornecedor.MostraFornecedor(ArrayDeLista.getListarFornecedor());
                    Scanner scanner4 = new Scanner(System.in);

                    System.out.print("Login: ");
                    String login4 = scanner4.next();

                    System.out.print("Senha: ");
                    String senha4 = scanner4.next();

                    valida = App.ValidaConta(login4, senha4);

                    if ( valida == 0) {
                        System.out.println("Essa conta não existe");
                    }else if (valida == 1) {
                        System.out.println("Bem vindo Admin . . .");

                        System.out.print("Você deseja \n - Editar[E], \n - Remover[R]: ");
                        String edicao4 = scanner4.next();

                        if(edicao4.equals("e") || edicao4.equals("E")){
                            System.out.print("Qual campo vc deseja editar?: ");
                            String campo = scanner4.next();

                            System.out.print("Qual o numero do Fornecedor?: ");
                            int numbFornecedor = scanner4.nextInt();

                            System.out.print("Qual a alteracao?: ");
                            String alteraFornecedor = scanner4.next();
                            Validacao.EditarFornecedor(campo, numbFornecedor, alteraFornecedor);
                        }
                        if (edicao4.equals("r") || edicao4.equals("R")) {
                            System.out.print("Qual numero do Fornecedor que deseja remover?: ");
                            int campo = scanner4.nextInt();

                            Validacao.RemoverFornecedor(campo);

                        }

                    }else{
                        System.out.println("Bem vindo Fornecedor . . . ");
                        System.out.print("Você deseja Editar[E]?: ");
                        String edicao4 = scanner4.next();

                        if(edicao4.equals("e") || edicao4.equals("E")) {
                            System.out.print("Qual campo vc deseja editar?: ");
                            String campo = scanner4.next();

                            System.out.print("Qual o numero do Fornecedor?: ");
                            int numbFornecedor = scanner4.nextInt();

                            System.out.print("Qual a alteracao?: ");
                            String alteraFornecedor = scanner4.next();
                            Validacao.EditarFornecedor(campo, numbFornecedor, alteraFornecedor);
                        }
                    }
                    break;


                case 5:
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.print("Nome: ");
                    String nome5 = scanner5.next();

                    System.out.print("Sobrenome: ");
                    String sobrenome5 = scanner5.next();

                    System.out.print("Data de nascimento: ");
                    String dataNascimento5 = scanner5.next();
                    
                    System.out.print("Telefone: ");
                    String Telefone5 = scanner5.next();

                    System.out.print("CPF: ");
                    String CPF5 = scanner5.next();

                    System.out.print("País: ");
                    String Pais5 = scanner5.next();

                    System.out.print("Cidade: ");
                    String Cidade5 = scanner5.next();

                    System.out.print("Estado: ");
                    String Estado5 = scanner5.next();

                    System.out.print("Endereço: ");
                    String Endereço5 = scanner5.next();

                    System.out.print("Data de Cadastro: ");
                    String DataDeCadastro5 = scanner5.next();

                    System.out.print("Login: ");
                    String login = scanner5.next();

                    System.out.print("Senha: ");
                    String senha = scanner5.next();

                    CadastrarVendedor vendedor = new CadastrarVendedor(nome5, sobrenome5, dataNascimento5, Telefone5, CPF5, Cidade5, Estado5, Pais5, Endereço5, DataDeCadastro5, login, senha);
                    listarVendedor.adicCadastrarVendedor(vendedor);
                    break;

                case 6:

                    listarVendedor.MostraVendedor(ArrayDeLista.getListarVendedor());
                    Scanner scanner6 = new Scanner(System.in);
		
		            for(int i = 0; i < 1; i++) {

			            System.out.print(" Precione enter para continuar: ");
			            scanner6.nextLine();
		            }
                    break;
                

                case 7:
                    CadastrarFornecedor Fornecedor7;
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.print("Descrição do produto: ");
                    String Descrição = scanner7.next();

                    System.out.print("Quantidade de produtos: ");
                    int Quantidade = scanner7.nextInt();

                    System.out.print("Preço do produto(unidade): ");
                    Float Preço = scanner7.nextFloat();

                    System.out.print("Razão Social: ");
                    String input = scanner7.next();

                    for (int i = 0; i < ArrayDeLista.getListarFornecedor().size(); i++) {
                        if (input.equals(ArrayDeLista.getListarFornecedor().get(i).getRazaoSocial())) {
                            Fornecedor7 = ArrayDeLista.getListarFornecedor().get(i); 
                            CadastrarProduto produto = new CadastrarProduto(Descrição, Quantidade, Preço, Fornecedor7);
                            listarProduto.adicCadastrarProduto(produto);
                            break;
                        }
                        else{
                            System.out.println("Buscando . . .");
                        }
                    }
                    break;
                
                case 8:
                    listarProduto.MostraProduto(ArrayDeLista.getListarProduto());
                    Scanner scanner8 = new Scanner(System.in);
		
		            for(int i = 0; i < 1; i++) {

			            System.out.print("Pressione enter para continuar: ");
			            scanner8.nextLine();
		            }
                    break;
                
                    
                case 9:
                    Scanner scanner9 = new Scanner(System.in);
                    System.out.print("Numero do Cliente para realizar a compra: ");
                    int numeroCliente = scanner9.nextInt();

                    RegistrarVenda registro = new RegistrarVenda(numeroCliente);
                    listarVendas.adicRegistrarVenda(registro);
                    
                    break;
                
                case 10:
                    ListarVendas.MostrarVendas(ArrayDeLista.getRegistro());
                    Scanner scanner10 = new Scanner(System.in); 
                    for(int i = 0; i < 1; i++) {

			            System.out.print(" Pressione enter para continuar: ");
			            scanner10.nextLine();
		            }
                    break;
                
                case 11:
                    FechamentoDoDia fechamentoDoDia = new FechamentoDoDia();
                    fechamentoDoDia.MostraLucroDoDia();
                    break;
                case 12:
                    System.out.println("Saindo da solução. . . ");
                    menu.close();
                    running = false;
                    break;
                
                default:
                    System.out.println("\nNão existe essa opção de escolha.");
                    break;
            }
        }
    }
}
