package PrincípiosJava;

public class Strings {

	public static void main(String[] args) {
		String original = " abc DEF gHi JkL MnO pQR stV WxYz";
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2, 10);
		String s6 = original.replace("a", "x");
		String s7 = original.replace("abc", "xyz");
		int s8 = original.indexOf("bc");
		int s9 = original.lastIndexOf("bc");
		
		System.out.println("Original: -"+ original+ "-");
		System.out.println("Lower Case: -"+ s1+ "-");
		System.out.println("Upper Case: -"+ s2+ "-");
		System.out.println("Trim: -"+ s3+ "-");
		System.out.println("Substring: -"+ s4+ "-");
		System.out.println("Substring(2,9): -"+ s5+ "-");
		System.out.println("Replace(a,x): -"+ s6+ "-");
		System.out.println("Replace(abc, xyz): -"+ s7+ "-");
		System.out.println("Index(bc): -"+ s8+ "-");
		System.out.println("Last Index(bc): -"+ s9+ "-");
	}
}