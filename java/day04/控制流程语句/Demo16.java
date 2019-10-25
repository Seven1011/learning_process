/*
	 转义字符：特殊字符使用"\"把其转化成字符的本身输出，南无使用"\"的字符称作为转义字符



	 需求：在控制台上打印一个 hello" world



	
	常见的转义字符有哪些：
 	\b	Backspace （退格键）
	\t	Tab    制表符(制表符的作用就是为了让一列对齐)  一个tab一般等于四个空格。
	
	\n	换行
	\r	回车  把光标移动到一行的首位置上。
	

注意：如果实在windows系统上操作文件的时候需要换行，是需要\r\n一起使用
	  如果实在其他操作系统上需要换行，仅需要\n即可。


   */
class  Demo16
{
	public static void main(String[] args) 
	{
		System.out.println("Hello\" World!");
	}
}
