package com.ksyun.whgc.chenjianghao;

import java.util.HashMap;
import java.util.Map;

public class Util {
    public static String  FlipString(String  s){
        String s1="";
        for (int i=s.length();i>0;i--){
            s1+=s.charAt(i-1);
        }

        return s1;
    }

    public static HashMap<Character,Integer>  CharSum(String  s){
        HashMap<Character,Integer> Map=new HashMap<>();
        for (char c : s.toCharArray()
        ) {
            if (Map.containsKey(c)) {
                Integer i = Map.get(c);
                Map.put(c, i + 1);
            } else {
                Map.put(c, 1);
            }
        }
        return Map;
    }


}
