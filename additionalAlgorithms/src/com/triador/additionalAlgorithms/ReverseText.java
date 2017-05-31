package com.triador.additionalAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by antonandreev on 23/04/2017.
 */
public class ReverseText {

    //реверсирование строки во всех скобках, включая внутренние
/*    public String reverseTextInvolveBrackets(String s) {
        int bracketsCount = 0;
        List<Integer> indexArray = new ArrayList<>();
        char[] str = s.toCharArray();
        int length = str.length;
        for (int i = 0; i < length; i++) {
            boolean stop = false;
            if (str[i] == '(') {
                bracketsCount++;
                int j = i + 1;
                while (str[j] != '(' && str[j] != ')') {
                    indexArray.add(j);
                    j++;
                }
                if (str[j] == '(') bracketsCount++;
                if (str[j] == ')') {
                    stop = true;
                    bracketsCount--;
                    i = j++;
                }
                while (bracketsCount != 0) {
                    j++;
                    if (str[j] == '(') bracketsCount++;
                    if (str[j] == ')') bracketsCount--;
                }
                j--;
                while (str[j] != ')' && !stop) {
                    indexArray.add(j);
                    j--;
                }
                Collections.sort(indexArray);
                int size = indexArray.size();
                for (int v = 0; v < size / 2; v++) {
                    char temp = str[indexArray.get(v)];
                    str[indexArray.get(v)] = str[indexArray.get(size - v - 1)];
                    str[indexArray.get(size - v - 1)] = temp;
                }
                indexArray.clear();
            }
        }
        return String.valueOf(str).replace("(", "").replace(")", "");
    }*/

    String reverseParentheses(String s) {
        int pos = 0;
        for(int i = pos; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                pos = i;
            else if(s.charAt(i) == ')') {
                String reverse = s.substring(pos + 1, i);
                reverse = new StringBuffer(reverse).reverse().toString();
                s = s.substring(0, pos) + reverse + s.substring(i + 1, s.length());
                i = -1;
            }
        }
        return s;
    }
}
