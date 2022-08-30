import java.util.Scanner;



public class Quilowat {
    public static void main(String[] args) {
        double kw, minimo, residencia, desconto;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        minimo = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite a quantidade de quilowatts consumida: ");
        kw = Double.parseDouble(leitor.nextLine());

        kw = minimo / 5;
        System.out.println("Cada quilowatt custa: " + kw + " R$");
        
        residencia = kw * (minimo / 5);

        System.out.println("O valor a ser pago pela residência é " + residencia + " R$");

        desconto = residencia - (residencia * 15) / 100;

        System.out.println("O valor em reais a ser pago com 15% de desconto é: " + desconto + " R$");

        leitor.close();

    }

}
