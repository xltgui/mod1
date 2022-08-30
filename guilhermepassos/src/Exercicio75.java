
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio75 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeros[] = new int[10];
        double soma = 0, quant = 0, media = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("número: ");
            numeros[i] = Integer.parseInt(leitor.nextLine());
        }
        for (int i = 0; i < numeros.length; i++) {
            quant = quant + 1;
            soma += numeros[i];
        }
        media = soma / quant;
        System.out.println(        );
        System.out.println(Arrays.toString(numeros));
        System.out.println("          ");
        System.out.println("quant: " + quant);
        System.out.println("soma: " + soma);
        System.out.println("média: " + media);
        leitor.close();

    }

}
