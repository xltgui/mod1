import java.util.Arrays;

public class ExeString {
    public static void main(String[] args) {
        String text = "Universidade da Região de Joinville";
        char[] arraytext = text.toCharArray();
        System.out.println(Arrays.toString(arraytext));

        System.out.println(text.charAt(2));
        System.out.println(text.replace(" ", "#").replace("a","+".replace("s", "x")));

        System.out.println(text.substring(26, 35));
        System.out.println(text.length());

        System.out.println(Arrays.toString(text.split(",")));

        String outroTexto = "\"no meio\"";
        System.out.println(outroTexto);

        

    }
    
}
