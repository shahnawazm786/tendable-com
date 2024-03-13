package org.example;

public class FactorialNumber {
    public static void main(String[] args) {
        strongNumberFind(145);
    }
    // factorial
    static void strongNumberFind(int number){
        int num=0;
        int n=number;
        int strongNumber=0;
        int fact=1;
        while(number>0){
            num=number%10;
            for(int i=1;i<num;i++){
                //3 - 1*2*3
                //1*1 = 1
                // 1*2*3*4 = 24
                // 1*2*3*4 *5 = 120
                fact=fact*i;
            }
            number=number/10;
            System.out.println(num);
            System.out.println(fact);
            System.out.println(strongNumber);
            strongNumber=strongNumber+fact;

        }
        System.out.println(strongNumber);
        if(n==strongNumber){
            System.out.println(n + " is strong number");
        }
        else
        {
            System.out.println(n + " is not strong number");
        }
    }
}
