package chap76;

public class Animal {
	
	private int leg;
	
	public Animal() {
		System.out.println("動物園に新しい動物がやってきました。");
	}
	
	public boolean display(int leg) {
		if (this.leg ==2) {
			System.out.println("それは鳥です。");
			return true;
		} else {
			System.out.println("ソレハ4本足の動物です。");
			return false;
		}
	}

}
