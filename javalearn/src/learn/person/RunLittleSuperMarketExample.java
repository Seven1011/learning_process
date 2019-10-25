package learn.person;

import learn.person.supermarket.LittleSuperMarket;
import learn.person.supermarket.Merchandise;

import java.util.Scanner;

/**
 * 对这个类的说明
 *
 * @author
 * @since
 */
public class RunLittleSuperMarketExample {
    public static void main(String[] args) {

        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道666号";
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        Merchandise[] all = littleSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("今日超市大优惠，所有商品第二件半价！选择要购买的商品索引：");
            int index = scanner.nextInt();
            if (index < 0) {
                break;
            }

            if (index >= all.length) {
                System.out.println("商品索引超出界限");
                continue;
            }

            Merchandise m = all[index];
            System.out.println("商品" + m.name + "售价为：" + m.soldPrice + "请问购买几件？");
            int numToBuy = scanner.nextInt();

            if (numToBuy > m.count) {
                System.out.println("库存不足！");
                continue;
            }

            int fullPriseCount = numToBuy / 2 + numToBuy % 2;
            int halfPrise = numToBuy - fullPriseCount;

            double totalCost = fullPriseCount * m.soldPrice + (halfPrise * m.soldPrice / 2);

            m.count -= numToBuy;

            System.out.println("选购的商品总价为：" + totalCost);

        }
    }

}