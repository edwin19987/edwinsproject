package selection_sort;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,7,1,2,0,3,6,8};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		//���Ҫ����С�Ĕ��������������M��Ҫ��varr.length��
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			//�Ѯ�ǰ��v�Ĕ�����������Д������M�б��^���Kӛ���С������
			for(int j=i+1;j<arr.length;j++) {
				//���������^�Ĕ��ȼo䛵���С�Ĕ�С
				if(arr[minIndex]>arr[j]) {
					//ӛ�����С������
					minIndex = j;
				}
			}
			//�����С�Ĕ��ͮ�ǰ��v�����˲�һ�£��f��minIndex�Ĕ��Ȯ�ǰ��v�Ĕ���С
			if(i!=minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
