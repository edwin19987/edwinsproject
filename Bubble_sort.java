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
	 * ����Ҫ���^length-1݆,�������һλ�ѽ���ǰһλ������
	 */
	public static void bubbleSort(int[] arr) {
		 //���Ʊ��^����݆
		for(int i=0;i<arr.length-1;i++) {
			//���Ʊ��^�ĴΔ�
			for(int j=0;j<arr.length-1-i;j++) {//-i����ѽ����^�Ͳ���Ҫ�ٱ��ٱ�
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
