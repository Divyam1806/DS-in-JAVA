//Q2. Find the max value of all the elements in the array

import java.util.*;
public class arrayQ2{

    public static int maximum(int l, int a[]){
        int max = a[0];
        for(int i=1;i<l;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array :");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Maximum value in the array is " + maximum(n,arr));
    }
}