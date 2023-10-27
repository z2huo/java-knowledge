package cn.z2huo.knowledge.computerbottom.sum;

/**
 * i++ and ++i
 */
class IntSumTest {
    public static void main(String[] args) {
        int i = 1;
        int j = 10;

        i++;
        j++;

        System.out.println(i);
        System.out.println(j);
        System.out.println(i++);
        System.out.println(j++);
        System.out.println(i);
        System.out.println(j);

        int m = 20;
        Sum sum = new Sum();
        sum.setI(m++);
        System.out.println(sum);
        System.out.println(m);

        int n = 30;
        Sum sum2 = new Sum();
        sum2.setI(++n);
        System.out.println(sum2);
        System.out.println(n);
    }
}
