import java.util.Scanner;

public class Main {
    public static boolean lastDigit(int n, int m){
        if (n% 10 == m % 10){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2;
        num = sc.nextInt();
        num2 = sc.nextInt();
        if (lastDigit(num, num2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}