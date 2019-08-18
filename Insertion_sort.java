package insertion_sort;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		int[] arr = new int[] {5,3,2,8,5,9,1,0};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertSort(int[] arr) {
		//��v���еĔ���
		for(int i=1;i<arr.length;i++) {
			//�����ǰ�Ĕ��ֱ�ǰһ������С
			if(arr[i]<arr[i-1]) {
				//�Ѯ�ǰ���ִ�����
				int temp = arr[i];
				int j;
				//��v��ǰ����ǰ�����еĔ���
				for(j=i-1;j>=0 && arr[j]>temp;j--) {
					System.out.println(j);
					//��ǰһ�������x�o��һ������
					arr[j+1] = arr[j];
				}
				//���R�r׃��(���forѭ�h�Į�ǰԪ��)�x�o���M��l������һ��Ԫ��
				arr[j+1] = temp;
			}
		}
	}

}
