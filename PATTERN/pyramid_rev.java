import java.util.Scanner;

public class pyramid_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
			for (int k = 0; k <= 1+i; k++) {
				System.out.print(" ");
			}
			for (int j = a; j > i; j--) {
				System.out.print("* ");
			}

			System.out.println("");
		}
    }
}
