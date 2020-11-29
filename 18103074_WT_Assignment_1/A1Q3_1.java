import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class A1Q3_1
{
	public static int shortestDist=Integer.MAX_VALUE;
	static void allPaths(Integer start, Integer sink, boolean[] vis,List<Integer> path,ArrayList<Integer>[] graph,int[][] mat) {
		if(start==sink) {
			int curr=0;
			for(int i=0;i<path.size()-1;i++) {
				curr+=mat[path.get(i)][path.get(i+1)];
			}
			shortestDist=Math.min(shortestDist, curr);
			return;
		}
		vis[start]=true;
		for(Integer i: graph[start]) {
			if(!vis[i]) {
				path.add(i);
				allPaths(i,sink,vis,path,graph,mat);
				path.remove(i);
			}
		}
		vis[start] = false; 
	}
	public static void main(String[] args)
	{	Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of Vertices");
		int v = scan.nextInt();
		System.out.println("Enter the number of edges:");
        int m = scan.nextInt();
        int mat[][] = new int[v][v];
        for(int i=0;i<v;i++) {
        	for(int j=0;j<v;j++) {
        		if(i==j)mat[i][j]=0;
        		else mat[i][j]=Integer.MAX_VALUE;
        	}
        }
        System.out.println("Enter the source + destination vertex and weight of each edge based on 0 indexing:");
        ArrayList<Integer>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) { 
        	graph[i] = new ArrayList<>(); 
        }
        for(int i=0;i<m;i++) {
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	int w = scan.nextInt();
        	graph[a].add(b);
        	mat[a][b]=w;
        }
        System.out.println("Enter the start and sink vertex to shortest path based on 0 indexing:");
        int start = scan.nextInt();
        int sink = scan.nextInt();
        boolean[] vis = new boolean[v];
        ArrayList<Integer> paths = new ArrayList<>(); 
        paths.add(start);
        allPaths(start,sink,vis,paths,graph,mat);
        if(shortestDist<0) System.out.println("Negative Cycle exits");
        else System.out.println("Minimum Dist b/w source and sink is: "+shortestDist);
        
	}
}
/*

v=4
m=6

0 1
0 2
0 3
2 0
2 1
1 3 

start=2 sink=3


 */

