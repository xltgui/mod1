import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        int quant15 = 0;
        int quant1630 = 0;
        int quant3145 = 0;
        int quant4660 = 0;
        int quant61 = 0;
        double percent15 = 0;
        double percent1630 = 0;
        double percent3145 = 0;
        double percent4660 = 0;
        double percent61 = 0;

        for (int i = 0; i <= 15; i++) {
            System.out.println("Idade da pessoa: ");
            idade = Integer.parseInt(leitor.nextLine());
            if (idade <= 15) {
                quant15 = quant15 + 1;
            }
            if (idade >= 16 && idade <= 30) {
                quant1630 = quant1630 + 1;
            }
            if (idade >= 31 && idade <= 45) {
                quant3145 = quant3145 + 1;
            }
            if (idade >= 46 && idade <= 60) {
                quant4660 = quant4660 + 1;
            }
            if (idade > 60) {
                quant61 = quant61 + 1;
            }
        }
        percent15 = (100 * quant15) / 15;
        percent1630 = (100 *quant1630) / 15;
        percent3145 = (100 *quant3145) / 15;
        percent4660 = (100 * quant4660) / 15;
        percent61 = (100 *quant61) / 15;      

        System.out.println("             ");
        System.out.println("Até 15 anos: " + quant15);
        System.out.println("de 16 a 30 anos: " + quant1630);
        System.out.println("de 31 a 45 anos: " + quant3145);
        System.out.println("de 46 a 60 anos: " + quant4660);
        System.out.println("Acima de 61 anos: " + quant61);
        System.out.println("                  ");
        System.out.println("O percentual de pessoas com até 15 anos é: " + percent15 + "%");
        System.out.println("O percentual de pessoas de 16 a 30 anos é: " + percent1630 + "%");
        System.out.println("O percentual de pessoas de 31 a 45 anos é: " + percent3145 + "%");
        System.out.println("O percentual de pessoas de 46 a 46 anos é: " + percent4660 + "%");
        System.out.println("O percentual de pessoas acima 61 anos é: " + percent61 + "%");
        leitor.close();


    }
}
