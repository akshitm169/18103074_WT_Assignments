import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the hailstone sequence of it:");
        int n = sc.nextInt();
        if(n==1) {
            System.out.print("1");
            return;
        }
        if(n<1) {
            System.out.print("Invalid input");
            return;
        }
        while(n!=1) {
            System.out.print(n+" ");
            if(n%2==0) n = n/2;
            else n = n*3+1;
        }
        System.out.print("1");
    }
}