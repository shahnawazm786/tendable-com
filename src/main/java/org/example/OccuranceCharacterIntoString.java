package org.example;

public class OccuranceCharacterIntoString {
    public static void main(String[] args) {
        String str="Mohammad Shahnawaz";

        int len=str.length();
        int cnt=1;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    cnt++;
                }
            }
            System.out.println(str.charAt(i) + "Occured : " + cnt);
            cnt=1;
        }
    }
}
