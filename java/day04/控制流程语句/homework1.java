import java.util.*;
class  homework1
{
	public static void main(String[] args) 
	{
		//����һ�����������
		Random random = new Random();
		//��������������nextInt����������һ�������
		int randomNum = random.nextInt(10)+1;//����1-10֮��������
	    Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while(flag){
		System.out.println("��������µ����֣�");
	    int guessNum=scanner.nextInt();
		if(guessNum>randomNum){
            System.out.println("�´���..");
		}else if(guessNum<randomNum){
	        System.out.println("��С��..");
		}else{
         	System.out.println("��ϲ�㣬�¶��ˣ�");
			flag = false;
		 }
		}
	}
}