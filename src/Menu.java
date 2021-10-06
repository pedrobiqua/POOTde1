import java.util.Scanner;

public class Menu {
    
    public static void RodarMenu() {

        Boolean running = true;
        ListarCliente ListaDeCliente = new ListarCliente();

        while (running) {

            Scanner menu = new Scanner(System.in);

            System.out.print("##--VENDA DE CONTAS DE LOL--##\n\n");
		    System.out.print("|-----------------------------|\n");
		    System.out.print("| Opção 1 - Cadastrar Cliente |\n");
		    System.out.print("| Opção 2 - Listar Cliente    |\n");
		    System.out.print("| Opção 3 - Ainda não existe  |\n");
		    System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("| Project by: Pedro, Thiago e |\n");
            System.out.print("|             Lukas           |\n");
		    System.out.print("|-----------------------------|\n");
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
                    //Roda essa parte
                    break;
                case 4:
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
