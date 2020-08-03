package controller;
 import dao.IEmployeeDao;
import daoImpl.EmployeeDaoImpl;
import model.Employee;

public class EmployeeController{
	 
	 IEmployeeDao empDao =new EmployeeDaoImpl();
	
	 public String Login(String username,String password) {
		 return empDao.checkLogin(username, password);
 }
 }
