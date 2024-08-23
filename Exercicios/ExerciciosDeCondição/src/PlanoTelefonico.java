public class PlanoTelefonico {
    public static void main(String[] args) {
        String planoEscolhido = "k";

        switch (planoEscolhido.toUpperCase()){
            case "T":{
               System.out.println("5GB de YouTube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram ilimitados");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            break;
            }
            default:{
                System.out.println("Opção inválida");
            }
        }
    }
}
