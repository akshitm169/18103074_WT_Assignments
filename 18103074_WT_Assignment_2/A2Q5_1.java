import java.util.Scanner;
public class A2Q5_1 {
	
	static boolean contains(int[] arr,int val) {
		for(int i:arr) {
			if(i==val) return true;
		}
		return false;
	}
	
	static void printArr(int[] arr) {
		for(int i:arr) System.out.print(i+" ");
		System.out.println("\n");
	}
	
	static void union(int[] arr1, int[] arr2) {
    	int[] all=new int[11];
    	int count=0;
    	for(int i=0;i<=10;i++) {
    		if(contains(arr1,i) || contains(arr2,i)) {
    			all[i]=1;
    			count++;
    		}
    		else {
    			all[i]=0;
    		}
    	}
    	int[] unionArr = new int[count];
    	int index=0;
    	for(int i=0;i<=10;i++) {
    		if(all[i]==1) {
    			unionArr[index]=i;
    			index++;
    		}
    	}
    	printArr(unionArr);
    }
	
	static void intersection(int[] arr1, int[] arr2) {
    	int[] all=new int[11];
    	int count=0;
    	for(int i=0;i<=10;i++) {
    		if(contains(arr1,i) && contains(arr2,i)) {
    			all[i]=1;
    			count++;
    		}
    		else {
    			all[i]=0;
    		}
    	}
    	int[] intersectionArr = new int[count];
    	int index=0;
    	for(int i=0;i<=10;i++) {
    		if(all[i]==1) {
    			intersectionArr[index]=i;
    			index++;
    		}
    	}
    	printArr(intersectionArr);
    }
	
	static void complement(int[] arr) {
    	int[] all=new int[11];
    	int count=0;
    	for(int i=0;i<=10;i++) {
    		if(!contains(arr,i)) {
    			all[i]=1;
    			count++;
    		}
    		else {
    			all[i]=0;
    		}
    	}
    	int[] complementArr = new int[count];
    	int index=0;
    	for(int i=0;i<=10;i++) {
    		if(all[i]==1) {
    			complementArr[index]=i;
    			index++;
    		}
    	}
    	printArr(complementArr);
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array Implementation");
        System.out.println("Enter the number of elements in the first array:");
        int n1=scan.nextInt();
        System.out.println("Enter the elements of the first array in range of 0 and 10 both inclusive:");
        int[] arr1= new int[n1];
        for(int i=0;i<n1;i++) {
        	arr1[i]=scan.nextInt();
        	if(arr1[i]<0 || arr1[i]>10) {
        		System.out.println("The numbers are not in the range");
        		return;
        	}
        }
        System.out.println("Enter the number of elements in the second array:");
        int n2=scan.nextInt();
        System.out.println("Enter the elements of the second array in range of 0 and 10 both inclusive:");
        int[] arr2= new int[n2];
        for(int i=0;i<n2;i++) {
        	arr2[i]=scan.nextInt();
        	if(arr2[i]<0 || arr2[i]>10) {
        		System.out.println("The numbers are not in the range");
        		return;
        	}
        }
        long start = System.currentTimeMillis();
        
        System.out.println("The union of both arrays is:");
        union(arr1,arr2);
        
        System.out.println("The intersection of both arrays is:");
        intersection(arr1,arr2);
        
        System.out.println("The complement of first array is:");
        complement(arr1);
        
        System.out.println("The complement of first array is:");
        complement(arr2);
        
        long end = System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+" milliseconds");
        
        
    }
}

//1 1 2 2 4 4 7 8 10 10
//1 3 2 2 4 8