class grocery_manager_app :

   def   get_grocery(self):

         self.items = []
         
   def   add_item(self, item):

         self.items.append(item)
         
         print(f"'{item}' has been added.")
         
   def   remove_item(self, item):

         if item in self.items:
         
            self.items.remove(item)
            
            print(f"'{item}' removed from list")
            
         else:
         
               print(f"'{item}' not available")
               
               
   def   show_item(self):

         if not_self.items:
         
            print("Your list is empty")
            
         else: 
         
               print("Grocery List Items")
               
               for count, item in (self.items):
               
                     print(f"{count}.{item}")
                     
                        
   def main():
      
            
         
         while True:
               
               print("\n Grocery List Manager")
               print("\n 1. Add item")
               print("\n 2. Remove")
               print("\n 3. Show items")
               print("\n 0. Exit")
               
               choice = input("Enter your choice: ")
            
               if choice == '1':
               
                  item = input("Enter item to add: ")
                  manager.add_item(item)
                  
               elif choice == '2':
               
                  item = input("Enter item to remove: ")
                  manager.show_items()
                  
               elif choice == '3':
               
                    print("Here are the items available")
                  
               elif choice == '4':
               
                  print("Exiting >>>>>>>>>>>")
                  print("Goodbye!!")
                  
                  
               else:
               
                  print("Choice is not oavailable. Try again.")
            
   main()
         
