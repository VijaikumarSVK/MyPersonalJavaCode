package Practice;

public class QuickSort {

	public static void QuickSorting(int arr[], int low, int high) {

		if (low > high)
			return;

		int mid = (high + low) / 2;

		int pivot = arr[mid];
		int i = low;
		int j = high;

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}
		if (low < j) {
			QuickSorting(arr, low, j);
		}
		if (high > i) {
			QuickSorting(arr, i, high);
		}
	}

	public static void main(String args[]) {

		int arr[] = { 5,58,2,66,7,42,35 };
		System.out.println("Before sorting...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		QuickSorting(arr, 0, arr.length - 1);

		System.out.println("After sorting...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

//
//
//
//
// if(low>high)return;
//
// int mid = (high+low)/2;
// int pivot = arr[mid];
// int i = low;
// int j = high;
//
// while (i<=j){
//
// while(arr[i]<pivot){
// i++;
// }
// while(arr[j]>pivot){
// j--;
// }
// if(i<=j){
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// i++;
// j--;
// }
// }
// if(low<j){
// QuickSortmethod(arr,low,j);
// }
// if(high>i){
// QuickSortmethod(arr,i,high);
// }
// }
//
// public static void main(String args[]) {
// int arr[] = { 20, 50, 60, 10, 40, 80, 90, 70,
// 30,12,45,78,11,36,44,115,22,699,88,12,30,5,7,86,4,3,6,5,4,1,8,2 };
//
// System.out.println("Before sort");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// QuickSortmethod(arr, 0, arr.length-1);
// System.out.println("After sort");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
//
// }
