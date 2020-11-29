//Complexity - {alphabetSize}^{n*m} !!!!
import java.util.*;

class myInt { 
    public Integer value; 
    myInt(Integer value) 
    { 
        this.value = value; 
    } 
  
    @Override
    public String toString() 
    { 
        return String.valueOf(value); 
    } 
} 

public class A4Q1 {
	public static int ans=Integer.MAX_VALUE;
	static void Backtrack(Set<Integer> alpha,int[][] temp,int[][] mat,int row, int col,int n,int m,myInt currCost) {
		if(row==n) {
			if(check(temp,n,m)) {
				ans=Math.min(ans,count(temp,mat,n,m));
			}
			return;
		}
		Iterator<Integer> i = alpha.iterator();
		temp[row][col]=mat[row][col];
		if (!pruning(temp,row,col)) {
			if(col+1==m) Backtrack(alpha,temp,mat,row+1,0,n,m,currCost);
			else Backtrack(alpha,temp,mat,row,col+1,n,m,currCost);
		}
		while(i.hasNext()) {
			temp[row][col]=i.next();
			if(temp[row][col]!=mat[row][col] && currCost.value>=(n*m)/2) {
				break;
			}
			if (pruning(temp,row,col)) continue;
			else {
				if(col+1==m) Backtrack(alpha,temp,mat,row+1,0,n,m,currCost);
				else Backtrack(alpha,temp,mat,row,col+1,n,m,currCost);
				break;
			}
			
		}
	}
	static boolean pruning(int[][] temp,int row,int col) {
		try {
			if(temp[row][col]==temp[row-1][col]) return true;
		}catch(Exception e){;}
		try {
			if(temp[row][col]==temp[row+1][col]) return true;
		}catch(Exception e){;}
		try {
			if(temp[row][col]==temp[row][col-1]) return true;
		}catch(Exception e){;}
		try {
			if(temp[row][col]==temp[row][col+1]) return true;
		}catch(Exception e){;}
		return false;
	}
	static boolean check(int[][] temp,int n,int m) {
		for(int i=0;i<n;i++) {
			Set<Integer> freq = new HashSet<Integer>(); 
			for(int j=0;j<m;j++) {
				freq.add(temp[i][j]);
			}
			if(freq.size()<2) return false;
		}
		return true;
	}
	static int count(int[][] temp,int[][] mat,int n,int m) {
		int val=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(mat[i][j]!=temp[i][j]) val++;
			}
		}
		return val;
	}
	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the number of rows");
        n = scan.nextInt();
        System.out.println("Enter the number of columns");
        m = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter each row in new line");
        int mat[][] = new int[n][m];
        int temp[][] = new int[n][m];
        Set<Integer> alpha = new HashSet<Integer>(); 
        for(int i=0;i<n;i++) {
        	String s = scan.nextLine();
        	for(int j=0;j<m;j++) {
        		mat[i][j] = ((int) s.charAt(j))-97;
        		temp[i][j] = -1;
        		alpha.add(mat[i][j]);
        	}
        }
        ans=m*n/2;
        myInt currCost=new myInt(0);
        Backtrack(alpha,temp,mat,0,0,n,m,currCost);
        System.out.println("The minimum cost to replant the field is:");
        System.out.println(ans);
        
    }
}

//4 4 acaa dddd bbbb ccce