package com.sathya.emplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public int createEmployeetable()
	{
		Connection connection=null;
		Statement statement=null;
		
		int result=0;
		try {
			connection=DataBaseConnectionUtils.createConnection();
			statement=connection.createStatement();
			result=statement.executeUpdate("create table employee_info(empId varchar2(30) primary key,empName varchar2(20),empSalary number)");
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	   return result;
	}
	public int saveEmployee(Employee s)
	{
		int result=0;
		try(Connection connection=DataBaseConnectionUtils.createConnection())
		{
			//create the ps object with params
			PreparedStatement preparedStatement=connection.prepareStatement("insert into employee_info values(?,?,?)");
			//set the data tp params
			preparedStatement.setString(1, s.getEmpId());
			preparedStatement.setString(2, s.getEmpName());
			preparedStatement.setDouble(3, s.getEmpSalary());
			//excuete the query
			result=preparedStatement.executeUpdate();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public Employee findById(String empId)
	{
		Employee s = null;
		try(Connection connection=DataBaseConnectionUtils.createConnection())
		{
			//create the ps object
			PreparedStatement preparedStatement=connection.prepareStatement("select * from employee_info where empId=?");
			//set the data to params
			preparedStatement.setString(1, empId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				//read the data from ResultSet&setting to Employee
				s=new Employee();
				s.setEmpId(resultSet.getString(1));
				s.setEmpName(resultSet.getString(2));
				s.setEmpSalary(resultSet.getDouble(3));
			}
			
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return s;
		
	}
	public List<Employee> findAll()
	{
		List<Employee> employees=new ArrayList<Employee>();
		Employee s = null;
		try(Connection connection=DataBaseConnectionUtils.createConnection())
		{
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employee_info");
			while (resultSet.next()) 
			{
				//read the data from resultset&setting into employee
				s = new Employee();
				s.setEmpId(resultSet.getString(1));
				s.setEmpName(resultSet.getString(2));
				s.setEmpSalary(resultSet.getDouble(3));
				//adding the employee into list
				employees.add(s);
				
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return employees;
	}
	
	public int updateEmployee(double salary,double incValue)
	{
		int result = 0;
		try(Connection connection = DataBaseConnectionUtils.createConnection())
		{	//create the PS object
			PreparedStatement preparedStatement = connection.prepareStatement("update employee_info set empSalary=empSalary+? where empSalary>?");
			//set the data to params 
			preparedStatement.setDouble(1, incValue);
			preparedStatement.setDouble(2, salary);
			//execute the query 
			result =  preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		return result;
	}
	
	public int deleteEmployeeById(String empId)
	{	int result = 0;
	try(Connection connection = DataBaseConnectionUtils.createConnection())
	{	//create the PS object
		PreparedStatement preparedStatement = connection.prepareStatement("delete from employee_info  where empId=?");
		//set the data to params 
		preparedStatement.setString(1, empId);
		
		//execute the query 
		result =  preparedStatement.executeUpdate();
	}
	catch(SQLException e)
	{	e.printStackTrace();
	}
	return result;
}
	public int deleteEmployeeBySalary(double empSalary)
	{	int result = 0;
	try(Connection connection = DataBaseConnectionUtils.createConnection())
	{	//create the PS object
		PreparedStatement preparedStatement = connection.prepareStatement
				("delete from employee_info where empsalary>=?");
		//set the data to params 
		preparedStatement.setDouble(1,57000);
		//execute the query 
		result =  preparedStatement.executeUpdate();
	}
	catch(SQLException e)
	{	e.printStackTrace();
	}
	return result;
	}
	public int droptable()
	{	int result=0;
		try(Connection connection=DataBaseConnectionUtils.createConnection())
		{
			//create the statement object
			Statement statement = connection.createStatement();
			//execute the query
			result = statement.executeUpdate("drop table employee_info");
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		return result;
	}
}
	




