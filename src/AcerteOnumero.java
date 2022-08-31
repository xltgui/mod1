import java.util.Random;
import java.util.Scanner;

public class AcerteOnumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt();
        long chute = 0;

        while (tentativas > 0 && acertou == false) {
            System.out.println("Qual seu chute? ");
            chute = leitor.nextLong();

            if (numeroSecreto == chute) {
                System.out.println("Você acertou!!");
                acertou = true;

            } else if (chute < numeroSecreto) {
                --tentativas;
                System.out.println("Número muito baixo! " + tentativas + " tentativas restantes");

            } else {
                --tentativas;
                System.out.println("Número muito alto! " + tentativas + " tentativas restantes");

            }
            if (tentativas == 0) {
                System.out.println("          ");
                System.out.println("O número era: " + numeroSecreto);

            }
            leitor.close();

        }

    }

}
