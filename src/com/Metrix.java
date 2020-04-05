package com;

public class Metrix {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int i,j,k,l;
         l= k = arr[0].length;
        int count =0;
        for(i=0; i<arr[0].length; i++){
            count++;
            for(j=0; j<arr[0].length; j++){
                arr[i][j] = arr[l][k];
                l--;
                k--;
            }
            System.out.print(arr[i][j]+" ");
            if(count == 3){
                count = 0;
                System.out.println();
            }
        }
    }
}
