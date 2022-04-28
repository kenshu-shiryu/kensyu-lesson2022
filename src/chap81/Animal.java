package chap81;

public class Animal {
	private int leg;
	private boolean fly;
	
	public Animal() {
		System.out.println("動物園に新しい動物がやってきました。");
	}
	
	public boolean display(int leg) {
		this.leg = leg;
		if (this.leg == 2) {
			System.out.println("それは鳥です。");
			return true;
		} else {
			System.out.println("それは４本足の動物です。");
			return false;
		}
	}
	
	public void display(boolean fly) {
		this.fly = fly;
		if (this.fly == true) {
			System.out.println("空を飛べます");
		} else {
			System.out.println("空は飛べません");
		}
	}
	
	public void display(int leg, boolean fly) {
		display(leg);
		display(fly);
	}
}
