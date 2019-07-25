package top.xiaolikey.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P205 {

    static class Solution {
/*        public boolean isIsomorphic(String s, String t) {
            if (s == null || t == null || s.length() != t.length()) return false;
            Map<Character, Character> sMap = new HashMap<>();
            Map<Character, Character> tMap = new HashMap<>();
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            for (int i = 0; i < s1.length; i++) {
                Character ch = sMap.get(s1[i]);
                if (ch == null) {
                    ch = tMap.get(t1[i]);
                    if (ch == null) {
                        sMap.put(s1[i], t1[i]);
                        tMap.put(t1[i], s1[i]);
                    } else {
                        if (s1[i] != ch.charValue()) {
                            return false;
                        }
                    }
                } else {
                    if (t1[i] != ch.charValue()) {
                        return false;
                    }
                }
            }
            return true;
        }*/


        public boolean isIsomorphic(String s, String t) {
            if( s == null || t == null || s.length() != t.length()) return false;
            int[] sMap = new int[256];
            int[] tMap = new int[256];
            for(int i=0 ;i<s.length();i++){
                if(sMap[s.charAt(i)] == 0){
                    if(tMap[t.charAt(i)] == 0){
                        sMap[s.charAt(i)] = t.charAt(i);
                        tMap[t.charAt(i)] = s.charAt(i);
                    }else{
                        if(tMap[t.charAt(i)] != s.charAt(i)){
                            return false;
                        }
                    }
                }else{
                    if(sMap[s.charAt(i)] != t.charAt(i)){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static String stringToString(String input) {
//        return JsonArray.readFrom("[" + input + "]").get(0).asString();
        return input.replace("\"", "");
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            line = in.readLine();
            String t = stringToString(line);

            boolean ret = new Solution().isIsomorphic(s, t);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}
