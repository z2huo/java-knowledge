package cn.z2huo.knowledge.concurrency.section_21_2.join;

class Joining {
    public static void main(String[] args) {
//        Sleeper sleepy = new Sleeper("Sleepy", 5000);
//        Joiner dopey = new Joiner("Dopey", sleepy);

        Sleeper grumpy = new Sleeper("Grumpy", 5000);
        Joiner doc = new Joiner("Doc", grumpy);
        grumpy.interrupt();
    }
}
