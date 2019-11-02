import java.util.*;

public class Project01_01
{
    
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of rows: ");
        int rows = in.nextInt();
        System.out.print("Input the number of columns: ");
        int columns = in.nextInt();
        
        int theater[][] = new int[rows][columns];
        int i; //counter for rows
        int j; //counter for columns
        int decision;//decision taken by user
        int price;
        
        Random rand = new Random();
        
        for(i = 0; i < theater.length; i++)
        {
            
            for(j = 0; j < theater[0].length; j++)
            {
                
                theater[i][j] = (10 * rand.nextInt(6));
                System.out.printf("%4d", theater[i][j]);
            }
            System.out.println();
        }
        System.out.println("Welcome, please choose an option: ");
        
        do
        {
            
             
                for(i = 0; i < theater.length; i++)
                {
                    
                    for(j = 0; j < theater[0].length; j++)
                    {
                        
                        System.out.printf("%4d", theater[i][j]);
                    }
                    System.out.println();
                }
                
            
            System.out.println("1.Choose a seat\n2.Choose a seat price\n3.Exit");
            decision = in.nextInt();
            
            if(decision == 1)
            {

                
                System.out.print("Choose row: ");
                i = in.nextInt();
                System.out.print("Choose column: ");
                j = in.nextInt();
                
                if(theater[i][j] == 0)
                {
                    
                    System.out.println("Seat already taken");
                }
                else
                {
                    
                    theater[i][j] = 0;
                    System.out.println("Bought!");
                }
            }// end outer if(1)
            else if(decision == 2)
            {
                
                System.out.print("Choose a price: ");
                price = in.nextInt();
                
                if(price == 0)
                {
                    
                    System.out.println("Seats already taken");
                    
                }
                
                    
                    for(i = 0; i < theater.length; i++)
                    {
                        
                        for(j = 0; j < theater[0].length; j++)
                        {
                            
                            if(price == theater[i][j])
                            {
                                
                             System.out.println("You bougth seat row: " + i +
                                                " column: " + j);
                            
                                theater[i][j] = 0;
                            
                            
                            }
                            
                            if(theater[i][j] == 0)
                            {
                            
                                i = theater.length;
                                j = theater[0].length;
                            }
                        }          
                    }
                    
                   
                
            }
            
           
            else if(decision == 3)
            {
                
                System.out.println("Exited");
                break;
            }
            else
            {
                
                System.out.println("Invalid input, please try again");
                
            }
        } while(decision != 3);//end do-while(3)
        
        System.out.println("Proceeding to check out...");
    }//end main method
}//end public class