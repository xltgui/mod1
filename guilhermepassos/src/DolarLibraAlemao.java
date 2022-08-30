import java.util.Scanner;

public class DolarLibraAlemao {
    public static void main(String[] args) {
        double dinheiro, dolar, libra, alemao;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor em dinheiro: ");
        dinheiro = Double.parseDouble(leitor.nextLine());

        dolar = dinheiro / 1.8;

        libra = dinheiro / 1.57;

        alemao = dinheiro / 2;

        System.out.println("O valor em dólares é de: " + dolar);

        System.out.println("O valor em libras é de: " + libra);

        System.out.println("O valor em marco alemão é de: " + alemao);

        leitor.close();

    }

}
