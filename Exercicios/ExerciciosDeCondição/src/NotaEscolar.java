public class NotaEscolar {
    public static void main(String[] args) {
        int nota = 4;

        if(nota >= 7){
            System.out.println("Parabéns, você foi aprovado com a nota " + nota + ".");
        }else if (nota >=5 && nota <7){
            System.out.println("Você está de recuperação.");
        }else 
            System.out.println("Você foi reprovado.");
        }
}
