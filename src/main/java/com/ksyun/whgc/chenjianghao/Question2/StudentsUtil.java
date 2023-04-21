package com.ksyun.whgc.chenjianghao.Question2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class StudentsUtil {
    public static void print(List<Student> std) {
        Class<?> clazz = std.get(0).getClass();

        // 打印属性名
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(StudentProperty.class)) {
                System.out.print("    "+field.getAnnotation(StudentProperty.class).value());
            }
        }

        System.out.println();
        // 打印数据
        for (Student item : std) {
            System.out.print("    ");
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(StudentProperty.class)) {
                    try {
                        field.setAccessible(true);
                        Object value = field.get(item);
                        System.out.print((value == null ? "" : value.toString()) + "    ");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println();
        }
    }


    //输出到文件
     private static void writeFile(String str) {
        File writefile;
        boolean append = true;
        String path = "../student.txt";
        writefile = new File(path);
        if (writefile.exists() == false)   // 判断文件是否存在，不存在则生成
        {
            try {
                writefile.createNewFile();
                writefile = new File(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {        // 存在先删除，再创建
            writefile.delete();
            try {
                writefile.createNewFile();
                writefile = new File(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fw = new FileWriter(writefile, append);

            fw.write(str);
            fw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
