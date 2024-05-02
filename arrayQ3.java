//Search for an element in the array. If found, return its index

import java.util.*;
public class arrayQ3 {
    
    public int searchElement(int l, int a[], int x)
    {
        for(int i=0;i<l;i++)
        {
            if(a[i]==x)
            {
                return i;
            }
        }
        System.out.println("Element not found.....");
        return -1;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter element to be searched :");
        int s=in.nextInt();
        arrayQ3 obj = new arrayQ3();
        int r = obj.searchElement(n,arr,s);
        if (r!=-1)
        {
            System.out.println("Element found at position " + r+1);
        }
    }
}
