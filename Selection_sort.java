package selection_sort;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,7,1,2,0,3,6,8};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		//因為要找最小的數，所以整個數組都要遍歷arr.length次
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			//把當前遍歷的數和後面的所有數依次進行比較，並記錄最小數的下標
			for(int j=i+1;j<arr.length;j++) {
				//如果後面比較的數比紀錄的最小的數小
				if(arr[minIndex]>arr[j]) {
					//記錄下最小數的下標
					minIndex = j;
				}
			}
			//如果最小的數和當前遍歷數的下標不一致，說明minIndex的數比當前遍歷的數更小
			if(i!=minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
