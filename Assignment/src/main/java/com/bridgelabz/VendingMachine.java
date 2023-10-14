package com.bridgelabz;





public class VendingMachine {
    public int[] vendingMachine(int target) {
        int[] arr = {1, 2, 5, 10, 50, 100, 500, 1000};
       // int target = 173;
        int sum = 0;
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int count = 0;
            while (arr[i] <= target) {
                res[i] = arr[i];
                target = target - arr[i];
                sum++;
                count++;
            }
            // System.out.println("No of notes of "+arr[i]+"  :"+count);
        }
        // System.out.println("Total No of notes "+sum);
        return res;
    }
}