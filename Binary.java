import java.util.Scanner;

public class Binary {

	void convertAndCount(int num) {

		int count = 0;
		String binary = Integer.toBinaryString(num);
		for (int i = 0; i < binary.length(); i++)
			if (binary.charAt(i) == '1')

				count++;

		System.out.println(count+" Hello");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Binary obj = new Binary();
		int n = scan.nextInt();

		obj.convertAndCount(n);
	}
}