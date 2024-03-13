package org.example;

public class TypeCasteExample {
    public static void main(String[] args) {
        String s= new String("Raj");
        //StringBuffer sb= (StringBuffer)s;
        StringBuffer sb=new StringBuffer("Raj");
        String s1= sb.toString();
        int a=10;
        long j=a;
        long x=100;
        a=(int)x;
    }
}
