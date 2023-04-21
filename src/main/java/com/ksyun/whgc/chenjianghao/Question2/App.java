package com.ksyun.whgc.chenjianghao.Question2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("张三", 20, "武汉", LocalDate.of(2002, 3, 27)),
                new Student("李四", 18, "襄阳", LocalDate.of(2004, 4, 21)),
                new Student("王五", 25, "北京", LocalDate.of(2001, 6, 24))
        );
        StudentsUtil.print(students);

    }
}
