import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valor;
        System.out.println("Número: ");
        valor = Integer.parseInt(leitor.nextLine());

        int fatorial = 1;

        for(int i = valor; i > 0; i--){
            fatorial = fatorial * i;
        
        }
        System.out.println(fatorial);
        leitor.close();
                

}

}
