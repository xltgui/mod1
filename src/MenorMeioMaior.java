import java.util.Scanner;

public class MenorMeioMaior {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo número: ");
        n2 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o terceiro número: ");
        n3 = Integer.parseInt(leitor.nextLine());

        System.out.println("                ");

        if (n1 > n2 && n3 < n2) {
            System.out.println(n1 + " é o maior número");
            System.out.println(n2 + " é o número do meio");
            System.out.println(n3 + " é o menor número");
        } else if (n1 < n2 && n3 < n1) {
            System.out.println(n2 + " é o maior número");
            System.out.println(n1 + " é o número do meio");
            System.out.println(n3 + " é o menor número");
        }else if (n1 < n2 && n3 > n1){
            System.out.println(n2 + " é o maior número");
            System.out.println(n3 + " é o número do meio");
            System.out.println(n1 + " é o menor número");
        } else if (n3 > n2 && n1 < n2) {
            System.out.println(n3 + " é o maior número");
            System.out.println(n2 + " é o número do meio");
            System.out.println(n1 + " é o menor número");
        } else if (n1 > n3 && n2 < n3) {
            System.out.println(n1 + " é o maior número");
            System.out.println(n3 + " é o número do meio");
            System.out.println(n2 + " é o menor número");
        } else if (n3 > n1 && n2 < n1) {
            System.out.println(n3 + " é o maior número");
            System.out.println(n1 + " é o número do meio");
            System.out.println(n2 + " é o menor número");
        } else if (n3 == n1 && n2 == n1) {
            System.out.println("Os três números são iguais.");
        } else if (n1 == n2 | n3 == n2 | n3 == n1)
            System.out.println("Impossível descobrir qual é o maior, porque pelos dois números digitados são iguais.");
        leitor.close();
    }

}
