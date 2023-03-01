package services;

import frm_interface.EmployeeService;
import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
     public List<Employee> listEmploy;
    public  void display(){
        for(Employee employee: listEmploy){
            System.out.println(employee.toString());
        }
    }
    public  void addEmploy(Employee x){
        listEmploy.add(x);
    }
    public  void editEmployByCode(int code){
        for (Employee employee:listEmploy){
            if(employee.getEmployeeCode() == code){
                employee.inputEmploy();
                break;
            }
        }
    }

}
