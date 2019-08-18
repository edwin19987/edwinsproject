package bubble_sort;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {5,7,2,9,4,1,0,5,7};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	/*
	 * 共需要比較length-1輪,因為最後一位已經跟前一位比完了
	 */
	public static void bubbleSort(int[] arr) {
		 //控制比較多少輪
		for(int i=0;i<arr.length-1;i++) {
			//控制比較的次數
			for(int j=0;j<arr.length-1-i;j++) {//-i因為已經比過就不需要再比再比
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
