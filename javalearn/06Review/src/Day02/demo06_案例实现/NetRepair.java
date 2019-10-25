package Day02.demo06_案例实现;

public class NetRepair extends Repair {
    @Override
    public void work() {
        System.out.println("工号为" + id + "的工作人员：" + name + "正在修理网线.....");
    }
}
