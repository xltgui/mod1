import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        double area, raio;
        final double pi = 3.14159;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = Double.parseDouble(leitor.nextLine());

        area = pi * (raio * raio);

        System.out.println("O valor da área da circunferência é: ");
        System.err.println(area + " cm²");

        leitor.close();



    }
    
}
