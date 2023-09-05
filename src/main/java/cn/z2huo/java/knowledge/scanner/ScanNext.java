package cn.z2huo.java.knowledge.scanner;

import java.util.Scanner;

public class ScanNext {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] demo = new int[5];
        for (int i = 0; i < 5; i++) {
            demo[i] = sc.nextInt();
        }

        System.out.println(sc.nextLine());

        for (int i = 0; i < 5; i++) {
            System.out.print(demo[i] + " ");
        }
        sc.close();
    }
}
