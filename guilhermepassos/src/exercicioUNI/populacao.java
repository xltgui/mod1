package exercicioUNI;

import java.util.Scanner;

public class populacao {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        float a, b;
        int i = 0;
        
        System.out.println("Digite a população de A:");
        a = Float.parseFloat(x.nextLine());

        System.out.println("Digite a população de B:");
        b = Float.parseFloat(x.nextLine());

        
        while(b > a){
        i++;
        a = a + (3 * a) / 100;
        b = b + (1.5f * b) / 100;

        }
        System.out.println("Anos necessários para a população A ultrapassar a B: " + i);
        
    }
}
