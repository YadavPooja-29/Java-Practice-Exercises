/*
1) What is the output of the following program?
class Derived 
{ 
	protected final void getDetails() 
	{ 
		System.out.println("Derived class"); 
	} 
} 
public class Test extends Derived 
{ 
	protected final void getDetails() 
	{ 
		System.out.println("Test class"); 
	} 
	public static void main(String[] args) 
	{ 
		Derived obj = new Derived(); 
		obj.getDetails(); 
	} 
} 
a) Derived class
b) Test class
c) Runtime error
d) Compilation error
*/

Answer: d) Compilation error

/*
2) What is the output of the following program?
class Derived 
{ 
	public void getDetails(String temp) 
	{ 
		System.out.println("Derived class " + temp); 
	} 
} 

public class Test extends Derived 
{ 
	public int getDetails(String temp) 
	{ 
		System.out.println("Test class " + temp); 
		return 0; 
	} 
	public static void main(String[] args) 
	{ 
		Test obj = new Test(); 
		obj.getDetails("GFG"); 
	} 
} 
a) Derived class GFG
b) Test class GFG
c) Compilation error
d) Runtime error

*/

Answer: c) Compilation error


/*
3) What is the output of the following program?
class Derived 
{ 
	public void getDetails() 
	{ 
		System.out.println("Derived class"); 
	} 
} 

public class Test extends Derived 
{ 
	protected void getDetails() 
	{ 
		System.out.println("Test class"); 
	} 
	public static void main(String[] args) 
	{ 
		Derived obj = new Test(); // line xyz 
		obj.getDetails(); 
	} 
} 
a) Test class
b) Compilation error due to line xyz
c) Derived class
d) Compilation error due to access modifier
*/

Answer: d) Compilation error due to access modifier


/*
4) What is the output of the following program?
import java.io.IOException; 
class Derived 
{ 
	public void getDetails() throws IOException //line 23 
	{ 
		System.out.println("Derived class"); 
	} 
} 
public class Test extends Derived 
{ 
	public void getDetails() throws Exception //line 24 
	{ 
		System.out.println("Test class"); 
	} 
	public static void main(String[] args) throws IOException //line 25 
	{ 
		Derived obj = new Test(); 
		obj.getDetails(); 
	} 
} 
a) Compilation error due to line 23
b) Compilation error due to line 24
c) Compilation error due to line 25
d) All the above

*/

Answer: b) Compilation error due to line 24
