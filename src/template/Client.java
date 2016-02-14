package template;

/**
 * @author Jianyong
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };
		AbstractSort s = new ConcreteSort();
		s.showSortResult(a);

	}

}
