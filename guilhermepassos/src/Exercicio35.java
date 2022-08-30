import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoFab, percentualLucro, percentualImpostos, precoFinal, percentualLucroFinal, percentualImpostosFinal;

        System.out.println("Digite o preço de fábrica do veículo: ");
        precoFab = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite o pencentual de lucro do distribuidor: ");
        percentualLucro = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite o percentual dos impostos: ");
        percentualImpostos = Double.parseDouble(leitor.nextLine());

        percentualLucroFinal = (percentualLucro * precoFab) / 100;
        percentualImpostosFinal = (percentualImpostos * precoFab) / 100;

        precoFinal = precoFab + percentualLucroFinal + percentualImpostosFinal;

        System.out.println("O valor correspondente ao lucro do distribuidor é: " + " R$ " + percentualLucroFinal);
        System.out.println("O valor correspondente aos impostos é: " + " R$ " + percentualImpostosFinal);
        System.out.println("O preço final do veículo é: " + " R$ " + precoFinal);

        leitor.close();

    }

}
