import java.util.Arrays;

public class Exercicio80 {
    public static void main(String[] args) {
        int [] a = {0,2,4,6,8,10,12,14,16,18};
        int [] b = {1,3,5,7,9,11,13,15,17,19};
        int [] r = new int[20];
        int proxLivre = 0;


        for(int i = 0; i < 10; i++){
            r[proxLivre] = a[i];
            proxLivre += 1;
            r[proxLivre] = b[i];
            proxLivre += 1;
        }
        System.out.println(Arrays.toString(r));
        
        

    }
    
}
