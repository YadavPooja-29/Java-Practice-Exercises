/*
Exercise 1. Write a Java program to remove the third element from an array list.
*/


import java.util.*; 
class Main 
{ 
    public static void main(String args[])
    { 
        ArrayList<String> list = new ArrayList<String>();   
        list.add("Pooja");//Adding object in arraylist   
        list.add("Sudha");  
        list.add("Unknown");
        list.add("Jayeshree");  
        list.add("Amruta"); 
        list.add("Saraswati");
        list.add("Preeti");
        //Invoking arraylist object  
        System.out.println(list); 
        list.remove(2);
        System.out.println("After deleting 3rd element : "+list); 
    } 
}


/*
Exercise 2.Write a Java program to copy one array list into another.
*/

import java.util.*; 
class Main 
{ 
    public static void main(String args[])
    { 
        ArrayList<String> list = new ArrayList<String>();  
        list.add("Pooja");//Adding object in arraylist   
        list.add("Sudha");  
        list.add("Unknown");
        list.add("Jayeshree");  
        list.add("Amruta"); 
        list.add("Saraswati");
        list.add("Preeti");
        
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Yadav");
        list1.add("More");
        list1.add("Burse");
        System.out.println("Elements in ArrayListist list : "+list); 
        System.out.println("After Copying ArrayListist list element  into list1: "+(list1 = list)); 
        System.out.println("\nOR\n");
        Collections.copy(list, list1);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List: " + list);
        System.out.println("List1: " + list1);
    } 
} 

/*
Exercise 3.Write a Java program to print all the elements of a ArrayList using the position of the elements. 
*/

import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args)
    {
        ArrayList <String> al = new ArrayList <String> ();
        al.add("Red");
        al.add("Green");
        al.add("Black");
        al.add("White");
        al.add("Pink");
        System.out.println("\nOriginal array list: " + al);
        System.out.println("\nPrint using index of an element: ");
        int no_of_elements = al.size();
        for (int index = 0; index < no_of_elements; index++)
        System.out.println(al.get(index));
    }
}


/*
Exercsie 4. Write a Java program to iterate through all elements in a linked list starting at the specified position. 
Position no 1. sample list is of colors with element "Red","Green","White","Black","Yellow".
Output will be "Green","White","Black","Yellow".
*/

import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args)
    {
        ArrayList <String> al = new ArrayList <String> ();
        al.add("Red");
        al.add("Green");
        al.add("White");
        al.add("Black");
        al.add("Yellow");
        System.out.println("\nOriginal array list: " + al);
        System.out.println("\nPrint using index of an element: ");
        int no_of_elements = al.size();
        for (int index = 1; index < no_of_elements; index++)
        System.out.println(al.get(index));
    }
}


/*
Exercise 5. Write a Java program to insert elements into the linked list at the first and last position. 
Insert color "Pink" at first and "Blue" at last position in linked list in exercise 4.
*/


import java.util.LinkedList;
public class Main 
{
    public static void main(String[] args)
    {
        LinkedList<String> ll=new LinkedList<String>(); 
        ll.add("Red");
        ll.add("Green");
        ll.add("White");
        ll.add("Black");
        ll.add("Yellow");
        System.out.println("\nOriginal Linked list: " + ll);
        System.out.println("\nAdding first and last element in the LinkedList : ");
        
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll); 
        ll.addFirst("Pink"); 
        System.out.println("After invoking addFirst(E e) method: "+ll); 
        ll.addLast("Black"); 
        System.out.println("After invoking addLast(E e) method: "+ll); 
        System.out.println("\nAfter Adding elements into Linked list: " + ll);
    }
}
