import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int mult = 0;

        System.out.println(" n1: ");
        n1 = Integer.parseInt(leitor.nextLine());
        System.out.println(" n2: ");
        n2 = Integer.parseInt(leitor.nextLine());
        
        for(int contador = 1; contador <= n2; contador++){
            mult = mult + n1;
        }   
        System.out.println("Resultado: " + mult);
        leitor.close(); 
    }
    
        
}
/*69)Faça um algoritmo que calcule a multiplicação de dois números inteiros sem utilizar o operador “*”.
Em vez disso, utilize apenas o operador de adição “+”. Para implementar esse algoritmo, devemos lembrar que qualquer multiplicação pode ser expressa por meio de somas.
 Por exemplo, o resultado da expressão 6 * 3 é o mesmo que 6 + 6 + 6 ou 3 + 3 + 3 + 3 + 3 + 3. 
 Ou seja, soma-se um elemento com ele próprio o número de vezes do segundo elemento.
 */
