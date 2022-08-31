import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double col, excesso, calculo;

        System.out.println("Digite a quantidade de colesterol mau existente no sangue: ");
        col = Double.parseDouble(leitor.nextLine());

        excesso = col - 130;

        calculo = (excesso * 100) / 130; /////// = QUANTOS PORCENTO DE EXCESSO;

        if (col < 130) {
            System.out.println("A quantidade de colesterol no sangue é menor que 130g. ");

        } else if (col > 130) {
            System.out.println("O percentual de excesso colesterol no sangue é de: ");
            System.out.println(calculo + "%");

        }

        leitor.close();
    }

}
