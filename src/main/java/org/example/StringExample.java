package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringExample {
    public static void main(String[] args) {
      //  String first="nmkKLMO";
      //  String second="PQRTVioj";
      //  StringBuilder builder=new StringBuilder();
      //  builder.append(first);
      //  builder.append(second);
        //System.out.println(arrangeString(builder.toString()));

        reverseString("java is high level programming language");
        shiftZeroAtRight("abc0deKL0M0N");
        countCharacterFirstWay("java",'a');
        countCharacterSecondWay("java is program",'a');
        countCharacter("java is programming language java is high level language");
        findNthHighestNumber(new int[]{10,15,7,40});
        findNthLowestNumber(new int[]{10,15,7,40});
        findTheDifferenceInTwoIntegerArray(new Integer[]{1,2,3,2,1},new Integer[]{1,2,3,4});
        System.out.println("============= Count character ==================");
        countFrequencyOfCharacterInString();
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
        //abc0deKL0M0N
        StringBuilder builder=new StringBuilder();
        int j=0;
        for(char c:sentence.toCharArray()){
            if(c=='0'){
                j++;
            }else {builder.append(c);
            }

        }

        builder.append("0".repeat(j));
        System.out.println(builder);
    }
    static void countCharacterFirstWay(String sentence, char c){
    int senLength=sentence.length();
    int cntOfChar=sentence.replace(String.valueOf(c),"").length();
        System.out.println("Character count : " + cntOfChar);
        System.out.println("Total : " + senLength);
        System.out.println("Charcter count : "+ (senLength - cntOfChar));
    }
    static void countCharacterSecondWay(String sentence, char c){
    int count=0;
        for(char d:sentence.toCharArray()){
        if(d==c){
            count++;
        }
    }
        System.out.println("Count is : "+count );
    }
    static void countCharacter(String sentence){
        Map<Character,Integer> map=new HashMap<>();
    for(char c:sentence.toCharArray()){
        if(map.containsKey(c) ){
            map.put(c,map.get(c)+1);
            }
            else if(c!= ' ')
                map.put(c,1);
        }
        System.out.println(map);
    }
    static void findNthHighestNumber(int[] numbers){
        Optional<Integer> secondHighest = Arrays.stream(numbers)
                .distinct().boxed()
                .sorted(Comparator.reverseOrder()).skip(2)
                        .findFirst();
        System.out.println(secondHighest.get());

    }
    static void findNthLowestNumber(int[] numbers){
        Optional<Integer> lowest = Arrays.stream(numbers)
                .distinct().boxed()
                .sorted(Comparator.naturalOrder()).skip(1)
                .findFirst();
        System.out.println( lowest.get());
    }
    static void findTheDifferenceInTwoIntegerArray(Integer[] arr1,Integer[] arr2){
        System.out.println("================================================");
        System.out.println("Find The Difference In Two Integer Arrays");
        HashSet<Integer> set1=new HashSet<>(Arrays.asList(arr1));
        boolean isContainsAll = set1.containsAll(Arrays.asList(arr2));

        if(isContainsAll){
            System.out.println("Exist");
        }
        else
        {
            System.out.println("Not Exist");
        }


    }
    static void findTheDifferenceInTwoIntegerArray001(Integer[] arr1,Integer[] arr2){
        System.out.println("================================================");
        System.out.println("Find The Difference In Two Integer Arrays -> Second Way");
        Set<Integer> set1=new HashSet<>();
        set1=Arrays.stream(arr1).collect(Collectors.toSet());
        Set<Integer> set2=new HashSet<>();
        set1=Arrays.stream(arr2).collect(Collectors.toSet());
        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);

    }
    static void countFrequencyOfCharacterInString(){
        String str="ababcabcdef";
        int len=str.length();
        char[] chars=str.toCharArray();
        int[] count=new int[len];

        for(int i=0;i<len;i++){
            count[i]=1;

            for(int j=i+1;j<len;j++){
                if(chars[i]==chars[j]){

                    count[i]++;
                    chars[j]='0';

                }
            }
        }
        for(int k=0;k<chars.length;k++){
            if(chars[k]!='0' && chars[k]!=' ') {
                System.out.println(" Character : " + chars[k] + " and count is : " + count[k]);
            }
        }
    }
}
