/*
ֱ����������һ��������ʱ�򣬴��ݸ������Ĳ�����ʵ���ϴ��ݱ������洢��ֵ��

����1������һ���������������������ͱ�����ֵ��


����ǲ�ͬ���������͵ı�������ͬһ��������ô�϶���Ӱ�쵽�����

	*/
class Demo5 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 5;
		changeValue(a,b);
		System.out.println("����֮���ֵ��")
	}
		//���󣺶���һ���������������������ͱ�����ֵ
		public static void changeValue(int a , int b){
			int temp = a;
			a = b;
			b = temp;
			System.out.println("�����ڲ�������ֵ��a = "+a+"b = "+b);
		}
}
