
import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int listaNumeros[] = new int[10];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Número: ");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
        }
        System.out.println("         ");
        System.out.println("Maiores que 10: ");
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] > 10) {
                System.out.println(listaNumeros[i]);

            }

        }
        leitor.close();
    }
}
