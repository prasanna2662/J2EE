package com.sathya.emplo;

import java.util.List;

public class EmployeeMain1 {
	public static void main(String[] args)
	{
		EmployeeDao dao=new EmployeeDao();
		//table Creation
		int createResult=dao.createEmployeetable();
		System.out.println("Table Creation status.."+createResult);
	}

}
 class EmployeeMain2{
	public static void main(String[] args)
	{
		EmployeeDao dao=new EmployeeDao();
		Employee employee1=new Employee();
		employee1.setEmpId("EM2459");
		employee1.setEmpName("prasanna");
		employee1.setEmpSalary(45000.0);
		int result=dao.saveEmployee(employee1);
		if(result==1)
		{
			System.out.println("Data inserted sucessfully.."+result);
			
		}
		else {
			System.out.println("Data insertion fail check once..."+result);
		}
	}

}
 class EmployeeMain3{
		public static void main(String[] args)
		{
			EmployeeDao dao=new EmployeeDao();
			Employee employee2=new Employee();
			employee2.setEmpId("EM2450");
			employee2.setEmpName("sandeep");
			employee2.setEmpSalary(55000.0);
			int result=dao.saveEmployee(employee2);
			if(result==1)
			{
				System.out.println("Data inserted sucessfully.."+result);
				
			}
			else {
				System.out.println("Data insertion fail check once..."+result);
			}
		}

	}
 class EmployeeMain4{
		public static void main(String[] args)
		{
			EmployeeDao dao=new EmployeeDao();
			Employee employee3=new Employee();
			employee3.setEmpId("EM2990");
			employee3.setEmpName("jyothi");
			employee3.setEmpSalary(59000.0);
			int result=dao.saveEmployee(employee3);
			if(result==1)
			{
				System.out.println("Data inserted sucessfully.."+result);
				
			}
			else {
				System.out.println("Data insertion fail check once..."+result);
			}
		}

	}
 class EmployeeMain5{
		public static void main(String[] args)
		{
			EmployeeDao dao=new EmployeeDao();
			Employee employee=dao.findById("EM2459");
			if(employee!=null)
			{
				System.out.println("Employee Available...");
				System.out.println(employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getEmpSalary());
			}
			else
			{
				System.out.println("Employee is not available");
			}
			
			
		}

	}
 class EmployeeMain6{
		public static void main(String[] args)
		{
			EmployeeDao dao=new EmployeeDao();
			List<Employee> employees = dao.findAll();
			employees.forEach(employee->System.out.println(employee));;
		}
 }
 class EmployeeMain7 
 {
		public static void main(String[] args)
		{ 
			EmployeeDao dao = new EmployeeDao();
			int count = dao.updateEmployee(45000, 1550);
			System.out.println("updated records count.."+count);
		}
}
 class EmployeeMain8
 {
		public static void main(String[] args)
		{ 
			EmployeeDao dao = new EmployeeDao();
			int count = dao.deleteEmployeeById("EM2459");
			System.out.println("updated records count.."+count);
		}
}
 class EmployeeMain9
 {
		public static void main(String[] args)
		{ 
			EmployeeDao dao = new EmployeeDao();
			int count = dao.deleteEmployeeBySalary(57000);
			System.out.println("updated records count.."+count);
		}
}
 class EmployeeMain10 {
		public static void main(String[] args) { 
			EmployeeDao dao = new EmployeeDao();
			int count = dao.droptable();
			System.out.println("Table is dropped status...."+count);
		}
	}




