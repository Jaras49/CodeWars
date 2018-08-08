package com.java.convertstringtocamelcase;

class Solution{

    static String toCamelCase(String s){
        String[] ss = s.split("-|_");
        String result = "";
        int coutn = 0;
        for(String i:ss){
            if(coutn > 0){
                result = result +i.substring(0,1).toUpperCase()+i.substring(1, i.length());
            }
            else
                result = result + i;
            coutn++;
        }
        return result;
    }
}