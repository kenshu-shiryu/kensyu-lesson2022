package chap74;

public class Animal {
	private int leg;
	
	public void display(int leg) {
		System.out.println("動物園に新しい動物がやってきました。");
		this.leg = leg;
		
		if (this.leg == 2) {
			System.out.println("それは鳥です。");
		} else {
			System.out.println("それは4本足の動物です");
		}
	}
}
