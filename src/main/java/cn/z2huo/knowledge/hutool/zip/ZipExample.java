package cn.z2huo.knowledge.hutool.zip;

import cn.hutool.core.util.ZipUtil;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipOutputStream;

public class ZipExample {
    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("D:\\Desktop\\vibdata.xlsx");
             InputStream inputStream2 = new FileInputStream("D:\\Desktop\\vibdata_处理后.xlsx");
             ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("D:\\Desktop\\ZIP.zip"))) {

            ZipUtil.zip(zipOutputStream, new String[]{"vibdata_1.xlsx", "vibdata_2.xlsx"},
                    new InputStream[]{inputStream, inputStream2});

        } catch (Exception e) {

        }

    }
}
