package com.ksyun.whgc.chenjianghao;

import java.util.HashMap;
import java.util.Iterator;
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

    public static  Map<Character,Integer> MaxChar(String  s){
        Map<Character,Integer> Map =new HashMap<>();
        Character Max=' ';
        int max=0;
        Map=CharSum(s);
        Iterator<Map.Entry<Character,Integer>> it=Map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Character,Integer> entry=it.next();
            if(entry.getValue()>max){
                max= entry.getValue();
                Max= entry.getKey();
            }
        }
        Map.clear();
        Map.put(Max,max);


        return Map;
    }


}
