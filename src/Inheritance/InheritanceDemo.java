/*
1) Below written the code is showing compile time error. Can you identify what mistake ?
class X
{
    //Class X Members
}
 class Y
{
    //Class Y Members
}
 class Z extends X, Y
{
    //Class Z Members
} 
*/


Answer: Java does not support multiple inheritance. This means that a class cannot extend more than one class. 
  Therefore, following is illegal class Z extends X, Y{}

/*
2) What is wrong with the below code? Why it is showing compile time error?
public class A
{
    public A()
    {
        System.out.println(1);
         super(); 
        System.out.println(2);
    }
}
*/

Answer: call to super must be first statement in constructor

/*
3) Does the below program written correctly? If yes, what will be the output?
public class MainClass
{
    public MainClass(int i, int j)
    {
        System.out.println(method(i, j));
    }
     int method(int i, int j)
    {
        return i++ + ++j;
    }     
    public static void main(String[] args) 
    {
        MainClass main = new MainClass(10, 20);
    }
} 
*/

Output:
31

  
/*
7) What will be the output of the following program?
interface X
{
    char c = 'A';     
    char methodX();
} 
class Y implements X
{
    {
        System.out.println(c);
    }     
    public char methodX()
    {
        char c = this.c;         
        return ++c;
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
	Y y = new Y();         
        System.out.println(y.methodX());         
        System.out.println(y.c);         
        System.out.println(X.c);
    }
}
*/
  
  
Output:
A
B
A
A
