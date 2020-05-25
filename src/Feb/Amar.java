
package Feb;


public class Amar {
    //Default constructor
   Amar()
   {
       System.out.println("Default constructor");
   }
   Amar(int x)
   {
       System.out.println(x);
       System.out.println("para const");
   }
    public static void main(String[] args)
    {
      new Amar(10);
      new Amar();
    }
}
