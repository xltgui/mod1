import java.util.Scanner;

public class ExeEstruturaDados2 {
    public static void main(String[] args) {
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(numeros2[0]);
        char[] nome = {'u', 'n', 'i', 'v', 'i', 'v', 'i', 'l', 'l', 'e'};
        // For each (iterador), para cada UMALETRA imprima UMALETRA de NOME;
        for(char umaLetra : nome){
            System.out.println((int)umaLetra);
        }

        String nome2 = "univille";
        System.out.println(nome2);
        System.out.println(nome2.toUpperCase());

        nome2 = "univille";
        System.out.println(nome2.hashCode());

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite UNIVILLE");
        String entrada = leitor.nextLine();

        if(nome2.equalsIgnoreCase(entrada)){
            System.out.println("idênticos");
        }else{
            System.out.println("não são idênticos");
        }
        leitor.close();

    }
    
}
