​​package com.durgasoft.factory;


import com.durgasoft.service.EmployeeService;
import com.durgasoft.service.EmployeeServiceImpl;


public class EmployeeServiceFactory {
   private static EmployeeService employeeService;
   static {
       employeeService = new EmployeeServiceImpl();
   }


   public static EmployeeService getEmployeeService() {
       return employeeService;
   }
}
