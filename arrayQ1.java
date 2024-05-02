// Q1. Sum of all elements in the array

import java.util.*;
public class arrayQ1 {

    public static int sumOfArray(int n, int a[]){
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=a[i];
        }
        return s;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n= in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Sum of elements of array is " + sumOfArray(n,arr));
    }
}