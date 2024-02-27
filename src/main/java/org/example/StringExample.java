package org.example;

public class StringExample {
    public static void main(String[] args) {
        String first="nmkKLMO";
        String second="PQRTVioj";
        StringBuilder builder=new StringBuilder();
        builder.append(first);
        builder.append(second);
        System.out.println(arrangeString(builder.toString()));
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
}
