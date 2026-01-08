

public class Main
{
	public static void main(String[] args) {
		System.out.println(" Checking whether a Array is sorted or not");
		int arr[]= {1,34,2,56,67,32};
		boolean isSorted=true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;

			}
		}
		if(isSorted) {
			System.out.println("the array is sotrted");
		}
		else {
			System.out.println("the array is not sorted");
		}
	}
	
}