import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite o segundo número: ");
        n2 = Double.parseDouble(leitor.nextLine());

        System.out.println("            ");

        if (n1 == n2) {
            System.out.println("Os dois números são iguais.");
            System.out.println("E a média dos dois números é: " + n1);
        } else if (n1 > n2) {
            System.out.println(n1 + " é o maior número.");
            System.out.println(n2 + " é o menor número.");

        } else if (n2 > n1) {
            System.out.println(n2 + " é o maior número.");  
            System.out.println(n1 + " é o menor número.");
        }

        leitor.close();
    }
}
