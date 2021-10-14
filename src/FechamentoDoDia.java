public class FechamentoDoDia {

    float totalDinheiro = 0f;
    float totalDebito = 0f;
    float totalCredito = 0f;

    public void MostraLucroDoDia() {
        for (int i = 0; i < ArrayDeLista.getRegistro().size(); i++) {
            totalDinheiro += ArrayDeLista.getRegistro().get(i).getPagDinheiro();
            totalDebito += ArrayDeLista.getRegistro().get(i).getPagDebito();
            totalCredito += ArrayDeLista.getRegistro().get(i).getPagCredito();
        }
        System.out.format("O total arrecadado em dinheiro hoje foi de: %f \n",totalDinheiro);
        System.out.format("O total arrecadado em débito hoje foi de: %f \n",totalDebito);
        System.out.format("O total arrecadado em crédito hoje foi de: %f, que será contabilizado em 30 dias. \n",totalCredito);
    }

}
