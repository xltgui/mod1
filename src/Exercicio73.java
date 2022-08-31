import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int impar = 0, par  = 0;
        int numeros[] = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("número: ");
            numeros[i] = Integer.parseInt(leitor.nextLine());
            if(numeros[i] % 2 == 1){
                impar += 1;
            }
            if(numeros[i] % 2 == 0){
                par += 1;
            }

        }
        System.out.println("pares: " + par);
        System.out.println("ímpares: " + impar);
        leitor.close();

         
    }
    
}
