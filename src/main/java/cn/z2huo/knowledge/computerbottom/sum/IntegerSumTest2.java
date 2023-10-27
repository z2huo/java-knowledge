package cn.z2huo.knowledge.computerbottom.sum;

public class IntegerSumTest2 {
    public static void main(String[] args) {
        Integer i = 1000;
        Integer j = 10000;

        i++;
        j++;

        System.out.println(i);
        System.out.println(j);
        System.out.println(i++);
        System.out.println(j++);
        System.out.println(i);
        System.out.println(j);

        Integer m = 20000;
        Sum sum = new Sum();
        sum.setI(m++);
        System.out.println(sum);
        System.out.println(m);

        Integer n = 30000;
        Sum sum2 = new Sum();
        sum2.setI(++n);
        System.out.println(sum2);
        System.out.println(n);
    }
}
