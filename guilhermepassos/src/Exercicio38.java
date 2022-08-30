import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codigo;

        System.out.println("Digite o código do produto (de 1 a 31): ");
        codigo = Integer.parseInt(leitor.nextLine());
        System.out.println("             ");

        if (codigo == 1) {
            System.out.println("Código do produto: " + codigo + ":");
            System.out.println("Procedência: ");
            System.out.println("Sul.");

        }
        if (codigo == 2) {
            System.out.println("Código do produto: " + codigo + ":");
            System.out.println("Procedência: ");
            System.out.println("Norte.");
        }
        if (codigo == 3) {
            System.out.println("Código do produto: " + codigo + ":");
            System.out.println("Procedência: ");
            System.out.println("Leste.");
        }
        if (codigo == 4) {
            System.out.println("Código do produto: " + codigo + ":");
            System.out.println("Procedência: ");
            System.out.println("Oeste.");
        } else if (codigo == 5 || codigo == 6) {
            System.out.println("Código do produto: " + codigo + ":");
            System.out.println("Procedência: ");
            System.out.println("Noroeste.");

        } else if (codigo >= 7 && codigo <= 9) {
            System.out.println("Código do produto: " + codigo + ":");
            System.out.println("Procedência: ");
            System.out.println("Sudeste.");

        } else if (codigo >= 10 && codigo <= 20) {
            System.out.println("Código do produto: " + codigo + ":");
            System.out.println("Procedência: ");
            System.out.println("Centro-Oeste.");
        } else if (codigo >= 21 && codigo <= 30) {
            System.out.println("Procedência: ");
            System.out.println("Nordeste.");
        }
        leitor.close();

    }

}
