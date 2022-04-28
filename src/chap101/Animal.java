package chap101;

abstract public class Animal {
	public Animal() {
		System.out.println("動物園に新しい動物がやってきました");
	}
	
	abstract public void speak();
	
	
	public void move(boolean mv) {
		if(mv) {
			System.out.println("歩き回っています");
		} else {
			System.out.println("寝そべっています");
		}
	}
}