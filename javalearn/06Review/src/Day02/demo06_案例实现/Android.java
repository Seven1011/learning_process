package Day02.demo06_案例实现;
/*
    Android开发工程师，继承研发部员工类



*/

public class Android extends Developer {
    @Override
    public void work() {
        System.out.println("工号为" + id + "的工作人员：" + name + "正在开发淘宝app.....");
    }
}
