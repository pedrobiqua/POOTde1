import java.util.ArrayList;

public class ListarVendas {

    public ListarVendas(){
        
    }

    public static void MostrarVendas(ArrayList<RegistrarVenda> mostra) {
        //Aplicação do metodo;
        for (int i = 0; i < mostra.size(); i++) {
            System.out.println(mostra.get(i).getClienteDaVenda());
            System.out.println(mostra.get(i).getTipoDoPagamento());
        }
    }

    public void adicRegistrarVenda(RegistrarVenda registrarVenda){
        ArrayDeLista.getRegistro().add(registrarVenda);
    }
}
