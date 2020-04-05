package com;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str1 = "india";
        System.out.println("The given string is: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in String is: " + str1.charAt(i));
                break;
            }
        }
    }

   /*public int countOfChar(String str, char ch){
       int count = 0;
       for (int i= 0; i<str.length(); i++){
           if(ch == str.charAt(i)){
               count ++;
           }
       }
       return  count;
   }

   public void firstNonRepeatingChar(String str){
       int count = 0;
       for(int i=0; i<str.length(); i++){
           count = countOfChar(str, str.charAt(i));
           str.replace(str.charAt(i), ' ');
           System.out.println(str.charAt(i)+" : "+count);
       }
   }
    public static void main(String[] args) {
        FirstNonRepeatingChar nonRepeatingChar = new FirstNonRepeatingChar();
        nonRepeatingChar.firstNonRepeatingChar("Maharashtra");
    }*/
}
