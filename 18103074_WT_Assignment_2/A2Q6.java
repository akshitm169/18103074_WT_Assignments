import java.util.Scanner;

public class A2Q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to get the hailstone sequence:");
        int n = scan.nextInt();
        if(n<1) {
            System.out.print("Input is invalid");
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