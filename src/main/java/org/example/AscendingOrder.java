package org.example;

public class AscendingOrder{
    public static void main(String[] args){
        int[] num= {10, 20, 50, 30, 40};
        int temp=num[0];
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]) // 1
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }

}
