import java.util.Scanner;


public class ContasAtrasadas {
    public static void main(String[] args) {
        double salario, conta1, conta2, calculo;

        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite o valor do salário: ");
        salario = Double.parseDouble(leitor.nextLine());


        System.out.println("Digite o valor da primeira conta: ");
        conta1 = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o valor da segunda conta: ");
        conta2 = Double.parseDouble(leitor.nextLine());

        calculo = salario - (2 * conta1) / 100 - (2 * conta2) / 100;

        System.out.println("O que restará do salário de João será: " + calculo + " R$");

        leitor.close();

    }
    
}
