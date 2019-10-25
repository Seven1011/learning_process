/*
在现实生活中事物与事物之间是存在关系的。

		球员--->球队  整体与部分  has a 关系

		学生--->人     继承的关系	is  a关系 
	*/
//球员类
class Player
{
	int num;
	String name;
	public Player(int num,String name){
		this.num = num;
		this.name = name;
	}
	public void run(){
			System.out.println(name+"开跑..");
	}
}

//球队类
class Team
{
	String name; //球队的名字
	Player p1;
	Player p2;
	Player p3;

	public Team(String name,Player p1,Player p2,Player p3){
		this.name = name;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	//开始比赛
	public void startGame(){
			System.out.println(name+"开赛啦..");
	}

}
class Demo6
{
	public static void main(String[] args) 
	{
		Player p1 = new Player(12,"梅西");
		Player p2 = new Player(7,"c罗");
		Player p3 = new Player(11,"内马尔");
		//球队
		Team t = new Team("恒大",p1,p2,p3);
		t.startGame();

		System.out.println("名字:"+t.p2.name);
	}
}
