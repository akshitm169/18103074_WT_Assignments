import java.util.HashMap;
import java.util.Scanner;
class A1Q4{
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
	public static void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1:");
		s1=sc.nextLine();
		System.out.println("Enter string 2:");
		s2=sc.nextLine();
		if(check(s1,s2)) System.out.println("Strings are anagrams");
		else System.out.println("Strings are not anagrams");
	}
}
