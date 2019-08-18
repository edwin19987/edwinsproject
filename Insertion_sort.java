package insertion_sort;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		int[] arr = new int[] {5,3,2,8,5,9,1,0};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertSort(int[] arr) {
		//遍歷所有的數字
		for(int i=1;i<arr.length;i++) {
			//如果當前的數字比前一個數字小
			if(arr[i]<arr[i-1]) {
				//把當前數字存起來
				int temp = arr[i];
				int j;
				//遍歷當前數字前面所有的數字
				for(j=i-1;j>=0 && arr[j]>temp;j--) {
					System.out.println(j);
					//把前一個數字賦給後一個數字
					arr[j+1] = arr[j];
				}
				//把臨時變量(外層for循環的當前元素)賦給不滿足條件的後一個元素
				arr[j+1] = temp;
			}
		}
	}

}
