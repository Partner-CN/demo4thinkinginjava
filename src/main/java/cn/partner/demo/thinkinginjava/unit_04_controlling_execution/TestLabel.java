package cn.partner.demo.thinkinginjava.unit_04_controlling_execution;

/**
 * Created by Yonsin on 17/8/4.
 */
public class TestLabel {

    public static void main(String[] args) {
        int k = 0;
        label1:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("" + i + j);
                if (i == 1) {
                    break label1;
                }
            }
        }
    }
}
