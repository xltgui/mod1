import java.util.Scanner;

public class ifParImpar {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número: ");
        numero = Integer.parseInt(leitor.nextLine());
            
        // if (numero % 2 == 1) SIGNIFICA: SE O NÚMERO FOR ÍMPAR...
        if (numero % 2 == 1) {
            System.out.println(numero + " é impar.");

        } else {
            System.out.println(numero + " é par.");
        }
        leitor.close();
    }

}
