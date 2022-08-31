import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, MaiorNum, MenorNum;
        System.out.println("Digite o número positivo para continuar: ");
        System.out.println("ESSE NÃO CONTA.");
        n1 = Integer.parseInt(leitor.nextLine());
        System.out.println("ESSE NÃO CONTA.");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");
        System.out.println("            ");

        MaiorNum = n1;
        MenorNum = n1;
        double quant = 0;
        double quantImpar = 0;
        double somaImpar = 0;
        double mediaImpar = 0;
        double quantPar = 0;
        double soma = 0;
        double media = 0;
        double somaPar = 0;
        double mediaPar = 0;
        double percentImpar = 0;

        do {
            System.out.println("Digite um numero: ");
            n1 = Integer.parseInt(leitor.nextLine());
            quant = quant + 1;

            soma = soma + n1;

            media = soma / quant;

            if (n1 > MaiorNum) {
                MaiorNum = n1;

            }
            if (n1 < MenorNum) {

                MenorNum = n1;
            }
            if (n1 % 2 == 1) {
                quantImpar = quantImpar + 1;
                somaImpar = somaImpar + n1;
                mediaImpar = somaImpar / quantImpar;
            }
            if (n1 % 2 == 0) {
                quantPar = quantPar + 1;
                somaPar = somaPar + n1;
                mediaPar = somaPar / quantPar;
            }
            percentImpar = (100 * quantImpar) / quant;
        } while (n1 >= 0);
        System.out.println("      ");
        System.out.println("Maior número: " + MaiorNum);
        System.out.println("Menor número: " + MenorNum);

        System.out.println("      ");

        System.out.println("A quantidade de números digitados foi: " + quant);

        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A média dos números digitados é: " + media);

        System.out.println("      ");

        System.out.println("A quantidade de números pares é: " + quantPar);
        System.out.println("A soma dos números pares é: " + somaPar);
        System.out.println("A média dos números pares é:  " + mediaPar);

        System.out.println("      ");

        System.out.println("A quantidade de números ímpares positivos é: " + quantImpar);
        System.out.println("A soma dos números ímpares é:  " + somaImpar);
        System.out.println("A média dos números ímpares é: " + mediaImpar);
        System.out.println("Percentual dos números ímpares: " + percentImpar + "%");

        leitor.close();
    }

}
