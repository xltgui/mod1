import java.util.Arrays;
import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[10];
        int[] listaUpSideDown = new int[10];
        for(int i = 0; i <10 ; i++){
            System.out.println("Digite um número: ");
            lista[i] = Integer.parseInt(leitor.nextLine());
        }
        for(int i=0; i<10; i++){
            listaUpSideDown[i] = lista[9-i];
        }

        System.out.println(Arrays.toString(listaUpSideDown));
        leitor.close();
        
    }
    
}
