package cn.z2huo.java.knowledge.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaSystemIn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
    }
}