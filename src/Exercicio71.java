import java.util.Scanner;

public class Exercicio71 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo número: ");
        n2 = Integer.parseInt(leitor.nextLine());
        int i = n1;
        int soma = 0;

        while (i < n2) {

            if (i % 2 == 1) {
                soma = soma + i;
                i = i + 2;
            } else {
                i++;
            }

        }
        System.out.println("a soma dos números ímpares " + "entre " + n1 + " e " + n2 + " é: " + soma);
        leitor.close();
    }
    /*
     * 71) Faça um algoritmo que calcule a soma de todos os números ímpares dentro
     * de uma faixa de valores determinada pelo usuário.
     * Um número é ímpar quando sua divisão por 2 não é exata, ou seja, o resto
     * resultante da divisão inteira pelo número 2 tem valor 1.
     */
}