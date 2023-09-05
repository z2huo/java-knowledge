package cn.z2huo.java.knowledge.loopAndBranch;

/**
 * @author 张一卓
 * @date 2020/4/2 20:06
 **/
public class SwitchDemo {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,2};
        for (int i=0; i<array.length; i++){
            switch (i){
                case 0:
                    System.out.println("0 hhh");
                    break;
                case 1:
                case 2:
                case 3:
                    System.out.println("1/2/3 hahah");
            }
        }
    }
}
