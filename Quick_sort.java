package quick_sort;

import java.util.Arrays;
/*
 * quicksort，先找基準數，然後依基準數將數組分為比基準數大跟比基準數小的兩部分
 * 然後再將兩部分依上述的方式在各自分為兩部分，直到排好順序。
 */

public class Quick_sort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,6,7,2,7,2,8,0};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr,int start,int end) {
		//要設定何時需要排序，不然會有無限一直排的情況
		if(start<end) {
			//把數組中的第零個數作為標準數
			int stard = arr[start];
			//紀錄需要排序的下標
			int low = start;
			int high = end;
			//循環找比標準數大的數和比標準數小的數
			while(low<high) {
				//右邊數字比標準數大,讓下標往前移
				while(low<high && stard<=arr[high]) {
					high--;
				}
				//右邊數字比左邊數字小，使用右邊數字替換左邊數字
				arr[low]=arr[high];
				//如果左邊的數字比標準數小
				while(low<high && arr[low]<=stard) {
					low++;
				}
				//左邊數字比標準數大，把大的低位數字賦給高位置。
				arr[high]=arr[low];
			}
			//當低位(low)跟高位(high)重合，就將標準數賦予低或高位
			arr[low]=stard;
			//處理所有的小的數字
			quickSort(arr,start,low);
			//處理所有的大的數字
			quickSort(arr,low+1,end);
		}
	}

}
