/*
Exercise 1: Modify above program to find the min value using min() method of collection class.
*/


import java.util.*; 
public class Main 
{ 
    public static void main(String a[])
    {        
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(46); 
        list.add(67); 
        list.add(24); 
        list.add(16); 
        list.add(8); 
        list.add(12); 
        System.out.println("Value of minimum element from the collection: "+Collections.min(list)); 
    } 
}



/*
Exercise 2: Write program to find min value from list of inters without using the min method of collections class.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main 
{

	public static Integer findMin(List<Integer> list)
	{
		if (list == null || list.size() == 0)
		{
			return Integer.MAX_VALUE;
		}
		List<Integer> sortedlist = new ArrayList<>(list);
		Collections.sort(sortedlist);
		return sortedlist.get(0);
	}
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(46); 
        list.add(67); 
        list.add(24); 
        list.add(16); 
        list.add(8); 
        list.add(12); 
		System.out.println("Min: " + findMin(list));
	}
}

//SORTING ON COLLECTIONS

/*
Exercise 1: Modify above program to sort the list in reverse order.
*/


import java.util.*; 
class Main 
{ 
    public static void main(String args[])
    { 
        ArrayList<String> al=new ArrayList<String>(); 
        al.add("Viru"); 
        al.add("Saurav"); 
        al.add("Mukesh"); 
        al.add("Tahir"); 
     
        Collections.reverseOrder(); 
        Iterator itr=al.iterator(); 
        while(itr.hasNext())
        { 
            System.out.println(itr.next()); 
        } 
    } 
}


/*
Exercise 2: Modify above program to sort the list in reverse order without using Collections.reverseOrder() method.
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Main 
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("Viru"); 
        al.add("Saurav"); 
        al.add("Mukesh"); 
        al.add("Tahir"); 
        System.out.println("Unsorted Arraylist:");
        System.out.println(al);
         int count = al.size();
        String temp;
        Object[] name = al.toArray();
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++)
            {
                if (((String) name[i]).compareTo((String) name[j]) > 0)
                {
                    temp = (String) name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("\nSorted Arraylist:");
        for (int a = 0; a < name.length; a++)
        {
            System.out.println(name[a]);
        }
    }
}
