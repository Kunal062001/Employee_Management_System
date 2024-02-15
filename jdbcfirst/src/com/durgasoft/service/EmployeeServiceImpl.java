package com.durgasoft.service;


import com.durgasoft.beans.Employee;
import com.durgasoft.dao.EmployeeDao;
import com.durgasoft.factory.EmployeeDaoFactory;


import java.util.List;


public class EmployeeServiceImpl implements EmployeeService{
   /*EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();*/
EmployeeDao empDao = new EmployeeDaoImplSpringJdbc();
   @Override
   public String addEmployee(Employee employee) {
       String status = employeeDao.add(employee);
       return status;
   }


   @Override
   public Employee searchEmployee(int eno) {
       Employee employee = employeeDao.search(eno);
       return employee;
   }


   @Override
   public List<Employee> getAllEmployees() {
       List<Employee> employeeList = employeeDao.getAllEmployees();
       return employeeList;
   }


   @Override
   public String updateEmployee(Employee employee) {
       String status = employeeDao.update(employee);
       return status;
   }


   @Override
   public String deleteEmployee(int eno) {
       String status = employeeDao.delete(eno);
       return status;
   }
}
