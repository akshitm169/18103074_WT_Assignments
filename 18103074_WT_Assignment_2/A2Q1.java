import java.util.Scanner;

public class A2Q1{

    static int compare(String s1, String s2) {
    	for(int i=0;i<Math.min(s1.length(),s2.length());i++){
    		if((int)s1.charAt(i)==(int)s2.charAt(i)) continue;
    		return (int)s1.charAt(i)-(int)s2.charAt(i);
    	}
    	return s1.length()-s2.length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String s2 = scan.nextLine();
        if(compare(s1,s2)==0) System.out.println("Both strings are equal");
        else if (compare(s1,s2)<0) System.out.println("First string is lexicographically smaller than second string");
        else System.out.println("Second string is lexicographically smaller than first string");
    }
}