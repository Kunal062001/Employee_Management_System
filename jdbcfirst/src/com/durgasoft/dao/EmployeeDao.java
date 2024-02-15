package com.durgasoft.dao;


import com.durgasoft.beans.Employee;


import java.util.List;


public interface EmployeeDao {
   public String add(Employee employee);
   public Employee search(int eno);
   public List<Employee> getAllEmployees();
   public String update(Employee employee);
   public String delete(int eno);
}
