public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 8;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "de Recuperação" : "Reprovado";
        System.out.println("Você está " + resultado);
    }
}
