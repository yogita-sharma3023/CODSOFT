import java.util.Scanner;
public class Stu_Grade_Calc {
    /*
     * Student Grade Calculator
     */
    public static void main(String[] args) {
        int marks,subjects;
        int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("***STUDENT GRADE CALCULATER***");
        
        System.out.println("How Many Subjects Do You Have? Enter: ");
        subjects = sc.nextInt();
        for(int i=1;i<=subjects;i++)
        {
            //taking marks from user for each subject
            System.out.println("Enter The Marks Of Subject " +i);
            marks = sc.nextInt();

            if(marks<0 || marks>100){
                System.out.println("Marks Should Be Between 0 To 100. Please Enter Again:");
                i--;
            }
            else{
                total+=marks;
            }

        }
        // displaying total marks of user
        System.out.println("Your Total Marks: "+total);

        float avgPercentage = (float)total/(subjects*100)*100;
        // displaying percentage of user
        System.out.println("Your Average Percentage Is: "+avgPercentage);

        // condition for grade calculation
        if (avgPercentage>=90) {
            System.out.println("Grade O");
        }
        else if(avgPercentage>=80){
            System.out.println("Grade A");
        }
        else if(avgPercentage>=70){
            System.out.println("Grade B");
        }
        else if(avgPercentage>=60){
            System.out.println("Grade C");
        }
        else if(avgPercentage>=50){
            System.out.println("Grade D");
        }
        else if(avgPercentage>=40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
