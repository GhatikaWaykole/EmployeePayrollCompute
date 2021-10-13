package com.example;
/* purpose employeePayroll detail use file IO compute
 * program to take input the console and display the detail
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollCompute {
    public enum IO{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
    private List<Employee> arraylist;
    public EmployeePayrollCompute(){

    }
    public EmployeePayrollCompute(List<Employee> list) {
        this.arraylist = list;
    }
    public static void main(String args[]){
        System.out.println("welcome the employee payroll compute");
        ArrayList<Employee> arrayList = new ArrayList<>();
        EmployeePayrollCompute employeePayrollCompute = new EmployeePayrollCompute(arrayList);
        Scanner scanner = new Scanner(System.in);
        employeePayrollCompute.readEmployeeDetail(scanner);
        employeePayrollCompute.writeEmployeeDetail();
    }
    //method readEmployeeDetail enter the detail compute
    public void readEmployeeDetail(Scanner reader){
        System.out.println("Enter the id");
        int id = reader.nextInt();
        System.out.println("Enter the salary");
        int salary = reader.nextInt();
        System.out.println("Enter the name");
        String name = reader.next();
        arraylist.add(new Employee(id,salary,name));
    }
    //method writeEmployeedetail to the employee detail compute
    public void writeEmployeeDetail() {
        for (Employee i :arraylist) {
            System.out.println(i);
        }
    }
}
