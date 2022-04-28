
public class Sample61 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 3;
		arr[1] = 13;
		arr[2] = 23;
		arr[3] = 33;
		arr[4] = 43;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "番目は" + arr[i] + "です");
		}
	}

}
