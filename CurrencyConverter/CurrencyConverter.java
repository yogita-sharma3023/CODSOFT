import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String[] args) {
        
        float rupee,euro,dollar,pound;
        System.out.println("WELCOME TO CURRENCY CONVERTER!");
        System.out.println("Which Currency Do You Want To Convert?");
        System.out.println("1.Rupees");
        System.out.println("2.Euro");
        System.out.println("3.Dollar");
        System.out.println("4.Pound");
        System.out.print("Enter your choice (1 or 2 or 3 or 4): ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

       
        switch(ch) {
            case 1:
              System.out.print("Enter the amount in Rupees: ");
              rupee = sc.nextFloat();
              euro = rupee/91.25f;
              System.out.println("Converted amount in Euro: " + euro);
              dollar = rupee/83.79f;
              System.out.println("Converted amount in Dollar: " + dollar);
              pound = rupee/107.25f;
              System.out.println("Converted amount in Pound: " + pound);
              break;
            case 2:
        
              System.out.print("Enter the amount in Euro: ");
              euro= sc.nextFloat();
              rupee = euro*91.25f;
              System.out.println("Converted amount in Rupee: " + rupee);
              dollar = euro*1.08f;
              System.out.println("Converted amount in Dollar: " + dollar);
              pound = euro*0.85f;
              System.out.println("Converted amount in Pound: " + pound);
              break;
        
            case 3:
              System.out.print("Enter The Amount In Dollar: ");
              dollar= sc.nextFloat();
              rupee = dollar*83.79f;
              System.out.println("Converted amount in Rupees: " + rupee);
              euro = dollar*0.91f;
              System.out.println("Converted amount in Euro: " + euro);
              pound = dollar*0.78f;
              System.out.println("Converted amount in Pound: " + pound);
              break;

            case 4: 
              System.out.print("Enter the amount in Pound: ");
              pound = sc.nextFloat();
              rupee = pound*107.25f;
              System.out.println("Converted amount in Rupees: " + rupee);
              euro = pound*1.17f;
              System.out.println("Converted amount in Euro: " + euro);
              dollar = pound*1.28f;
              System.out.println("Converted amount in Dollar: " + dollar);
              break;
            default:
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4.");
        }

        sc.close();
    }

    
    

   
}
    
