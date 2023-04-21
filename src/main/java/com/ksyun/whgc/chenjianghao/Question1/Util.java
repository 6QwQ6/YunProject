package com.ksyun.whgc.chenjianghao.Question1;

import java.util.*;

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
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Map.put(c,Map.getOrDefault(c,0)+1);
        }
//        for (char c : s.toCharArray()
//        ) {
//            if (Map.containsKey(c)) {
//                Integer i = Map.get(c);
//                Map.put(c, i + 1);
//            } else {
//                Map.put(c, 1);
//            }
//        }
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

    public static String NoRepeat(String s){
        //滑动窗口
        if (s == null || s.length() == 0) {
            return null;
        }
        int start = 0;//滑动窗口的开始值
        int maxlen = 0;
        int len = 0;
        int startMaxIndex = 0;//最长子串的开始值
        Map<Character, Integer> map = new HashMap<>();//存储窗口内字符跟位置
        int i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer value = map.get(ch);
            if (map.containsKey(ch)) {
                start = value + 1;
                len = 0;
                map.clear();
                i=value;
            } else {
                map.put(ch, i);
                len++;
                if (len > maxlen) {
                    maxlen = len;
                    startMaxIndex = start;
                }
            }
        }
        return s.substring(startMaxIndex, (startMaxIndex + maxlen));
    }


}
