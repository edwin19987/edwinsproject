package quick_sort;

import java.util.Arrays;
/*
 * quicksort�����һ��ʔ���Ȼ�������ʔ������M�֞�Ȼ��ʔ�����Ȼ��ʔ�С�ăɲ���
 * Ȼ���ٌ��ɲ����������ķ�ʽ�ڸ��Է֞�ɲ��֣�ֱ���ź����
 */

public class Quick_sort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,6,7,2,7,2,8,0};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr,int start,int end) {
		//Ҫ�O���Εr��Ҫ���򣬲�Ȼ���Пo��һֱ�ŵ���r
		if(start<end) {
			//�є��M�еĵ��む������˜ʔ�
			int stard = arr[start];
			//�o���Ҫ�������
			int low = start;
			int high = end;
			//ѭ�h�ұȘ˜ʔ���Ĕ��ͱȘ˜ʔ�С�Ĕ�
			while(low<high) {
				//��߅���ֱȘ˜ʔ���,׌����ǰ��
				while(low<high && stard<=arr[high]) {
					high--;
				}
				//��߅���ֱ���߅����С��ʹ����߅������Q��߅����
				arr[low]=arr[high];
				//�����߅�Ĕ��ֱȘ˜ʔ�С
				while(low<high && arr[low]<=stard) {
					low++;
				}
				//��߅���ֱȘ˜ʔ��󣬰Ѵ�ĵ�λ�����x�o��λ�á�
				arr[high]=arr[low];
			}
			//����λ(low)����λ(high)�غϣ��͌��˜ʔ��x��ͻ��λ
			arr[low]=stard;
			//̎�����е�С�Ĕ���
			quickSort(arr,start,low);
			//̎�����еĴ�Ĕ���
			quickSort(arr,low+1,end);
		}
	}

}
