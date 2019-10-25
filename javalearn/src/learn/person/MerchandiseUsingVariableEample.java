package learn.person;

public class MerchandiseUsingVariableEample {
    public static void main(String[] args) {

        //用四个变量描述商品1
        String m1Name = "茉莉花茶包20包";
        String m1Id = "000099518";
        int m1Count = 1000;
        double m1prise = 99.9;

        //在用四个变量描述商品2
        String m2Name = "可口可乐330ml";
        String m2Id = "000099519";
        int m2Count = 1000;
        double m2prise = 3.0;

        //卖出一个商品1
        int m1ToSold = 1;
        System.out.println("感谢购买" + m1ToSold + "个" + m1Name + "。商品单价为" +
                m1prise + ".消费总价为 " + m1prise * m1ToSold + "。");
        m1Count -= m1ToSold;
        System.out.println(m1Id + "剩余库存数量为" + m1Count);

        //卖出三个商品1
        int m2ToSold = 3;
        System.out.println("感谢购买" + m2ToSold + "个" + m2Name + "。商品单价为" +
                m2prise + ".消费总价为 " + m2prise * m2ToSold + "。");
        m2Count -= m2ToSold;
        System.out.println(m2Id + "剩余库存数量为" + m2Count);
    }
}
