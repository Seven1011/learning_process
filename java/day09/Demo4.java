/*

��������һ��ͼ�Ρ�Բ�Ρ����������ࡣ��������ͼ��	����߱�����������ܳ�����Ϊ��ֻ��������ͼ�εļ��㷽ʽ��һ�¶��ѡ�	

���������淶��ȫ����ĸ��д�������뵥��֮��ʹ���»��߷ָ�

abstract������һ�¹ؼ��ֹ�ͬ����һ��������
		1��abstract������private��ͬ����һ��������
		2��abstract������static��ͬ����һ��������
		3��abstract������final��ͬ����һ��������

	*/

//abstract  ����

//ͼ����
abstract class MyShape{

	String name;

	public MyShape(String name){
		this.name = name;
	}

  public abstract void getArea();

  public abstract void getLength();

}

//Բ�� ��ͼ�ε�һ��
class Circle extends MyShape{
	double r;

	public static final double PI = 3.14;

	public Circle(String name, double r){
		super(name);
		this.r = r;
	}
	public void getArea(){
		System.out.println("Բ�ε�����ǣ�"+PI*r*r);
	}

	public void getLength(){
		System.out.println("Բ�ε��ܳ��ǣ�"+2*PI*r);
	}
  }


//������ͼ�ε�һ��
class Rect extends MyShape
{
	int wide;
	int height;

	public Rect(String name, int wide , int height){
		super(name);
		this.wide = wide;
		this.height = height;
	}
	public void getArea(){
		System.out.println("���ε�����ǣ�"+wide*height);
	}

	public void getLength(){
		System.out.println("���ε��ܳ��ǣ�"+2*(wide+height));
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle("Բ��",4.0);
		c.getArea();
		c.getLength();

		Rect r = new Rect("����",7,9);
		r.getArea();
		r.getLength();
	}
}
