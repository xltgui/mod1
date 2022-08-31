import java.util.Arrays;
import java.util.Scanner;

public class Exercicio77 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mult, res = 0;
        System.out.println("mult: ");
        mult = Integer.parseInt(leitor.nextLine());

        int numeros[] = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("n°: ");
            numeros[i] = Integer.parseInt(leitor.nextLine());
        }
        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i < 10; i++){
            res = mult * numeros[i];
            System.out.println(mult + "*" + numeros[i] + " = " + res);
        }
        leitor.close();
        
        
    }
}
