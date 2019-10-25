/*

需求：打印一个九九乘法表





    */

class Demo15 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i<=9 ; i++){
			for(int j = 0 ; j<=i ; j++){
				System.out.print(i+"*"+j"="+i*j+"  15");
			}
			//换行
		System.out.println();
		}
		
	}
}
