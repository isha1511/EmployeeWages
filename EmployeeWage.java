import java.util.*;
public class EmployeeWage{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private static int wagePerHrs=20;
    private static int numOfWorkingDays=20;
    private static int numOfWorkingHrs=160;
    
        public static void calculateEmpWage() {
            int empHrs;
            int totalEmpHrs = 0; 
            int totalEmpWage=0;
            int totalWorkingDays=0;

            while (totalEmpHrs <= numOfWorkingHrs && totalWorkingDays <= numOfWorkingDays) {
                 Random random = new Random();
            // Generate a random 0 ,1 or 2
                int empCheck = random.nextInt(3);

                switch ((int) empCheck) {
                    case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                        empHrs = 4;
                        totalEmpHrs += empHrs;
                        totalEmpWage+=empHrs*wagePerHrs;
                        System.out.println("Total Wage :"+totalEmpWage);
                        break;
                    case IS_FULL_TIME:
                        System.out.println("Employee is Present as FULL TIME");
                        empHrs = 8;
                        totalEmpHrs += empHrs;
                        totalEmpWage+=empHrs*wagePerHrs;
                        System.out.println("Total Wage :"+totalEmpWage);
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        empHrs = 0;
                        totalEmpHrs += empHrs;
                        totalEmpWage+=empHrs*wagePerHrs;
                        System.out.println("Total Wage :"+totalEmpWage);
                        break;
                }
                totalWorkingDays++;
                System.out.println("Day No :" + totalWorkingDays + " Emp Hrs: " + empHrs);
            }
            totalEmpWage = totalEmpHrs * wagePerHrs;
            System.out.println("Total Working Hrs for  :"+totalEmpHrs);
            }

        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program");
            EmployeeWage ew1 = new EmployeeWage();
            EmployeeWage ew2 = new EmployeeWage();

            ew1.calculateEmpWage();
            ew2.calculateEmpWage();
        }
    }