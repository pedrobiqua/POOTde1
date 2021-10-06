import java.util.Scanner;

public class Menu {
    public static void RodarMenu() {

        Boolean running = true;
        ListarCliente ListaDeCliente = new ListarCliente();

        while (running) {

            Scanner menu = new Scanner(System.in);

            System.out.print("##--Sistema de Loja--##\n\n");
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
                    CadastrarCliente cliente1 = new CadastrarCliente("Pedro", "Quadros", "24 de maio", "3333-3333", "909090-9090-09", "Curitiba", "Paraná", "Brasil", "Rua do Governador", "05 de out", 01);
                    ListaDeCliente.adicCadastrarCliente(cliente1);
                    
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
