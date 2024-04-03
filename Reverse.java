import java.util.Scanner;

public class Reverse {
    public static String reverse(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        return palavraInvertida;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a palavra que queira inverter:");
        String palavra = scan.nextLine();
        System.out.println(reverse(palavra));
        scan.close();
    }
}
