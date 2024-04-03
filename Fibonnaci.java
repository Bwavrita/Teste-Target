import java.util.Scanner;

public class Fibonnaci {
    public static boolean temFibonnaci(int n){
        int tn0 = 0, tn1 = 1;
        while(tn1!=n){
            int temp = tn1;
            tn1 = tn0+tn1;
            tn0 = temp;
            if(tn1>n){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja verificar se há na série de Fibonnaci");
        int n = scan.nextInt();
        if(temFibonnaci(n)){
            System.out.println("O número: " + n + " contém na série de Fibonnaci");
        }else{
            System.out.println("O número: " + n + " não contém na série de Fibonnaci");
        }

        scan.close();
    }
}
