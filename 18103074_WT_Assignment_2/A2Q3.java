import java.util.Scanner;

public class A2Q3 {

	static int compare(String s1, String s2) {
    	for(int i=0;i<Math.min(s1.length(),s2.length());i++){
    		if((int)s1.charAt(i)==(int)s2.charAt(i)) continue;
    		return (int)s1.charAt(i)-(int)s2.charAt(i);
    	}
    	return s1.length()-s2.length();
    }

    static void bubbleSort(String[] strArray) {
        int n=strArray.length;
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<n-i-1;j++) {
        		if(compare(strArray[j],strArray[j+1])>0) {
        			String temp=strArray[j];
        			strArray[j]=strArray[j+1];
        			strArray[j+1]=temp;
        		}
        	}
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = scan.nextInt();
        String[] strArray = new String[n];
        scan.nextLine();
        System.out.println("Enter strings one in each line:");
        for(int i=0;i<n;i++) {
        	strArray[i] = scan.nextLine();
        }
        bubbleSort(strArray);
        System.out.println("The strings in sorted order are:");
        for(int i=0;i<n;i++) {
            System.out.println(strArray[i]);
        }
    }
}