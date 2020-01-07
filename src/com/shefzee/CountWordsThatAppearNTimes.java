package com.shefzee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWordsThatAppearNTimes {


    static Map<String, Integer> getCount(String[] arr){

        Map<String, Integer> maps = new HashMap<>();

        for (String a: arr){
            if(!maps.containsKey(a)){
                maps.put(a, 1);
            }else{
                maps.put(a, maps.get(a)+1);
            }
        }
        return maps;

    }

    // catch 😀
    public static void main(String[] args) {

        String[] s  = {"hate", "love", "peace", "love",
                "peace", "hate", "love", "peace",
                "love", "peace"};

        Map<String,Integer> maps = getCount(s);

        for(Map.Entry<String, Integer> map : maps.entrySet()){
            if(map.getValue() == 2){
                System.out.println(map.getKey());
            }
        }

    }
}
