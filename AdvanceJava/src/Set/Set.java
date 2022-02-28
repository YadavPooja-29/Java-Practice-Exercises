/*
Exercise 1 : Write a program to remove elements from a SET of integers that are the perfect square. 
Sample input /Output :  numbers : [2, 3, 4, 5, 6, 7, 8, 9, 10]
After removeAll(perfectSquares) => [2, 3, 5, 6, 7, 8]
*/

import java.util.HashSet;
public class Set 
{
  public void perfect_square() 
  {
		 HashSet<Integer> a = new HashSet<Integer>();   
     a.addAll(Arrays.asList(new Integer[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
	        System.out.println(a);
	}
}


/*
Exercise 2 :  Write a Java program to convert a hash set to a List/ArrayList.
*/

import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);

        List<String> list = new ArrayList<String>(h_set);
        
        System.out.println("ArrayList contains: "+ list);
    }
}


/*
Exercise 3  : Write a Java program to get the first and last elements in a tree set.
Sample Input/Output
Tree set:                                                              
[Black, Green, Orange, Red, White]                                     
First Element is: Black                                                
Last Element is: White 
*/


import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        TreeSet<String> ts=new TreeSet<String>(); 
        ts.add("Red"); 
        ts.add("Green"); 
        ts.add("White"); 
        ts.add("Pink"); 
        ts.add("Yellow");
        System.out.println("Original Tree Set: " + ts);
        System.out.println("To access first and last element from TreeSet :  "
        +"\nFirst element :"+ts.first() + "\nLast Element :"+ts.last());
    }
}


/*
Exercise 4 : Write a Java program to get an element in a tree set which is strictly greater than the given element. 
Sample Input/output
TreeSet : {10,22,36,25,16,70,82,89,14}
Strictly greater than 76 : 82                                          
Strictly greater than 31 : 36
*/


import java.util.TreeSet;
import java.util.Iterator;
public class Main 
{
    public static void main(String[] args)
    {
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
     
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        System.out.println("Strictly greater than 76  : "+tree_num.higher(76));
        System.out.println("Strictly greater than 31 : "+tree_num.higher(31));
    }    
}
