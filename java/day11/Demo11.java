/*
ģ��ģʽ�����ĳ������Ĳ����ǹ̶��ġ���Щ�ǻᷢ���仯�ģ���ô��ʱ�����ǿ���Ϊ��
�������ṩһ��ģ����룬�Ӷ����Ч��

���󣺱�дһ�������������ʱ���ģ��

ģ��ģʽ�Ĳ��裺
	1����Щ����������������е�����Ľ��������
	2���������룬�ѻᷢ���仯�Ĵ����ȡ����������һ���������Ѹ÷���Ҳ�����һ��������
	3��ʹ��finall����ģ�巽�������α�����д���ģ�巽����

	*/
abstract class MyRuntime{
	public final void getTime(){
		long startTime = System.currentTimeMillis();  //��¼��ʼ��ʱ��
		code();
		long endTime = System.currentTimeMillis();	//��¼������ʱ��
		System.out.println("����ʱ�䣺"+(endTime-startTime));
	}

	public abstract void code();
}
class Demo11 extends MyRuntime
{
	public static void main(String[] args) 
	{
		Demo11 d = new Demo11();
		d.getTime();
	}

	//code�����ڲ���Ҫд��������ʱ��Ĵ���
	public void code(){
		int i = 0;
		while(i<100){
			System.out.println("i = "+i);
			i++;
		}
	}
}
