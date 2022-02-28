// All Exercises

/* Exercise 1 : Write a Java program to sort a numeric array and a string array. */

import java.util.Arrays; 
public class Main 
{
    public static void main(String[] args)
    {   
        int[] array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
            
        String[] array2 = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };   
     
        System.out.println("\nOriginal numeric array : "+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(array1));
    
        System.out.println("\nOriginal string array : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : "+Arrays.toString(array2));
    }
}


/* Exercise 2 : Write a Java program to test if an array contains a specific value. */

import java.util.*;
public class Main 
{
    public static boolean contains(int[] arr, int item) 
    {
        for (int n : arr)
        {
            if (item == n)
            {
                return true;
            }
        }
        return false;
   }
   public static void main(String[] args)
   {
        int[] array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };
     
        System.out.println(contains(array1, 2013));
        System.out.println(contains(array1, 2015));
   }
}


/* Exercise 3 : Write a Java program to remove a specific element from an array. */

import java.util.Arrays; 
public class Main 
{
    public static void main(String[] args)
    {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array : "+Arrays.toString(array));     
        int removeIndex = 1;
        for(int i = removeIndex; i < my_array.length -1; i++)
        {
            array[i] = array[i + 1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(array));
    }
}


/* Exercise 4 : Write a Java program to find the maximum and minimum value of an array. */

import java.util.Arrays; 
public class Main 
{
    static int max;
    static int min;
    public static void max_min(int array[])
    {
        max = array[0];
        min = array[0];
        int len = array.length;
        for (int i = 1; i < len - 1; i = i + 2)
        {
            if (i + 1 > len) 
            {
                if (array[i] > max) max = array[i];
                if (array[i] < min) min = array[i];
            }
            if (array[i] > array[i + 1])
            {
                if (array[i] > max) max = array[i];
                if (array[i + 1] < min) min = array[i + 1];
            }
            if (array[i] < array[i + 1])
            {
                if (array[i] < min) min = array[i];
                if (array[i + 1] > max) max =array[i + 1];
            }
        }
    }
    public static void main(String[] args)
    {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(array);
        System.out.println(" Original Array: "+Arrays.toString(array));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
}


/* Exercise 5 : Write a Java program to reverse an array of integer values. */

import java.util.Arrays; 
public class Main 
{
    public static void main(String[] args)
    {   
        int[] array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        System.out.println("Original array : "+Arrays.toString(my_array1));  
        for(int i = 0; i < array1.length / 2; i++)
        {
            int temp = array1[i];
            array1[i] = array1[array1.length - i - 1];
            array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(array1));
    }
}


/*  Exercise 6 : Write a Java program to find the duplicate values of an array of string values.  */

import java.util.Arrays; 
public class Main 
{
    public static void main(String[] args) 
    {
        String[] array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if( (array[i].equals(array[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+array[j]);
                }
            }
        }
    }    
}

/* Exercise 7 : Write a Java program to remove duplicate elements from an array. */

import java.util.Arrays; 
public class Main 
{
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            if (a[i] != a[i + 1]) 
            {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
        for (int i = 0; i < j; i++) 
        {
            a[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 1, 2, 2, 2 };
        int n = a.length;
  
        n = removeduplicates(a, n);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

/* Exercise 8 : Write a Java program to find the second largest element in an array.  */

import java.util.Arrays; 
public class Main 
{
    public static void main(String[] args)
    {
        int[] array = {10789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        System.out.println("Original numeric array : "+Arrays.toString(array));            
        Arrays.sort(array);
        int index = array.length-1;
        while(array[index]==array[array.length-1])
        {
            index--;
        }
        System.out.println("Second largest value: " + array[index]);
    }
}


/*  Exercise 9 : Write a Java program to find the number of even and odd integers in a given array of integers.  */

import java.util.Arrays; 
public class Main 
{
    public static void main(String[] args)
    {
      int[] array_nums = {5, 7, 2, 4, 9};
	    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	    int ctr = 0;
	    for(int i = 0; i < array_nums.length; i++)
	    {
		    if(array_nums[i] % 2 == 0)
			ctr++;
	    }
	    System.out.println("Number of even numbers : "+ctr);
	    System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
    }
}


/* 
Exercise 10 :
Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array
*/

import java.util.Arrays; 
public class Main 
{
    public static void main(String[] args)
    {
        int nums[] = {20, 20, 30, 40, 50, 50, 50};  
		    System.out.println("Original array length: "+nums.length);
		    System.out.print("Array elements are: ");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
		    System.out.println("\nThe new length of the array is: "+array_sort(nums));
			
    }
    
    public static int array_sort(int[] nums)
    {
        int index = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[index-1])
                nums[index++] = nums[i];
        }
	     return index;
    }
}

/*  
Exercise 12 :
Given an array of ints, swap the first and last elements in the array. Return the modified array.
The array length will be at least 1. If not throw a error message .

Sample input/output
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

import java.io.*;
public class Main 
{
	static void rvereseArray(int arr[],int start, int end)
	{
		int temp;
		int temp1;
		while (start < end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			temp1 = arr[end];
			arr[end] = arr[start];
			arr[start] = temp1;
			end--;
		}
	}	
	static void printArray(int arr[],int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}

	public static void main(String args[]) 
	{
		
		int arr[] = {1, 2, 3, 4};
		printArray(arr, 4);
		rvereseArray(arr, 0, 2);
		System.out.print("Reversed array is \n");
		printArray(arr, 4);
		
	}
}
