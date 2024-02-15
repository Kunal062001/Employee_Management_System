package com.durgasoft.factory;


import com.durgasoft.dao.EmployeeDao;
import com.durgasoft.dao.EmployeeDaoImpl;


public class EmployeeDaoFactory {
   private static EmployeeDao employeeDao;
   static {
       employeeDao = new EmployeeDaoImplHibernate();
   }


   public static EmployeeDao getEmployeeDao() {
       return employeeDao;
   }
}
