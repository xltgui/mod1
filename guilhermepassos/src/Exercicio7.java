import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double multa, boleto, percentual;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da multa em percentual: ");
        percentual = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o valor do boleto");
        boleto = Double.parseDouble(leitor.nextLine());

        multa = (boleto * percentual) / 100;

        System.out.println("O valor da multa é: ");
        System.out.println(multa);

        leitor.close();




    }
    
}
