/*
      今日内容：
             1、Junit单元测试
             2、反射
             3、注解


         ***Junit单元测试：
                *测试分类
                    1、黑盒测试
                    2、白盒测试

    * Junit使用：白盒测试
		* 步骤：
			1. 定义一个测试类(测试用例)
				* 建议：
					* 测试类名：被测试的类名Test		CalculatorTest
					* 包名：xxx.xxx.xx.test		cn.itcast.test

			2. 定义测试方法：可以独立运行
				* 建议：
					* 方法名：test测试的方法名		testAdd()
					* 返回值：void
					* 参数列表：空参

			3. 给方法加@Test
			4. 导入junit依赖环境

		* 判定结果：
			* 红色：失败
			* 绿色：成功
			* 一般我们会使用断言操作来处理结果
				* Assert.assertEquals(期望的结果,运算的结果);

		* 补充：
			* @Before:
				* 修饰的方法会在测试方法之前被自动执行
			* @After:
				* 修饰的方法会在测试方法执行之后自动被执行


*/

public class Notes {
    public static void main(String[] args) {

    }
}
