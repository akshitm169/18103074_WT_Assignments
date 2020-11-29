import java.util.HashMap;
import java.util.Scanner;
public class A1Q2{
	static String convertor(String s) {
		String converted=new String();
		for(int i=0;i<s.length();i++) {
			if(i==0) converted+=s.charAt(0);
			else converted+="*";
		}
		return converted;
	}
	public static void main(String[] args) {
		System.out.println("Enter the paragraph:");
		Scanner scan=new Scanner(System.in);
		String p;
		p=scan.nextLine();
		System.out.println("Enter the size of replacement vector:");
		HashMap<String, Integer> map = new HashMap<>();
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the word ");
			String q;
			q=scan.next();
			map.put(q,1);
		}
		String[] pStr = p.split(" ");
		p = new String();
		for(String s: pStr) {
			if(map.containsKey(s)) p+=convertor(s);
			else p+=s;
			p+=" ";
		}
		System.out.println("The converted paragraph is:");
		System.out.println(p);
	}
}