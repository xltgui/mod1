import java.util.Scanner;

public class ChecarIgual {
    public static void main(String[] args) {
        String x = "https://animaeducacao.zoom.us/j/81096436646?pwd=dmFFOVF3SFk5SlpDVUNtSHczaTZFdz09";
        String a;

        Scanner y = new Scanner(System.in);
        a = y.nextLine();

        if (a.equals(x)) {
            System.out.println("igual");
        }
        y.close();

    }
}
