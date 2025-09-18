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
        if int age > 16 then;
        system.out.println("they can drive");
        else
        int yearleft = calculate yearleft;
        system.out.printf("%d cents.%n",yearleft);
    
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        this.hourlyWage = hourlyWage;
        unpaidHours = 0.0;
        deducted amount(-30); 
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        calculatePay = paySalary;
        system.out.println("fullname received a wire transfer of 100CAD");
        unpaidHours = amount: //reset value to 0 
    }
}