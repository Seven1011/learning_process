/*
���󣺶���һ����������һ��int���͵���������ҳ���������е����Ԫ��
	  ���ظ������ߡ�

ֱ������ѡ�����򣩣�����һ���������ڼ�¼���ֵ��Ȼ��ʹ�øñ����������е�ûһ��Ԫ�ؽ�
�бȽϡ����������Ԫ�ر�Ļǰ����¼��ֵҪ��ģ���Ĭ�ñ�����¼Ŀǰ�Ƚϵ�ֵ

	*/
class  Demo8
{
	public static void main(String[] args) 
	{
		int[] arr = {12,14,26,5,4}
		 int max = getMax(arr);
		 System.out.println("���ֵ��"+max);
	}


	public static int getMax(int[] arr){
	  int max = arr[0];//���ڼ�¼���ֵ
	  for (int i = 1; i<arr.length ; i++ )
	  {
		  if (arr[i]>max)  //�������Ԫ�ر�max����ômax��¼��Ԫ�ء�
		  {
			  max = arr[i];
		  }
	  }
		 return max;
	}



}
