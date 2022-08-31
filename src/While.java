import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // enquanto
        int contador = 0;
        while (contador < 10) {
            System.out.println("rodando.." + contador);
            contador++;
        }
        contador = 10;
        System.out.println("           ");
        while (contador >= 0) {
            System.out.println("rodando.." + contador);
            contador--;

            ///INCREMENTAR DE 2 EM 2
            /// contador = contador +2 ou contador += 2        ------------------- TEM QUE SER +=,         =+ NAO FUNCIONA!!!!!!!
            }
            Scanner leitor = new Scanner(System.in);
            int resposta = 5;
            do{
                System.out.println("Digite o número 5");
                //resposta = Integer.parseInt(leitor.nextLine());
                if(resposta != 5){
                    System.out.println("Valor inválido");
                }
            }while(resposta != 5);

            for(int i=0; i < 5; i++){
                System.out.println("FOR" + i);
            }
            leitor.close();

            
    }

}

