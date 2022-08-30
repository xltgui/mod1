import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String gabarito[] = new String[10];
        String respostas10[] = new String[10];
        int somatoria1 = 0;
        double porcent = 0;

        for (int k = 0; k < 10; k++) {
            System.out.println("Gabarito " + (k + 1));
            gabarito[k] = leitor.nextLine();
        }
        for (int j = 0; j < 15; j++) {
            System.out.println("Resposta " + (j + 1) + "° aluno: ");
            for (int k = 0; k < 10; k++) {
                System.out.println((k + 1) + "° questão: ");
                respostas10[k] = leitor.nextLine();

                if (respostas10[k].equalsIgnoreCase(gabarito[k]) && somatoria1 <= 10) {
                    somatoria1 += 1;
                    if (somatoria1 > 10) {
                        
                    }
                }

            }
            porcent = (somatoria1 * 100) / 6;

            System.out.println("nota " + (j + 1) + "° aluno: " + somatoria1);
            System.out.println("porcentagem de aprovação " + (j + 1) + "° aluno: " + porcent + "%");
            somatoria1 = 0;

        }
        leitor.close();
    }
}

/*
 * 82) Faça um programa para corrigir provas de múltipla escolha com somatória.
 * Cada prova tem dez questões e cada questão vale 1 ponto.
 * O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros
 * dados serão os números dos alunos e sua respectivas respostas. Existem 15
 * alunos matriculados.
 * Calcule e mostre:
 * - Para cada aluno seu número e sua nota;
 * - A percentagem de aprovação, sabendo-se que a nota mínima é 6,0.
 */
