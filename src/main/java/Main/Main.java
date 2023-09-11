package Main;

import employees.Employees;
import repository.EmployeesAddressRepository;
import repository.EmployessRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        EmployessRepository employessRepository = new EmployessRepository();
        EmployeesAddressRepository employeesAddressRepository = new EmployeesAddressRepository();
        //employessRepository.createTable();
        //employeesAddressRepository.createTable();
       /* System.out.println("Enter How many record ? ");

        int n=sc.nextInt();*/


        /*for (int i = 1; i <= n; i++) {
            System.out.println("Enter firstName"+i+" :");
            String firstName=sc.next();
            System.out.println("Enter lastName"+i+" :");
            String lastName=sc.next();
            System.out.println(" Enter officeCode"+i+" :");
            int officeCode=sc.nextInt();
            Employees employees=new Employees(null,firstName,lastName,officeCode,null);
            employessRepository.save(employees);
        }*/
        /*Employees employees=new Employees();
        System.out.println(" Enter Which EmployeesNumber ?");
        int x =sc.nextInt();

        employeesAddressRepository.select(x);*/

        /*System.out.println("\n  ---- Update officeCode With addressId ---- \n");
        System.out.println(" Which Update addressId ?");

        int addressid = sc.nextInt();
        System.out.println("Write new officeCode ?");
        int officeCode = sc.nextInt();


        employessRepository.Update(officeCode,addressid);

        System.out.println("Update officeCode!");*/
        System.out.println(" Which delete addressId ?");
        int addressid = sc.nextInt();
        employeesAddressRepository.Delete(addressid);
        employessRepository.Delete(addressid);


    }
}
