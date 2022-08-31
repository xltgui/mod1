import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double salarioTotal, despesaMensal;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do total do salário: ");
        salarioTotal = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o valor da despesa mensal: ");
        despesaMensal = Double.parseDouble(leitor.nextLine());


        double percent = (despesaMensal * 100 ) / salarioTotal;
        System.out.println("O valor em porcentagem da despesa mensal é: ");
        System.out.println(percent + "%");

        leitor.close();

    }
    
}
