import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        int idade;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        idade = Integer.parseInt(leitor.nextLine());
        
        if(idade >= 18){
            System.out.println("Você é de maior.");
        } else{
            System.out.println("Você é menor de idade.");
            
        }
        leitor.close();
    }
    
}
