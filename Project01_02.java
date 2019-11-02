import java.util.*;

public class Project01_02
{
    
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of stalls: ");
        int stallCount = in.nextInt();
        int i; //counter
        String diagram = "";
        
        boolean stalls[] = new boolean[stallCount];
        
        for(i = 1; i < stallCount; i++)
        {
            stalls[i - 1] = true;
            diagram += "_ ";
            System.out.print(diagram);
            System.out.print(stalls[i] + " ");
        }
        
        System.out.println();
        System.out.println("Filling out the stalls: ");
        
        
        
        
        
    }
}