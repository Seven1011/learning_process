/*
Ŀǰ���ڵ����⣺
	1���޷����������������֮��ļ̳й�ϵ
	2�������ظ��Ĵ���

�����������������
	1����װ
	2���̳�
	3����̬

�̳У�������ͨ���ؼ���extends���ֵ�

�̳еĸ�ʽ��

		class ����1 extends ����2{
		
		}


�̳�Ҫע������
	1��ǧ��ҪΪ�˼����ظ������ȥ�̳У�ֻ���������ڼ̳й�ϵ��ʱ����ȥ�̳С�
	2������˽�еĳ�Ա���ܱ��̳С�
	3������Ĺ��췽�����ܱ��̳С�
	4�������������ʱĬ�ϻ��ȵ��ø����޲εĹ��캯����




	*/
//����
class Person{
	String name;

	private int age;

	public Person(String name){
			this.name = name;
	}

	public Person(){
		System.out.println("Person��Ĺ��췽����������...");
	}
	public void eat(){
		System.out.println(name+"�ڳԷ�...");
	}
}

//ѧ����
class Student extends Person{
	int num; //ѧ��

	public Student(){
		System.out.println("Student��Ĺ��췽����������...");
	}

	public void study(){
		System.out.println(name+"good good study , day day up!!!");		
	}
}
class  Demo7
{
	public static void main(String[] args) 
	{
		Student s = new Student();

		/*
		s.name = "����";
		System.out.println("���֣�"+s.name);
		s.eat();
		*/
	}
}