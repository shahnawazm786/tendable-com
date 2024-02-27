package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StringExample {
    public static void main(String[] args) {
        String first="nmkKLMO";
        String second="PQRTVioj";
        StringBuilder builder=new StringBuilder();
        builder.append(first);
        builder.append(second);
        //System.out.println(arrangeString(builder.toString()));

        reverseString("java is high level programming language");
    }
    static String arrangeString(String name){
        StringBuffer buffer=new StringBuffer();
        for (char c:name.toCharArray()) {
            if(c>='A' & c<='Z'){
                buffer.append(c);
            }
        }
        for (char c:name.toCharArray()) {
            if(c>='a' & c<='z'){
                buffer.append(c);
            }
        }
        return buffer.toString();
    }
    public static void reverseString(String sentence){
        StringBuilder rev=new StringBuilder();
        int j=0;
        for(Object word : Arrays.stream(sentence.split(" ")).toArray())
        {
            if(j%2==1){
                for(int k=word.toString().length()-1;k>=0;k--){
                    rev.append(word.toString().charAt(k));
                }
            }
            else {
                rev.append(word);
            }
            j++;
            rev.append(" ");
        }
        System.out.println(rev);
    }
    static void shiftZeroAtRight(String sentence){

    }

}
