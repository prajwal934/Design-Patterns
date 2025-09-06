package com.praj.solidp;

public class Summations {
    public static void main(String[] args) {
        int[] arry = {1,2,3,5,0,2,3,4,1};
        int target = 5;

        int n = arry.length;

        for(int i=0;i<n;i++) {
            int sum =0;
            for(int j=i;j <n;j++) {
                sum +=  arry[j];
                if(sum == target){
                    System.out.println("Subaarry is: ");
                    for(int k = i ; k <= j;k++) {
                        System.out.print(arry[k] + " ");
                    }
                    System.out.println();
                }
            }
        }



    }


}
