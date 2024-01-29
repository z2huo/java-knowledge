package cn.z2huo.knowledge.concurrency.section_21_3;

class EvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    @Override
    public int next() {
        currentEvenValue++;
        currentEvenValue++;
//        currentEvenValue += 2;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
