import java.util.ArrayList;
import java.util.Scanner;

public class groceryManagerApp
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Arraylist<String>ItemList = new Arraylist<>();
      
      
            System.out.print("\n Grocery List Manager");
            System.out.print("\n 1. Add item");
            System.out.print("\n 2. Remove item");
            System.out.print("\n 3. Show all available items");
            System.out.print("\n 0. Exit");
           
      
      
      while (true)
      {
            int choice = input.nextInt();
            String choice = input.nextLine;      
      switch(choice)
      {

                     case "1":
                              System.out.print("Enter item to add: ");
                              String addItem = input.nextLine();
                              ItemList.add(addItem);
                              SYstem.out.println(ItemList + " item has been added");
                              break;
                     
                     case "2":
                              System.out.print("Enter item to remove: ");
                              String removeItem = input.nextLine();
                              
                              if (ItemList.remove(removeItem));
                                 System.out.print("Item removed");

                              
                     case "3":
                             System.out.print("Show all available items");
                              
                     case "4":
                              System.out.print("Exiting>>>>>>>>>");
                              
                     default:
                              System.out.println("Choice unavailable");
            }
    }
  

}
