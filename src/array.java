import java.util.Arrays;
import java.util.Scanner;


public class array {
    public static void main(String[] args) {
        String[] listaNomes = new String[10];
        listaNomes[0] = "zezinho";
        listaNomes[9] = "mariazinha";
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < listaNomes.length; i++){
            System.out.println("Nome: ");
            listaNomes[i] = leitor.nextLine();
        }

        for(int i = 0; i < 10; i ++){
            System.out.println(listaNomes[i]);
        }
        System.out.println(Arrays.toString(listaNomes));


        

        

        leitor.close();
    }
    
}
