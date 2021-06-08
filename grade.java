import java.util.*;
/**
 *
 * @author vikkash
 */
public class Mcjava {


    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the total mark out of 100");
        int mark= sc.nextInt();
        if(mark>=90)
        {
            System.out.println("grade A");
        }
        else if(mark>=80)
        {
            System.out.println("grade B");
        }
        else if(mark>=70)
        {
            System.out.println("grade C");
        }
        else if(mark>=60)
        {
            System.out.println("grade D");
        }
        else if(mark>=50)
        {
            System.out.println("grade E");
        }
        else 
        {
            System.out.println("grade F");
        }
        
        
    }
    
}
