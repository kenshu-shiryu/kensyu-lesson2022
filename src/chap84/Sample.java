package chap84;

import chap84.Animal;
import chap84.Bird;

public class Sample {
	public static void main(String[] args) {
		Animal taro = new Animal(2);
		
		if (taro.display(2) == true) {
			System.out.println("羽はありますが、飛べるとは限りません");
		} else {
			System.out.println("羽はありません");
		}
		
		Bird hanako = new Bird(2, true);
		
		if (hanako.display(2) == true) {
			System.out.println("春になると帰ってしまいます");
		} else {
			hanako.display(false);
		}
	}
}
