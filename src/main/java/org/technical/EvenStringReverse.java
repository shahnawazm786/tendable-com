package org.technical;

import java.util.Arrays;

public class EvenStringReverse {
    public static void main(String[] args) {
    Capital();
    }
    static void even(){
        String name="my name is shahnawaz";
        String[] words=name.split(" ");
        StringBuffer buffer;
        for(int i=0; i<words.length;i++){

            if(i%2==1){
                buffer=new StringBuffer();
                buffer.append(words[i]);
                buffer.reverse();
                System.out.print(buffer.toString()+" ");
            }
            else
            {
                System.out.print(words[i]+" ");
            }
        }

    }
    static void Capital(){
        String str1="heLLo";
        String str2="GUIpyU";
        String str3=str1+str2;
        char[] array= str3.toCharArray();
        int len=array.length;
        char[] array1=new char[len];

        System.out.println(array);
        int j=0;
        for(int i=0;i<len;i++) {
            if (array[i] >= 'a' & array[i] < 'z') {
                array1[j] = array[i];
                j++;
            }
        }

            for(int i=0;i<len;i++){
            if(array[i]>='A' & array[i]<'Z'){
                array1[j]=array[i];
                j++;
            }

        }


        System.out.println(array1);

    }
}
