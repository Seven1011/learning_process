/*
��������������⣺
   1��NullPointerException ��ָ���쳣
	 ԭ���������ͱ���û��ָ���κζ��󣬶������˶�������Ի��ߵ����˶���ķ���
   2��ArrayIndexOutOfBoundsException ����ֵԽ��
   �����˲����ڵ�����ֵ



	*/

class  Demo6
{
	public static void main(String[] args) 
	{
		/*
		int[] arr = new int[2];
		arr = null ;//null �øñ�����Ҫ�����κεĶ���
		arr[1] = 10;
		System.out.println(arr[1]);
		*/
		int [] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//System.out.println(arr[4]);//��������ֵΪ4���ڴ�ռ䴢���ֵ
		for (int index = 0; index<=arr.length ; index++ )//��������Խ��
		{
			System.out.println(arr[index]+",");
		}
	}
	}
