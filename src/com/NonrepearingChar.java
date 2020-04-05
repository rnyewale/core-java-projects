package com;

import java.util.Scanner;

public class NonrepearingChar {
    int count = 0 ;
    public int charCount(String str, char ch){
        count =0;
        for(int i=0; i< str.length(); i++){
            if(ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public void countOfEachChar(String str){
        char ch=0;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            System.out.println(ch+" count: "+charCount(str, ch));
            str.replace(ch, ' ');
        }
    }
    public void firstNonRepeatingChar(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("First Non Repeating char from Given String: '"+str+"' is: "+str.charAt(i));
                break;
            }
            if(i == str.length()-1 ){
                System.out.println("Every character is repeated..!!");
            }
            count = 0;
        }
    }

    public static void main(String[] args) {
        NonrepearingChar nonrepearingChar = new NonrepearingChar();

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.next();

        nonrepearingChar.firstNonRepeatingChar(str);
        System.out.println("Count of Each char: ");
        nonrepearingChar.countOfEachChar(str);
    }
}
