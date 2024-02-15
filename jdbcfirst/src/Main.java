import com.durgasoft.controller.EmployeeController;
import com.durgasoft.factory.ConnectionFactory;
import com.durgasoft.factory.EmployeeControllerFactory;
import com.durgasoft.factory.EmployeeDaoFactory;
import com.durgasoft.factory.EmployeeServiceFactory;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
   static{
       ConnectionFactory.getConnection();
       EmployeeControllerFactory.getEmployeeController();
       EmployeeServiceFactory.getEmployeeService();
       EmployeeDaoFactory.getEmployeeDao();
   }
   public static void main(String[] args) {
       System.out.println("Welcome To Employee Management System");


       try{
           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           EmployeeController employeeController = EmployeeControllerFactory.getEmployeeController();
           while (true){
               System.out.println();
               System.out.println("1. ADD Employee");
               System.out.println("2. SEARCH Employee");
               System.out.println("3. GET All Employee");
               System.out.println("4. UPDATE Employee");
               System.out.println("5. DELETE Employee");
               System.out.println("6. EXIT");
               System.out.print("Your Option   : ");
               int userOption = Integer.parseInt(bufferedReader.readLine());


               switch (userOption){
                   case 1:
                       System.out.println("ADD Employee Module");
                       System.out.println("==========================");
                       employeeController.addEmployee();
                       break;
                   case 2:
                       System.out.println("SEARCH Employee Module");
                       employeeController.searchEmployee();
                       break;
                   case 3:
                       System.out.println("GET All Employees Module");
                       employeeController.getAllEmployees();
                       break;
                   case 4:
                       System.out.println("UPDATE Employee Module");
                       employeeController.updateEmployee();
                       break;
                   case 5:
                       System.out.println("DELETE Employee Module");
                       employeeController.deleteEmployee();
                       break;
                   case 6:
                       System.out.println("Thank you for using Employee Management System");
                       ConnectionFactory.cleanup();
                       System.exit(0);
                       break;
                   default:
                       System.out.println("Wrong Option, please select the option from 1,2,3,4 and 5");
                       break;


               }
           }
       }catch (Exception exception){
           exception.printStackTrace();
       }
   }
}
