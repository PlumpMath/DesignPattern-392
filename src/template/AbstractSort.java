package template;

public abstract class AbstractSort {

	protected abstract void sort(int[] array);
	
	public void showSortResult(int[] array) {
		this.sort(array);
		for (int i = 0; i < array.length; i ++){
			System.out.printf("%3s", array[i]);
		}
	}
}
