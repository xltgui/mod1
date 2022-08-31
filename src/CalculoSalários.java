import java.util.Scanner;

public class CalculoSalários {
    public static void main(String[] args) {
        double salario, reajuste;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        salario = Double.parseDouble(leitor.nextLine());

        reajuste = salario + (30 * salario) / 100;

        if (salario <= 500) {
            System.out.println("Salário reajustado com aumento: " + reajuste + " R$");
        } else {
            System.out.println("O funcionário não tem direito ao aumento");
        }
        leitor.close();
    }

}