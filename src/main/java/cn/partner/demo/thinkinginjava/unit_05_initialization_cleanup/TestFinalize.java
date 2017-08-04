package cn.partner.demo.thinkinginjava.unit_05_initialization_cleanup;
/**
 * Created by Yonsin on 17/8/4.
 */
public class TestFinalize {
    private String name;

    public TestFinalize(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Start");
        TestFinalize t1 = new TestFinalize("t1");
        System.gc();
        new TestFinalize("t2");
        System.gc();
        System.out.println("End");

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("exec finalize() of object named " + name);
        super.finalize();
    }
}
