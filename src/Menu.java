import java.util.Scanner;

public class Menu {

    public static void RodarMenu() {

        Boolean running = true;
        ListarCliente ListaDeCliente = new ListarCliente();
        ListarProduto listarProduto = new ListarProduto();
        ListarFornecedor listarFornecedor = new ListarFornecedor();
        ListarVendedor listarVendedor = new ListarVendedor();

        while (running) {

            Scanner menu = new Scanner(System.in);

            System.out.print("##--VENDA DE CONTAS DE LOL--##\n\n");
		    System.out.print("|-----------------------------  |\n");
		    System.out.print("| Opção 1 - Cadastrar Cliente   |\n");
		    System.out.print("| Opção 2 - Listar Cliente      |\n");
            System.out.print("| Opção 3 - Cadastrar Fornecedor|\n");
            System.out.print("| Opção 4 - Listar Fornecedor   |\n");
		    System.out.print("| Opção 5 - Cadastrar Vendedor  |\n");
            System.out.print("| Opção 6 - Listar Vendedor     |\n");
            System.out.print("| Opção 7 - Cadastrar Produto   |\n");
            System.out.print("| Opção 8 - Listar Produto      |\n");
		    System.out.print("| Opção 9 - Sair                |\n");
            System.out.print("| Project by: Pedro, Thiago e   |\n");
            System.out.print("|             Lukas             |\n");
		    System.out.print("|-----------------------------  |\n");
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

                    System.out.print("Sobrenome: ");
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
                    ListaDeCliente.MostraClientes(ListaDeCliente.getListarCliente());
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
                    listarFornecedor.MostraFornecedor(listarFornecedor.getListarFornecedor());
                    break;
                case 5:
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.print("Nome: ");
                    String nome = scanner.next();

                    System.out.print("Sobrenome: ");
                    String sobrenome = scanner.next();

                    System.out.print("Data de nascimento: ");
                    String dataNascimento = scanner.next();
                    
                    System.out.print("Telefone: ");
                    String Telefone = scanner.next();

                    System.out.print("CPF: ");
                    String CPF = scanner.next();

                    System.out.print("Cidade: ");
                    String Cidade = scanner.next();

                    System.out.print("Estado: ");
                    String Estado = scanner.next();

                    System.out.print("Endereço: ");
                    String Endereço = scanner.next();

                    System.out.print("Data de Cadastro: ");
                    String DataDeCadastro = scanner.next();



                    CadastrarVendedor vendedor = new CadastrarVendedor(nome, sobrenome, dataNascimento, Telefone, CPF, Cidade, Estado, Pais, Endereço, DataDeCadastro);
                    ListaDeVendedor.adicCadastrarVendedor(vendedor);
                    
                    break;
                                    
                case 6:

                    ListaDeVendedor.MostraVendedor(ListaDeVendedor.getListarVendedor());

                    break;
                
                case 7:
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.print("Descrição do produto: ");
                    String Descrição = scanner7.next();

                    System.out.print("Quantidade de produtos: ");
                    int Quantidade = scanner7.nextInt();

                    System.out.print("Preço do produto(unidade): ");
                    Float Preço = scanner7.nextFloat();

                    System.out.print("Fornecedor");
                    String Fornecedor7 = scanner7.next();

                    CadastrarProduto produto = new CadastrarProduto(Descrição, Quantidade, Preço, Fornecedor7);
                    listarProduto.adicCadastrarProduto(produto);
                    break;
                
                case 8:
                    listarProduto.MostraProduto(listarProduto.getListarProduto());
                    break;
                
                case 9:
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
