/*
����Ŀǰ��������int[] arr = {0,0,12,1,0,4,6,0},��дһ������
�������飬Ȼ��Ѹ������0��գ�Ȼ�󷵻�һ��������0Ԫ�ص����顣

������ new int[����]

���裺
	1�������������ĳ��ȡ�ԭ�������鳤��-0�ĸ���
	2��
	*/
import java.util.*;
class Demo7 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,0,12,1,0,4,6,0};
		arr = clearZero(arr);
		System.out.println("�����Ԫ�أ�"+Arrays.toString(arr));
	}
	public static int[] clearZero(int[] arr){
		//ͳ��0�ĸ���
		int count = 0;//����һ��������¼0�ĸ���
		for (int i = 0; i<arr.length ; i++)
		{
			if (arr[i]==0)
			{
				count++;
			}
		}
		//����һ���µ��������
		int[] newArr = new int[arr.length-count];

		int index =0 ;//������ʹ�õ�����ֵ

		//�ѷ�0�����ݴ��浽��������
		for (int i= 0 ; i<arr.length ; i++)
		{
			if (arr[i]!=0)
			{
				newArr[index] = arr[i];
				
				index++;
			}
		}
		return newArr;
	}
}
