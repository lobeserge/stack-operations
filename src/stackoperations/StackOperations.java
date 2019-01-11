/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackoperations;

import java.util.Scanner;

/**
 *
 * @author SERGE
 */
public class StackOperations {
            private static  int top=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input=new Scanner(System.in);
         int[] mystack=new int[10];
        
        int choice;
        System.out.print("1  Push\n"+"2  Pop\n"+"3  Display\n"+"4  check status\n"+"5  exit\n");
       
       do
        {
               System.out.print("    make a choice\n");
               choice=input.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("\n  enter a value to push to stack ");
                int value=input.nextInt();
                Push(mystack,value);
                break;
            case 2:
                Pop(mystack);
                break;
            case 3:
                display(mystack);
                break;
            case 4:
                System.out.print(StackIsEmpty(mystack));
                break;
            case 5:
                System.exit(0);
            
        }
        }
       while(choice!=5);
              
        
    }
    
    
    
    
      private static int[] Push(int [] stack,int numToPush)
      {
        
          if( top==(stack.length))
          {
              System.out.print("stack is full");
          }
          else
          {
              top=top+1;
              stack[top]=numToPush;
          }
          return stack;
      }
        private static boolean StackIsEmpty(int[] stack)
    {
        
        if(top==0)
       {
           return true;
       }
        else
       {
           return false;
       }
    }
    
    private static int Pop(int[] stack)
    {
       
        if(StackIsEmpty(stack))
        {
         
        }
        else
        {
          
            top=top-1;
           
        }
        return stack[top]; 
    }
  
    
     private static void display(int stack[])
     {
         
         if(top==0)
         {
             System.out.print("Stack is empty");
         }
         for(int i=top;i>0;i--)
         {
          System.out.print(stack[i]+" ");
         }
         
         
     }
     
    
    
    
    
    
}
