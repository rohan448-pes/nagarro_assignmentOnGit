package HackerRankSoln;
import java.util.*;
public class OneDArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            // System.out.print(arr[i]);
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
//GlassDoor Programme
/*
  }
   Sum(arr);
}
   public static void Sum(int arr[][])
   {
       int sum=-1000;

       for(int i=0;i<4;i++)
       {
           for(int x=0;x<4;x++){
               int top=arr[i][x]+arr[i][x+1]+arr[i][x+2];
               int middle=arr[i+1][x+1];
               int bottom=arr[i+2][x]+arr[i+2][x+1]+arr[i+2][x+2];
               if(top+middle+bottom>sum){
                   sum=top+middle+bottom;
               }
           }
       }
       System.out.println(sum);


       }
   }
 */



// Abstraction Problem
/*
import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

//Write MyBook class here

class MyBook extends Book{
    @Override
    void setTitle(String s) {

        title = s;
    }
    String getTitle(){
        return title;
    }
}
public class Main{

	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();

	}
}
 */


//Interface Problem
/*
import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    int temp=0;
   public int divisor_sum(int n){
       // int temp;
        for(int i = 1; i<=n;i++)
        {
            if(n%i==0)
            {
              temp = temp+i;
            }
        }
        return temp;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }

     // ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented

static void ImplementedInterfaceNames(Object o){
    Class[] theInterfaces = o.getClass().getInterfaces();
    for (int i = 0; i < theInterfaces.length; i++){
        String interfaceName = theInterfaces[i].getName();
        System.out.println(interfaceName);
    }
}
}
*/



//Iteretor problem
/*
import java.util.*;
public class Main{

   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
        // ~~~Complete this line~~~
         if(element instanceof String)//Hints: use instanceof operator

			break;
		}
      return it;

   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }

      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }

      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}

 */


//factory pattern in java
/*
import java.util.*;
import java.security.*;
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {

	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {
            if(order==null){
                return null;
            }
            if(order.equals("cake"))
            {
                return new Cake();
            }
            else if(order.equals("pizza"))
            {
                return new Pizza();
            }
 return null;

//Write your code here

}//End of getFood method

	}//End of factory class

	public class Solution {

	 public static void main(String args[]){
			Do_Not_Terminate.forbidExit();

		try{

			Scanner sc=new Scanner(System.in);
			//creating the factory
			FoodFactory foodFactory = new FoodFactory();

			//factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());


			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	 }

	}
	class Do_Not_Terminate {

	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }

	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}






 */

// Comparator in java
/*
import java.util.*;

// Write your Checker class here
 class Checker implements Comparator<Player>{
  public  int compare(Player o1,Player o2){
      if(o1.score < o2.score){
            return 1;
        }
        else if(o1.score > o2.score){
            return -1;
        }
        else{
            if(o1.name.compareTo(o2.name) <= -1){
                return -1;
            }
            else if (o1.name.compareTo(o2.name) >= 1){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}


class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
 */