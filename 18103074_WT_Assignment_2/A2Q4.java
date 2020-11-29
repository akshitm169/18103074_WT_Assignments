import java.util.Scanner;

public class A2Q4 {

    public static void main(String[] args) {
        int n=1;
        int sum=0;
        while(n<Integer.MAX_VALUE) {
        	sum+=n;
        	if(sum==n*n) {
        		System.out.println("The value is: "+n);
        		return;
        	}
        }
        System.out.println("No such value exits in the range of Integers");
    }
}