import java.util.Scanner;

//Check if given number is prime number
public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("The given number is Prime number - " + isPrime(num));
		sc.close();
	}

	private static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		} else if (num == 2) {
			return true;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
