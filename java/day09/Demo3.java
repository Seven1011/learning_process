/*
Ŀǰ���ڵ����⣺
		1���������run���������Ĳ���ȷ
		2��û��ǿ��Ҫ����һ��Ҫ��дrun����

�������������������һ�������ʱ�򣬷�����������ȷʵ����ĳ����Ϊ������
������ΪĿǰ�ǲ�����ģ���ô���ǿ��Գ�ȡ������Ϊ�����������ǲ�ȥʵ�ָ�����Ϊ��
��ʱ��������Ϊ�����ǳ���Ϊ�������Ϊ�����Ǿ���Ҫʹ�ó����ࡣ

������ĺô���ǿ��Ҫ������һ��Ҫʵ��ָ���ķ���

������Ҫע���ϸ�ڣ�
		1�����һ������û�з����壬��ô�ú�������Ҫʹ��abstract���Σ��Ѹú������γɳ���ĺ�������
		2�����һ��������˳���ĺ�������ô����Ҳ����ʹ��abstra����
		3�����һ���ǳ�����̳��˳����࣬��ô����Ҫ�ѳ���������г��󷽷�ȫ��ʵ��
		4����������Դ��ڷǳ���ķ�����Ҳ���Դ��ڳ���ķ�����
		5����������Բ����ڳ���ķ�����
		6���������ǲ��ܴ�������ġ�
		7���������Ǵ��ڹ��캯���ģ��乹�캯�����ṩ�����ഴ�������ʱ���ʼ����������Եġ�


	���ʣ�������Ϊʲô���ܴ��������أ�
		  ��Ϊ�������Ǵ��ڳ��󷽷��ģ�������������ڴ�������Ļ�����ôʹ�ó���Ķ�����ó���ķ�����û��
		  �κ�����ġ�


	*/

//������
abstract class Animal
{
	String name;

	String color;
	
	public Animal(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	public abstract void run();
		
}
class Dog extends Animal
	{
		public Dog(String name,String color){
			super(name,color);
		}

		public void run(){
			System.out.println(name+"�������ܵĺܿ죡��");
		}
	}

class Fish extends Animal{

		public Fish(String name,String color){
			super(name,color);
		}

		public void run(){
			System.out.println(name+"�ڶ�β���ΰ��Σ���");
		}
	}

class Demo3 
{
	public static void main(String[] args) 
	{
		/*
		Dog d = new Dog("����Ȯ","��ɫ");
		d.run();

		//����һ�������
		Fish f = new Fish("����","���ɫ");
		f.run();
		*/
		Animal a = new Animal();   //����  ������޷�ʵ����
	}
}
