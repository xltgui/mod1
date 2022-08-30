import java.util.Scanner;


public class Exericio84 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cod[] = new int[10];
        double saldo[] = new double[10];
        int newCod = 0;

        double deposito = 0;
        int choice = 0;
        double novosaldo = 0;
        double saque = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Código " + (i + 1) + ": ");
            cod[i] = Integer.parseInt(leitor.nextLine());
            System.out.println("Saldo " + (i + 1) + ": ");
            saldo[i] = Double.parseDouble(leitor.nextLine());
        }
        System.out.println("1. Efetuar depósito");
        System.out.println("2. Efetuar saque");
        System.out.println("3. Consultar o ativo bancário");
        System.out.println("4. Finalizar");
        System.out.println("\n");
        System.out.println("Escolha uma das opções acima: ");
        choice = Integer.parseInt(leitor.nextLine());

        if (choice == 1) {
            System.out.println("Digite o código: ");
            newCod = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite o valor a ser depositado: ");
            deposito = Double.parseDouble(leitor.nextLine());
            for (int i = 0; i < 10; i++) {
                if (newCod == (cod[i])) {
                    novosaldo = saldo[i] + deposito;
                    System.out.println("Novo saldo = " + novosaldo);
                }
            }
        }
        if (choice == 2) {
            System.out.println("Digite o código: ");
            newCod = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite o valor a ser sacado: ");
            saque = Double.parseDouble(leitor.nextLine());
            for (int i = 0; i < 10; i++) {
                if (newCod == (cod[i])) {
                    novosaldo = saldo[i] - saque;
                    System.out.println("Você recebeu :" + "R$" + saque);
                    System.out.println("Saldo restante = " + novosaldo);
                }

            }

        }
        leitor.close();
    }
}
