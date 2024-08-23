public class SistemaDeMedida {
    public static void main(String[] args) {
        String siglaTamanho = "A";

        if (siglaTamanho.equalsIgnoreCase("P")){
            System.out.println("Tamanho Pequeno");
        }else if (siglaTamanho.equalsIgnoreCase("M")){
            System.out.println("Tamanho Médio");
        }else if (siglaTamanho.equalsIgnoreCase("G")){
            System.out.println("Tamanho Grande");
        }else 
            System.out.println("Não encontrado");
    }

}
