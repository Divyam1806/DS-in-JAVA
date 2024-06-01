//Rotate an array by K steps

import java.util.*;
public class arrayQ5
{
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
    }

    public static int[] rotateArray(int arr[], int k)
    {
        int n = arr.length;
        int r[] = new int[n];
        k%=n;
        int j=0;
        for(int i=n-k;i<n;i++)
        r[j++] = arr[i];
        for(int i=0;i<n-k;i++)
        r[j++] = arr[i];
        return r;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array :");
        for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
        System.out.println("Enter number of rotations :");
        int k = sc.nextInt();
        int res[] = new int[n];
        res = rotateArray(a,k);
        printArray(res);
    }
}