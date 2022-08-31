import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor = 0, quant = 0;
        double soma = 0, media = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite um número: ");
            valor = Integer.parseInt(leitor.nextLine());
            soma = soma + valor;
            quant = quant + 1;
        }
        media = soma / quant;
        System.out.println("Soma: "+ soma);
        System.out.println("Média: " + media);
        leitor.close();
    }
    //60) Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média do total.
    
}
