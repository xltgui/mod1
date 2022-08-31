
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0;
        int menor = 999999999;

        int numeros[] = new int[10];
        for(int i = 0; i <10; i++){
            System.out.println("n°: ");
            numeros[i] = Integer.parseInt(leitor.nextLine());
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("       ");
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        leitor.close();


        
    }
    
}
