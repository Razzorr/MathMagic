package JavaTutorials;

import java.util.Scanner;

@SuppressWarnings("resource")
public class JavaTutorials 
{ 
	{
	 //Scanner scan = new Scanner(System.in); 
    // System.out.println("What is 5+5?"); 
     //String input = scan.nextLine(); 
     //if (input.equalsIgnoreCase("10")) { 
        //  System.out.println("Correct!");
    // }
     //else { 
         // System.out.println("Incorrect!");
    // }
		
		 Scanner scan1 = new Scanner(System.in); 
	     System.out.println("Hi! What is your name?"); 
	     String input1 = scan1.nextLine(); 
	     System.out.println("Hello " + input1);
     
     System.out.println("I am X! Welcome to my magic trick.");
     
     try {
         Thread.sleep(2000);
     } catch (InterruptedException ie)
     {
         System.out.println("Scanning...");
     }
     System.out.println("This is a math trick so get your calculator ready. ");
     
     try {
         Thread.sleep(2000);
     } catch (InterruptedException ie)
     {
         System.out.println("Scanning...");
     }
     System.out.println("I will be guessing your number. ");
     try {
         Thread.sleep(2000);
     } catch (InterruptedException ie)
     {
         System.out.println("Scanning...");
     }
     
     System.out.println("Think of a number between 1-20." );
     
     try {
         Thread.sleep(2000);
     } catch (InterruptedException ie)
     {
         System.out.println("Scanning...");
     }
     
     System.out.println("You got it. Good. Now, with the number you chose, add 5!");
     
     try {
         Thread.sleep(2000);
     } catch (InterruptedException ie)
     {
         System.out.println("Scanning...");
     }
     
     Scanner scan2 = new Scanner(System.in); 
     System.out.println("Did you do it? Type YES or type NO."); 
     String input2 = scan2.nextLine(); 
     
     if (input2.equalsIgnoreCase("YES")) 
     { 
         System.out.println("Good Job! Now multiply your sum by 3.");
         try {
             Thread.sleep(1000);
         } catch (InterruptedException ie)
         {
             System.out.println("Scanning...");
         }
         Scanner scan11 = new Scanner(System.in); 
         System.out.println("Did you do it? Type YES or type NO. "); 
         String input11 = scan11.nextLine(); 
         
         if (input11.equalsIgnoreCase("YES")) 
         { 
              System.out.println("Good Job! Now subtract your product by 15.");
              
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException ie)
              {
                  System.out.println("Scanning...");
              }
             
			Scanner scan111 = new Scanner(System.in); 
              System.out.println("Did you do it? Type YES or type NO. "); 
              String input111 = scan111.nextLine(); 
              
              if (input111.equalsIgnoreCase("YES")) 
              { 
            	  Scanner scan1111 = new Scanner(System.in); 
                  System.out.println("Good Job! Now tell me what number you just got. ");
                  int input1111 = scan1111.nextInt();
                  
                 
                  System.out.print("Your number was " + Math.floorDiv(input1111, 3) + " wasn't it!");
                  
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException ie)
                  {
                      System.out.println("Scanning...");
                  }
                  
                  System.out.println(" Thank you for doing this magic trick. I was correct wasn't I. ");
                  
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException ie)
                  {
                      System.out.println("Scanning...");
                  }
                  
                  System.out.println("If I wasn't correct, do this trick again. Maybe your math isn't correct.");
                  
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException ie)
                  {
                      System.out.println("Scanning...");
                  }
                  
                  System.out.println("Subscribe to my channel, RazzorXX! Thank you and enjoy your day!");
              }
              
             else 
             { 
                  System.out.println("You didn't! Then restart the program and try again!");
             }
         }
         else 
         { 
              System.out.println("You didn't! Then restart the program and try again!");
         }
    }
    else 
    { 
         System.out.println("You didn't! Then restart the program and try again.");
         
    }
     
	}
     
     /**
     
	 Scanner scan1 = new Scanner(System.in); 
     System.out.println("What is your name?"); 
     String input1 = scan1.nextLine(); 
     if (input1.equalsIgnoreCase("10")) { 
          System.out.println("Correct!");
     }
     else { 
          System.out.println("Incorrect!");
     }
     
 
     
	}

      */
	
	
	
}

