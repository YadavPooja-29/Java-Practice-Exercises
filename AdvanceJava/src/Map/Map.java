//TREEMAP AND HASHTABLE IN JAVA

/*
1. For practise edit above program to remove element 102 to get below output
Before remove: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
After remove: {103=Rahul, 101=Vijay, 100=Amit}
*/


import java.util.*;  
class Main 
{  
    public static void main(String args[])
    {  
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
        hm.put(100,"Amit");  
        hm.put(102,"Ravi");  
        hm.put(101,"Vijay");  
        hm.put(103,"Rahul");  
        System.out.println("Before Removable: " +hm);
        hm.remove(102);
        System.out.println("After Removable: " +hm);
    }  
}  



/*
2. For practise update above program to add entry only if absent 104=Gaurav to get below output . Use method putIfAbsent().
Initial Map: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
*/


import java.util.*; 
class Main 
{ 
    public static void main(String args[])
    { 
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();   
        hm.put(103,"Rahul");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(100,"Amit");
        System.out.println("Initial Map: " +hm); 
        hm.putIfAbsent(104, "Gaurav");
        System.out.println("Updated Map: "+hm); 
    } 
}


//TREEMAP AND HASHTABLE IN JAVA

/*
Exercise 1. Write a Java program to associate the specified value with the specified key in a HashMap.
Sample output (hint use Map(<int><String>))

1 Red                                                                  
2 Green                                                                
3 Black                                                                
4 White                                                                
5 Blue
*/


import java.util.*;  
public class Main 
{  
    public static void main(String args[]) 
    {  
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        for(Map.Entry x:hash_map.entrySet())
        {  
            System.out.println(x.getKey()+" "+x.getValue());  
        }  
    }  
}

/*
Exercise 2: Write a Java program to get the value of a specified key in a map. Get value of key 3 in above map in exercise 1.
*/


import java.util.*;  
public class Main 
{  
    public static void main(String args[]) 
    {  
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        String val=(String)hash_map.get(3); 
        System.out.println("Value for key 3 is: " + val);
    }  
}


/*
Exercise 3: Write a Java program to remove all of the mappings from a map in exercise 1.
*/


import java.util.*;  
public class Main 
{  
    public static void main(String args[]) 
    {  
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        System.out.println("The Original linked map: " + hash_map);
        hash_map.clear();
        System.out.println("The New map: " + hash_map);
    }  
}


/*
Exercise 4: Write a Java program to get the first (lowest) key and the last (highest) key currently in a tree map. Create a tree map with TreeMap<String><String>
 Put elements to the map
 tree_map1.put("C2", "Red");
 tree_map1.put("C1", "Green");
 tree_map1.put("C4", "Black");
 tree_map1.put("C3", "White");

Output will be

Orginal TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}        
Greatest key: C1                                                       
Least key: C4

*/

import java.util.*;
import java.util.Map.Entry;  
public class Main 
{  
    public static void main(String args[])
    {
        TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();
        tree_map1.put("C2", "Red");
        tree_map1.put("C1", "Green");
        tree_map1.put("C4", "Black");
        tree_map1.put("C3", "White");

        System.out.println("Orginal TreeMap content: " + tree_map1);
        System.out.println("Greatest key: " + tree_map1.firstKey());
        System.out.println("Least key: " + tree_map1.lastKey());
   }
}


//Interview QnA on HashMap

//Below are some questions on Map interface. Try to find the answers.

1.Which of this method Map class is used to obtain an element in the map having specified key?
Answer: get()

2. Which of these methods can be used to obtain set of all keys in a map?
Answer: keySet() methods is used to get a set containing all the keys used in a map. 
        This method provides set view of the keys in the invoking map.

3. Which of this method is used add an element and corresponding key to a map?
Answer: Maps revolve around two basic operations – get() and put(). to put a value into a map, use put(), specifying the key and the value. 
        To obtain a value, call get() , passing the key as an argument. The value is returned.      

 4. What is the output of this program?

    import java.util.*;
    class Maps 
    {
        public static void main(String args[]) 
        {
            TreeMap obj = new TreeMap();
            obj.put("A", new Integer(1));
            obj.put("B", new Integer(2));
            obj.put("C", new Integer(3));
            System.out.println(obj.entrySet());
        }
    }
Output :
 [A=1, B=2, C=3]
