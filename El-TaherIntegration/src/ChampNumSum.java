public class ChampNumSum {
	public void numsum() {
		int arr[] = new int[5];
		int qty = 1;

		for (int index = 0; index < 5; index++)

		{

		  arr[index] = index * qty;

		  qty = qty + 1;
		  System.out.println(arr[index]);
		}
	}
}


