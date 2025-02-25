import java.util.Scanner;

//Java prg to print a Fibonacci sequence using recursion
public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("The fibonacci sequence: ");
		fibonacciSeq(num);
	}

	private static void fibonacciSeq(int num) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 0; i < num; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
	}
}
