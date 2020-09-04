import java.util.Scanner;

public class q1 {

    static void comp(String s1s, String s2s) {
        int n1 = s1s.length();
        int n2 = s2s.length();
        char[] s1 = s1s.toCharArray();
        char[] s2 = s2s.toCharArray();
        int cmp = 0;
        for(int i=0;i<n1 && i<n2;i++) {
            if(s1[i]<s2[i]) {
                cmp=-1;break;
            }
            if(s1[i]>s2[i]) {
                cmp=1;break;
            }
        }
        if(cmp==-1) {
            System.out.println(s1s+" < "+s2s);
        }
        else if(cmp==1) {
            System.out.println(s2s+" < "+s1s);
        }
        else {
            if(n1>n2) {
                System.out.println(s2s+" < "+s1s);
            }
            else if(n2>n1) {
                System.out.println(s1s+" < "+s2s);
            }
            else {
                System.out.println(s1s+" = "+s2s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        comp(s1,s2);
    }
}