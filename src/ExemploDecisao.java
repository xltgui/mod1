import java.util.Scanner;

public class ExemploDecisao {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = Integer.parseInt(leitor.nextLine());
        /*
          if(CONDIÇÃO){
          // BLOCO DE CODIGO (ENTÃO = VERDADEIRO)
          }else{
          // BLOCO DE CODIGO (SENAO = FALSO)
          }
          
          
          if(CONDIÇÃO){
          // BLOCO DE CODIGO (ENTÃO = VERDADEIRO)
          }
         */
        if (numero >= 10) {
            System.out.println("O número é maior ou igual a dez");
        } else {
            System.out.println("O número é menor que dez");
        }

        leitor.close();
    }

}
