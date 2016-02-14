package template;

public class ConcreteSort extends AbstractSort {

	@Override
	protected void sort(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length-1; i++){
			selectSort(array, i);
		}

	}

	private void selectSort(int[] array, int index) {
		// TODO Auto-generated method stub
		int minValue = 32767;
		int indexMin = 0;
		int temp;
		for (int i = index; i < array.length; i++){
			if (array[i] < minValue){
				minValue = array[i];
				indexMin = i;
			}
		}
		temp = array[index];
		array[index] = array[indexMin];
		array[indexMin] = temp;
		
	}

}
