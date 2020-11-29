import java.util.Scanner;

public class A2Q2 {

    static void countSort(int[] arr) {
        int n = arr.length;
        int[] freq = new int[21];
        for(int i=0;i<21;i++) freq[i] = 0;
        for(int i=0;i<n;i++) {
            freq[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<21;i++) {
            for(int j=0;j<freq[i];j++) {
                arr[index]=i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = scan.nextInt();
        System.out.println("Enter the elements in range of 0 to 20 both inclusive:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
            if(arr[i]<0 || arr[i]>20) {
            	System.out.println("Numbers are in invalid range");
            	return;
            }
        }
        countSort(arr);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}