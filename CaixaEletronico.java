public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 30;
        double valorSolicitado = 15;

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: R$" + saldo);
        }else 
            System.out.println("Saldo insuficiente");
   }
}