package com.ksyun.whgc.chenjianghao;

public class Util {
    public static String  FlipString(String  s){
        String s1="";
        for (int i=s.length();i>0;i--){
            s1+=s.charAt(i-1);
        }

        return s1;
    }
}
