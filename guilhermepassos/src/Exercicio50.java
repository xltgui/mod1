import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double votos, validos, votCandA, votCandB, VotCandC, nulo, branco, percentCandA, percentCandB, percentCandC,
                percentNulo, percentBranco;
                
        System.out.println("Digite a quantidade de votos do candidado A: ");
        votCandA = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a quantidade de votos do candidado B: ");
        votCandB = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a quantidade de votos do candidado C: ");
        VotCandC = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a quantidade de votos nulos: ");
        nulo = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a quantidade votos brancos: ");
        branco = Double.parseDouble(leitor.nextLine());

        votos = votCandA + votCandB + VotCandC + nulo + branco;

        validos = votCandA + votCandB + VotCandC + branco;

        percentCandA = (100 * votCandA) / validos;
        percentCandB = (100 * votCandB) / validos;
        percentCandC = (100 * VotCandC) / validos;

        percentNulo = (100 * nulo) / votos;

        percentBranco = (100 * branco) / votos;

        System.out.println("O percentual de votos do candidato A é de: ");
        System.out.println(percentCandA + "%");

        System.out.println("O percentual de votos do candidato B é de: ");
        System.out.println(percentCandB + "%");

        System.out.println("O percentual de votos do candidato C é de: ");
        System.out.println(percentCandC + "%");

        System.out.println("O percentual de votos nulos é de: ");
        System.out.println(percentNulo + "%");

        System.out.println("O percentual de votos em branco é de: ");
        System.out.println(percentBranco + "%");
        
        leitor.close();

    }

}
