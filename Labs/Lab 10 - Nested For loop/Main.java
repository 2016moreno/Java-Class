
public class Main {

	public static void main(String[] args) {
		
		int[] x = {5, 3, 2, 1, 0};
		MySelectionSort s = new MySelectionSort();
		MySelectionSort.selSort(x);
		
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
