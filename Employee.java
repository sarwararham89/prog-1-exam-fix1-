/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (age >= 16){
        System.out.println("they can drive");
        return true;
        }
        else{
        System.out.printf("You must wait %d more years.%n", 16 - age);
        return false;
        } 
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(double hoursWorked){
        // question 13
        double grossnet = hourlyWage * hoursWorked;
        double netPay = grossnet - (grossnet * 0.30); // 30% tax/deduction
        return netPay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(double hoursWorked){
        // question 14
        double netPay = calculatePay(hoursWorked);
        System.out.println(fullname + "received a wire transfer of" + netPay + "CAD");
        unpaidHours = 0; 
    }
}