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
