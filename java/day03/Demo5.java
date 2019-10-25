/*
  自减： 操作数-1

  前自减：位于操作数之前
   先自减，后使用


   后自减：位于操作数之后
    先使用，后自减







   */


class Demo5 
{
	public static void main(String[] args) 
	{
          int i-1;
		 // int sum=--i;//前自减 i=i-1， sun=i
           int sum=i--;//后自减  sum=i;i=i-1;
			System.out.println("sum="+sum);
	}
}
