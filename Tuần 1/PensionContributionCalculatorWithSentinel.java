import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the monthly salary (Or -1 to end) : $");
        int salary = scanner.nextInt();
        
        //loop
        while(salary != -1){
            System.out.print("Enter the age : ");
            int age = scanner.nextInt();  
           
            // Check contributable salary
            int contributableSalary;
            int SalaryCelling = 6000; 
            if(salary <= SalaryCelling) {
                contributableSalary = salary;
            } else {
                contributableSalary = SalaryCelling;
            }

            // Employer's contribution and employee's contribution
            double employeeContribution = 0;
            double employerContribution = 0;
            if (age <= 55) {
                employeeContribution = contributableSalary * 0.17;
                employerContribution = contributableSalary * 0.2;
            } else if (55 < age && age <= 60) {
                employeeContribution = contributableSalary * 0.13;
                employerContribution = contributableSalary * 0.13;
            } else if (60 < age && age <= 65) {
                employeeContribution = contributableSalary * 0.09;
                employerContribution = contributableSalary * 0.075;
            } else if (65 < age) {
                employeeContribution = contributableSalary * 0.075;
                employerContribution = contributableSalary* 0.05;
            }

            // Total contribtion
            double TotalContribution = employeeContribution + employerContribution;

            // Print
            System.out.printf("The employee's contribution is : $%.2f%n" , employeeContribution);
            System.out.printf("The employer's contribution is : $%.2f%n" , employerContribution);
            System.out.printf("The total contribution is : $%.2f%n" , TotalContribution);
            System.out.println(" ");
           
            // Read next input and repeat
            System.out.print("Enter the monthly salary (Or -1 to end) : $");
            salary = scanner.nextInt();    
        }
        
        scanner.close();
        System.out.println("Bye!");
    }
}
