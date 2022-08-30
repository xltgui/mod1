import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        float numPessoas= 0, quantCarneNec =0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de pessoas para o churrasco: ");
        numPessoas = Float.parseFloat(leitor.nextLine());

        quantCarneNec = numPessoas * 250;

        System.out.println("A quantidade de carne necessária para o churrasco é: ");
        System.out.print(quantCarneNec +  " gramas.");
        
        leitor.close();



    }
    
}
