import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double  distancia = 0, reembolso = 0;


        

        Scanner leitor = new Scanner(System.in);
        

        System.out.println("Digite os km rodasdos: "); 
        distancia = Double.parseDouble(leitor.nextLine());

        reembolso = (distancia / 13) * 2.20;

        System.out.println("O valor do reembolso é: ");
        System.out.println(reembolso);

        leitor.close();





         

        


        
    }
    
}
