package chapters.chapter08.exercises08;
import java.util.Scanner;
public class exercise08_04 {
    public static void main(String[] args) {
        String[] employeesName = getEmployeesNameFromUser();
        int[][] hoursWorked  = getWorkHourFromUser(employeesName);
        int[] totalHours = getTotalWorkTimeForEachEmployee(hoursWorked);
        sortTotalHours(employeesName,totalHours);
        display(employeesName,totalHours);
    }

    public static void display(String[] employeesName, int[] totalHours) {
        for (int i = 0; i < employeesName.length; i++) {
            System.out.println(employeesName[i] + " has worked " + totalHours[i] + " hours in this week");
        }
    }


    public static void sortTotalHours(String[] employeesName, int[] totalHours) {
        String name;
        int hours;
        int employeesIndex;

        for (int employee = 0; employee < employeesName.length - 1; employee++) {
            name = employeesName[employee];
            hours = totalHours[employee];
            employeesIndex = employee;

            for (int potentialEmployee = employee + 1; potentialEmployee < employeesName.length; potentialEmployee++) {
                if (totalHours[potentialEmployee] > hours) {
                    employeesIndex = potentialEmployee;
                }
            }

            if (employeesIndex != employee) {
                employeesName[employee] = employeesName[employeesIndex];
                employeesName[employeesIndex] = name;

                totalHours[employee] = totalHours[employeesIndex];
                totalHours[employeesIndex] = hours;
            }
        }

    }

    public static int[] getTotalWorkTimeForEachEmployee(int[][] hoursWorked) {
        int[] list = new int[hoursWorked.length];
        int sum;


        for (int employee = 0; employee < hoursWorked.length; employee++) {
            sum = 0;
            for (int days = 0; days < hoursWorked[employee].length; days++) {
                sum += hoursWorked[employee][days];
            }
            list[employee] = sum;
        }
        return list;
    }

    public static int[][] getWorkHourFromUser(String[] employeesName) {
        Scanner input = new Scanner(System.in);
        int[][] hoursWorked = new int[employeesName.length][7];
        for (int name = 0; name < hoursWorked.length; name++) {
            System.out.println("Enter " + employeesName[name] + "'s working hours: ");
            for (int days = 0; days < hoursWorked[name].length; days++) {
                hoursWorked[name][days] = input.nextInt();
            }
        }
    return hoursWorked;
    }

    public static String[] getEmployeesNameFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employees  : ");
        int n = input.nextInt();
        input.nextLine();
        String[] employeesName = new String[n];
        System.out.print("Enter the employees names : ");
        for(int i = 0;i<n;i++){
            employeesName[i] = input.nextLine();

        }
    return employeesName;
    }

}
