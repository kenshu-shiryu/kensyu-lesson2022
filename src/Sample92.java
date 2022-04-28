
public class Sample92 {

	public static void main(String[] args) {
		try {
			int x = 10 / 0;
			System.out.println("x=" + x);
		} catch(ArithmeticException e) {
			System.out.println("0で除算はできません。");
		}
	}

}
