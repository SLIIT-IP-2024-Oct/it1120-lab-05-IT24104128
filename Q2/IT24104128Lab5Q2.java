import java.util.Scanner;

public class IT24104128Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced (>= 0): ");
        int newMembers = scanner.nextInt();

        // Validate 
        if (newMembers < 0) {
            System.out.println("Invalid input! Number of new members should be greater than or equal to 0.");
        } else {
            // the prize using a switch statement
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
            }

            
            System.out.println("Prize: " + prize);
        }
            scanner.close();
    }
}
