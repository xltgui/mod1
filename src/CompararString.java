public class CompararString {
    public static void main(String[] args) {
        String texto1 = "zezinho";

        if(texto1.equals("zezinho")){
            System.out.println("IGUAIS");

        }else if(texto1.equals("higuinho")){
            System.out.println("NÃO IGUAIS");

        }else if(!texto1.equals("Huguinho")){

            System.out.println("diferente de " + texto1);

        }
    }
    
}
