import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class A1Q3_2
{
	static void allPaths(Integer start, Integer sink, boolean[] vis,List<Integer> path,ArrayList<Integer>[] graph) {
		if(start==sink) {
			System.out.println(path);
			return;
		}
		vis[start]=true;
		for(Integer i: graph[start]) {
			if(!vis[i]) {
				path.add(i);
				allPaths(i,sink,vis,path,graph);
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
        System.out.println("Enter the source and destination vertex of each edge based on 0 indexing:");
        ArrayList<Integer>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) { 
        	graph[i] = new ArrayList<>(); 
        } 
        for(int i=0;i<m;i++) {
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	graph[a].add(b);
        }
        System.out.println("Enter the start and sink vertex to find all paths based on 0 indexing:");
        int start = scan.nextInt();
        int sink = scan.nextInt();
        boolean[] vis = new boolean[v];
        ArrayList<Integer> paths = new ArrayList<>(); 
        paths.add(start);
        System.out.println("All paths b/w start and sink are:");
        allPaths(start,sink,vis,paths,graph);
        
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

