package chap75;

public class Sample {

	public static void main(String[] args) {
		Animal hanako = new Animal();
		if (hanako.display(2) == true) {
			System.out.println("羽はありますが、飛べるとは限りません");
		} else {
			System.out.println("羽はありません");
		}

	}

}
