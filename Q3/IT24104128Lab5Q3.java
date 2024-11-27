import java.util.Scanner;

public class IT24104128Lab5Q3
{
    public static void main(String[] args)
    {
        int SD,ED,DR,DIS = 0;
        float AMOUNT;
        final float RCPD = 48000;
        Scanner number = new Scanner(System.in);
        
        System.out.print("Enter start date (1-31): ");
        SD = number.nextInt();
        System.out.print("Enter  ending date (1-31): ");
        ED = number.nextInt();

        DR = ED - SD ;
        
        if (SD <= 0 || SD >31 || ED <= 0 || ED >31) 
        {
            System.out.println("Error: Days must be between 1 to 31");
        }
        else if (SD > ED) 
        {
            System.out.println("Error: Start Date must be less than End Date");
        }
        else
        {
            if (DR < 3) 
            {
                DIS = 0;    
            }
            else if(DR==3 || DR == 4)
            {
                DIS = 10;
            }
            else if(DR >=5)
            {
                DIS = 10;
            }

            AMOUNT = (RCPD * DR ) / 100 * (100 - DIS);

            System.out.println();
            System.out.println("Room Charge Per Day: Rs. " + RCPD + "/=" );
            System.out.println("No of Days Reserved : " + DR );
            System.out.print("Total Amount to be Paid : " + AMOUNT);   
        }
    }
}