import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int valor;
        int expressao = 0;
        valor = Integer.parseInt(x.nextLine());
        for(int i = 1; i <= 10; i++){
            expressao = valor * i;
            System.out.println(valor + "*" + i + " = " + expressao );
    
        }
        x.close();
    }

    
}
