
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeros[] = new int[10];
        int zero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("número: ");
            numeros[i] = Integer.parseInt(leitor.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 10) {
                numeros[i] = zero;
            }
        }
        System.out.println(Arrays.toString(numeros));
        // System.out.println(zero);
        leitor.close();
    }

}
