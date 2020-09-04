import java.util.Scanner;

public class q2 {

    static void countSort(int[] a) {
        int n = a.length;
        int[] count = new int[21];
        for(int i=0;i<21;i++) count[i] = 0;
        for(int i=0;i<n;i++) {
            count[a[i]]++;
        }
        int k=0;
        for(int i=0;i<21;i++) {
            for(int j=0;j<count[i];j++) {
                a[k] = i;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COUNTING SORT (RANGE 0 TO 20)\n\nEnter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        countSort(a);
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
    }
}