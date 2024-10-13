import java.util.Scanner;

//Java prg to check if vowel is present in a string
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		System.out.println("Does string contain vowels: " + checkVowels(str));
		sc.close();
	}

	public static boolean checkVowels(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}

}
