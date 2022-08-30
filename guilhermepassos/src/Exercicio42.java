import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double velocidade;

        System.out.println("Digite a velocidade do carro em km: ");
        velocidade = Double.parseDouble(leitor.nextLine());

        if(velocidade >= 60 && velocidade <= 100){
            System.out.println("Multa média de 60 UFIR.");
        }else if(velocidade >= 100 && velocidade <= 160){
            System.out.println("Multa grave de 120 UFIR.");

        }else{
            System.out.println("Multa gravíssima de 180 UFIR.");
        }
        leitor.close();

        
    }
    

    
}
