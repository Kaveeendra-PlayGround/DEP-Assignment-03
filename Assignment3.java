import java.util.*;

public class Assignment3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Your Name : ");
        String name = scanner.nextLine().strip();

        if (name.length()<1){
            System.out.printf("%sInvalid Name%s\n", "\033[031m", "\033[030m");
            return;
        }else if((name.strip()).length()<1){
            System.out.printf("%sInvalid Name%s\n", "\033[031m", "\033[030m");
            return;
        }
        
        System.out.print("Enter Your Age : ");
        int age = scanner.nextInt();

        
        if (age<10 || age>18 ){
            System.out.printf("%sInvalid Age%s\n", "\033[031m", "\033[030m");
            return;
        }

        System.out.print("Enter Your Subject-1 Name: ");
        String subject1 = scanner.next();

        boolean flag1 = subject1.startsWith("SE-");
        
        if (flag1 == false){
            System.out.printf("%sInvalid Subject%s\n", "\033[031m", "\033[030m");
            return;
        }

        System.out.print("Enter Subject-1 Marks : ");
        double marks1 = scanner.nextDouble();

        if (marks1<0 || marks1>100){
        System.out.printf("%sInvalid Marks%s\n", "\033[031m", "\033[030m");
        return;
        }
        
        System.out.print("Enter Your Subject-2 Name: ");
        String subject2 = scanner.next();

        boolean flag2 = subject1.startsWith("SE-");
        boolean flag2a = subject2.equals(subject1);

        if (flag2 == false){
            System.out.printf("%sInvalid Subject%s\n", "\033[031m", "\033[030m");
            return;
        }

        if (flag2a == true){
            System.out.printf("%sSubject Name is already exits%s\n", "\033[031m", "\033[030m");
            return;
        }

        System.out.print("Enter Subject-2 Marks : ");
        double marks2 = scanner.nextDouble();

        if (marks1<0 || marks1>100){
        System.out.printf("%sInvalid Marks%s\n", "\033[031m", "\033[030m");
        return;
        }

        System.out.print("Enter Your Subject-3 Name: ");
        String subject3 = scanner.next();

        boolean flag3 = subject1.startsWith("SE-");
        boolean flag3a = subject3.equals(subject1) || subject3.equals(subject2);

        if (flag3 == false){
            System.out.printf("%sInvalid Subject%s\n", "\033[031m", "\033[030m");
            return;
        }
        if (flag3a == true){
            System.out.printf("%sSubject Name is already Exits%s\n", "\033[031m", "\033[030m");
            return;
        }

        System.out.print("Enter Subject-3 Marks : ");
        double marks3 = scanner.nextDouble();

        if (marks1<0 || marks1>100){
        System.out.printf("%sInvalid Marks%s\n", "\033[031m", "\033[030m");
        return;
        }

        double total = marks1+marks2+marks3;
        double avg = (double)(total/3);
        String status = null;
        String status1 = null;
        String status2 = null;
        String status3 = null;
        

        if (marks1>75) status1 = "\033[034;1m"+"Distinguished Pass (DP)"+"\033[030;0m";
        else if (marks1>65) status1 = "\033[032;1m"+"Credit Pass"+"\033[030;0m";
        else if (marks1>55) status1 = "\033[033;1m"+"Pass"+"\033[030;0m";
        else status1 = "\033[031;1m"+"FAIL"+"\033[030;0m";

        if (marks2>75) status2 = "\033[034;1m"+"Distinguished Pass (DP)"+"\033[030;0m";
        else if (marks2>65) status2 = "\033[032;1m"+"Credit Pass"+"\033[030;0m";
        else if (marks2>55) status2 = "\033[033;1m"+"Pass"+"\033[030;0m";
        else status2 = "\033[031;1m"+"FAIL"+"\033[030;0m";

        if (marks3>75) status3 = "\033[034;1m"+"Distinguished Pass (DP)"+"\033[030;0m";
        else if (marks3>65) status3 = "\033[032;1m"+"Credit Pass"+"\033[030;0m";
        else if (marks3>55) status3 = "\033[033;1m"+"Pass"+"\033[030;0m";
        else status3 = "\033[031;1m"+"FAIL"+"\033[030;0m";

        if (avg>75) status = "\033[034;1m"+"Distinguished Pass (DP)"+"\033[030;0m";
        else if (avg>65) status = "\033[032;1m"+"Credit Pass"+"\033[030;0m";
        else if (avg>55) status = "\033[033;1m"+"Pass"+"\033[030;0m";
        else status = "\033[031;1m"+"FAIL"+"\033[030;0m";

        System.out.printf("----------------------------------------------------\n");
        System.out.printf("|Name   : %s%-41s%s|\n","\033[034;1m",name.toUpperCase(), "\033[030;0m");
        System.out.printf("|Age    : %s%-41d%s|\n", "\033[031m", age, "\033[030m");
        System.out.printf("|Status : %-57s|\n",status);
        System.out.printf("|Total  : %-21.2f , Average : %.2f%s |\n",total, avg, "%");
        System.out.printf("----------------------------------------------------\n");
        System.out.printf("|%-12s|%-12s|%-24s|\n","Subject","Marks","Status");
        System.out.printf("----------------------------------------------------\n");
        System.out.printf("|%-12s|%-12s|%-40s|\n", subject1, marks1, status1);
        System.out.printf("|%-12s|%-12s|%-40s|\n", subject2, marks2, status2);
        System.out.printf("|%-12s|%-12s|%-40s|\n", subject3, marks3, status3);
        System.out.printf("----------------------------------------------------\n");
        
    
    }
}