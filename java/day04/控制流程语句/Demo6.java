/*

需求：计算1+2+3+...+100的总和。






  */
class Demo6 
{
	public static void main(String[] args) 
	{
		int num = 1;
		int sum = 0;
		while(num<=100){
			sum = sum+num;//sum = 1
			num++;
		}
		System.out.println("sum = "+sum);
	}
}
