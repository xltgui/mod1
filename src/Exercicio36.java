import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double racaoKilo, racaoGramas, quant, quant5, quantForn, quant2gatos;

        System.out.println("Digite o peso do saco da ração em KILO: ");
        racaoKilo = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite a quantidade em gramas de raçao fornecida para cada gato");
        quantForn = Double.parseDouble(leitor.nextLine());

        quant2gatos = quantForn * 2;

        racaoGramas = racaoKilo * 1000;

        quant =  5 * quant2gatos;
        quant5 = racaoGramas - quant;

        System.out.println("A quantidade de ração restante após 5 dias é: ");
        System.out.println(quant5 + "g");

        leitor.close();

    }

}