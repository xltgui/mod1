import java.util.Scanner;

public class desafio57 {
    public static void main(String[] args) {
        int valor;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número: ");
        valor = Integer.parseInt(leitor.nextLine());
        double total = 1;
        

        for(double i = 1; i <= valor; i++){
            total +=  1 / fatorial((int) i);
            

        }
        System.out.println(total);
        
        //double result = fatorial(valor);
        leitor.close();
        
        
        

    }

    public static double fatorial(int valor) {
        int fatorial = 1;

        for (int i = valor; i > 0; i--) {
            fatorial = fatorial * i;
        }
        return (double) fatorial;

    }

}
/*
 * Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o
 * valor de E, conforme a fórmula a seguir:
 * E = 1 + 1/(1!) + 1/(2!) + 1/(3!) + ... + 1/(N!)
 */
