package com.dsalgo.logics;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

    public String findLongestSubString(String text) {
        int textLength = text.length();
        char[] textArr = text.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        List subStrings = new ArrayList<String>();
        for (int i = 0; i < textLength; i++) {
            if (stringBuilder.indexOf(String.valueOf(textArr[i])) == -1) {
                stringBuilder.append(textArr[i]);
            } else {
                subStrings.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
        System.out.println(subStrings.toString());

        return null;
    }
}
