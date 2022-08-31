import java.util.Scanner;

public class CalcSomaNumEspec {
    public static void main(String[] args) {
        int n1, n2;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo número: ");
        n2 = Integer.parseInt(leitor.nextLine());

        int i = n1;
        int soma = n1;

        while (i < n2) {
            i++;
            soma += i;
        }

        System.out.println("a soma de " + n1 + "  " + n2 + " é: " + soma);

        leitor.close();

    }

}
