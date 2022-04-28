package chap83;

public class Sample {
	public static void main(String[] args) {
		Animal piko = new Animal();
		piko.display(2);
		Bird hanako = new Bird(2, true);
		hanako.display(2);
	}
}
