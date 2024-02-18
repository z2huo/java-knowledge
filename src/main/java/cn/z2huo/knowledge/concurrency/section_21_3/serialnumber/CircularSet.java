package cn.z2huo.knowledge.concurrency.section_21_3.serialnumber;

class CircularSet {

    private int[] array;

    private int length;

    private int index = 0;

    public CircularSet(int size) {
        array = new int[size];
        length = size;
        for (int i = 0; i < size; i++) {
            array[i] = -1;
        }
    }

    public synchronized void add(int i) {
        array[index] = i;
        index = ++index % length;
    }

    public synchronized boolean contains(int value) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

}
