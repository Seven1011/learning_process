/*
�����������֮----switch�ж����

switch ���ĸ�ʽ
  
    switch�����ѡ��{
		case ֵ1��
		    ����ֵ1ִ�еĴ���
		     break;
		case ֵ2��
		    ����ֵ2ִ�еĴ���
             break;
		.....
		default:
		    ���ѡ�񶼲���������ѡ��ʱִ�еĴ���;
         break;
        }
switch���Ҫע������
1��switch���ʹ�õı���ֻ����byte��char��short��int��String�������ͣ�String���������Ǵ�jdk 7.0 ��ʱ��ʼʹ�õ�
2��case����������ݱ�����һ��������
3��switch����ֹͣ������
   switch����Ե�ƥ���������е�һ��case����ô�ͻ�ִ�ж�Ӧ��case��ִ����Ϻ����û������break�ؼ��ֻ��߽���switch�Ĵ����ţ���ôswitch��䲻�����жϣ�����
   ���մ���������µ�˳��ִ�����еĴ��롣ֱ������break�����ǽ���switch���Ĵ�����Ϊֹ��
4����switch����У���Զ���ǻ����ж�case��䣬��û�з��ϵ�ѡ���ǲŻ�����default


if---else if---else if�����switch ���ǳ����ƣ�

  



�ж�������Щ���Ǽ�������ԣ� D��

   A Java    B C#  C javascript  D android


   */

class  Demo2
{
	public static void main(String[] args) 
	{
		int option= 4; //����һ�������洢���ѡ��
		switch (option){
		case 1:
		  System.out.println("java");
		break;
        case 2:
		  System.out.println("C#");
		break;
		case 3:
		  System.out.println("javascript");
		break;
		case 4:
		  System.out.println("android");
		break;
		default:
           System.out.println("���ѡ������");
		break;
		}
		
	}
}
