import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        double salario, salMinimo, quant;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário do funcionário: ");
        salario = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o valor do salário míninmo: ");
        salMinimo = Double.parseDouble(leitor.nextLine());

        quant = salario / salMinimo;

        System.out.println("A quantidade de salários minimos que esse funcionário ganha é: " + quant);

        leitor.close();
        





        
    }
    
}
