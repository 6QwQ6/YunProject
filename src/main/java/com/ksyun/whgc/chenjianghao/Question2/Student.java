package com.ksyun.whgc.chenjianghao.Question2;

import java.time.LocalDate;
import java.util.Date;

public class Student {

@StudentProperty("姓名")
    private String Name;
    @StudentProperty("年龄")
    private int Age;
    @StudentProperty("地址")
    private String Address;
    @StudentProperty("出生日期")
    private LocalDate Birth;

    public Student(String name, int age, String address, LocalDate birth) {
        Name = name;
        Age = age;
        Address = address;
        Birth = birth;
    }
}
