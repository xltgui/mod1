import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        float numHorasTrab =0, numDiasTrab = 0, numHorasPorMes = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas no dia: ");
        numHorasTrab = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o número de dias trabalhdos: ");
        numDiasTrab = Float.parseFloat(leitor.nextLine());

        numHorasPorMes = (numHorasTrab * numDiasTrab);
        System.out.println("O total de horas trabalhas no mês é: ");
        System.out.println(numHorasPorMes);


        leitor.close();
        
    }
    
}
