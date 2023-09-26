package cn.z2huo.knowledge.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * 作者： 张一卓
 * 时间： 2020/1/19 10:18
 */
public class Demo {
    public static void main(String[] args) {
        String password = "123456789";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(password.getBytes("utf-8"));
            String string = byte2Hex(messageDigest.digest());
            System.out.println(string);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static String byte2Hex(byte[] bytes) {
        System.out.println(Arrays.toString(bytes) + " " + bytes.length);
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0xFF);

            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}
