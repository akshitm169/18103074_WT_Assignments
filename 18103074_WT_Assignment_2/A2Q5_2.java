import java.util.*;  
public class A2Q5_2 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HashSet Implementation");
        System.out.println("Enter the number of elements in the first array:");
        int n1=scan.nextInt();
        System.out.println("Enter the elements of the first array in range of 0 and 10 both inclusive:");
        Set<Integer> set1 = new HashSet<Integer>();  
        for(int i=0;i<n1;i++) {
        	int val =scan.nextInt();
        	if(val<0 || val>10) {
        		System.out.println("The numbers are not in the range");
        		return;
        	}
        	set1.add(val);
        }
        
        System.out.println("Enter the number of elements in the second array:");
        int n2=scan.nextInt();
        System.out.println("Enter the elements of the second array in range of 0 and 10 both inclusive:");
        Set<Integer> set2 = new HashSet<Integer>(); 
        int[] arr2= new int[n2];
        for(int i=0;i<n2;i++) {
        	int val =scan.nextInt();
        	if(val<0 || val>10) {
        		System.out.println("The numbers are not in the range");
        		return;
        	}
        	set2.add(val);
        }
        
        
        HashSet<Integer> universe = new HashSet<Integer>();  
        universe.addAll(Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9,10}));  
        
        long start = System.currentTimeMillis();
        
        Set<Integer> union = new HashSet<Integer>(set1);  
        union.addAll(set2);  
        System.out.println("The union of both arrays is:");
        System.out.println(union+"\n");
        
        
        Set<Integer> intersection = new HashSet<Integer>(set1);  
        intersection.retainAll(set2);  
        System.out.println("The intersection of both arrays is:");
        System.out.println(intersection+"\n");
        
        Set<Integer> complement1 = new HashSet<Integer>(universe);  
        complement1.removeAll(set1);  
        System.out.println("The complement of first array is:");
        System.out.println(complement1+"\n");
        
        Set<Integer> complement2 = new HashSet<Integer>(universe);  
        complement2.removeAll(set2);  
        System.out.println("The complement of second array is:");
        System.out.println(complement2+"\n");
        
        long end = System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+" milliseconds");
        
        
    }
}

//1 1 2 2 4 4 7 8 10 10
//1 3 2 2 4 8