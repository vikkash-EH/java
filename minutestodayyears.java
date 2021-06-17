package mcjava;
import java.util.Scanner;
/**
 *
 * @author vikkash
 */
public class mtd {
    public void con(int min)
    {
        int minutesInYear = 60 * 24 * 365;
        
    
        int years =(min / minutesInYear);
        int days =(min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
    
    public static void main(String[] Strings) {


        

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        int min = sc.nextInt();
        mtd m=new mtd();
        m.con(min);

    }
}

