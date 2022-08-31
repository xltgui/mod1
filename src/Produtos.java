import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        int codigo, codPais, imposto141, imposto8101, imposto571;
        float precoProd14, precoProd57, precoProd810, imposto142, imposto143, imposto572, imposto573,
                imposto8102, imposto8103, kilo, gramas;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código do produto (de 1 a 10): ");
        codigo = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o peso em quilos do produto: ");
        kilo = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o código do país de origem (de 1 a 3): ");
        codPais = Integer.parseInt(leitor.nextLine());

        gramas = kilo * 1000;

        precoProd14 = (10 * gramas);
        precoProd57 = (25 * gramas);
        precoProd810 = (35 * gramas);

        imposto141 = 0;
        imposto571 = 0;
        imposto8101 = 0;

        imposto142 = (15 * precoProd14) / 100;
        imposto143 = (25 * precoProd14) / 100;

        imposto572 = (15 * precoProd57) / 100;
        imposto573 = (25 * precoProd57 / 100);

        imposto8102 = (15 * precoProd810) / 100;
        imposto8103 = (25 * precoProd810) / 100;

        System.out.println("O peso do produto convertido em gramas é: " + gramas + " g");

        if (codigo <= 4 & codPais == 1) {
            System.out.println("O preço total desse produto é: " + "R$ " + precoProd14);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto141);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd14);
        } else {

        }

        if (codigo <= 4 & codPais == 2) {
            System.out.println("O preço total do produto é: " + "R$ " + precoProd14 + (15 * precoProd14) / 100);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto142);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd14);
        } else {

        }

        if (codigo <= 4 & codPais == 3) {
            System.out.println("O preço total do produto é: " + "R$ " + precoProd14 + (25 * precoProd14) / 100);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto143);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd14);
        } else {

        }

        if (codigo >= 5 & codigo <= 7 & codPais == 1) {
            System.out.println("O preço total do produto é: " + "R$ " + precoProd57 + 0);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto571);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd57);
        } else {

        }

        if (codigo >= 5 & codigo <= 7 & codPais == 2) {
            System.out.println("O preço total do produto é: " + "R$ " + precoProd57 + (15 * precoProd57) / 100);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto572);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd57);
        } else {

        }

        if (codigo >= 5 & codigo <= 7 & codPais == 3) {
            System.out.println("O preço total do produto é: " + "R$ " + precoProd57 + (25 * precoProd57) / 100);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto573);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd57);
        } else {

        }

        if (codigo >= 8 & codigo <= 10 & codPais == 1) {
            System.out.println("O preço total do produto é: " + "R$ " + precoProd810 + 0);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto8101);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd810);
        } else {

        }

        if (codigo >= 8 & codigo <= 10 & codPais == 2) {
            System.out.println("O preço total do produto é: " + "R$ " + precoProd810 + (15 * precoProd810) / 100);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto8102);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd810);
        } else {

        }

        if (codigo >= 8 & codigo <= 10 & codPais == 3) {
            System.out.println("O preço total do produto é: " + "R$ " + precoProd810 + (25 * precoProd810) / 100);
            System.out.println("O valor do imposto desse produto é: " + "R$ " + imposto8103);
            System.out.println("Logo, o preço do produto sem imposto é: " + precoProd810);
        } else {

        }
        leitor.close();

    }

}
