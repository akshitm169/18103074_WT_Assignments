import java.util.HashMap;
import java.util.Scanner;
public class A1Q1
{
	static boolean check(String s1, String s2){
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char c: s1.toCharArray()) {
			if(map1.containsKey(c)) map1.put(c,map1.get(c)+1);
			else map1.put(c,1);
		}
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(char c: s2.toCharArray()) {
			if(map2.containsKey(c)) map2.put(c,map2.get(c)+1);
			else map2.put(c,1);
		}
		if(map1.equals(map2)) return true;
		return false;
	}
	public static void main(String[] args)
	{	Scanner scan= new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter string 1:");
		s1=scan.nextLine();
		System.out.println("Enter string 2:");
		s2=scan.nextLine();
		int length1=s1.length();
		int length2=s2.length();
		int ans=0;
		for(int i=0;i<length1-length2+1;i++) {
			if(check(s1.substring(i,i+length2),s2)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
