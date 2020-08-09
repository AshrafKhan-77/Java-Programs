class Employee
{
	int id;
	float salary;
	String dept;

	void setId(int i)
	{ id = i; }

	void setSalary(float s)
	{ salary = s; }

	void setDept(String d)
	{ dept = d; }

	void EmpDetails()
	{ 
	  System.out.println("\nEmployee ID : "+id); 
	  System.out.println("Employee Dept. : "+dept);
	  System.out.println("Employee Salary : "+salary);
	}
}

class Employee_ClassAndObject
{
	public static void main(String [ ] args)
	{

	Employee Emp1 = new Employee();
	Emp1.setId(101);	Emp1.setDept("CS");	Emp1.setSalary(95000);
	Emp1.EmpDetails();

	Employee Emp2 = new Employee();
	Emp2.setId(102);	Emp2.setDept("Mechanical");	Emp2.setSalary(80000);
	Emp2.EmpDetails();

	Employee Emp3 = new Employee();
	Emp3.setId(103);	Emp3.setDept("Civil");	Emp3.setSalary(90000);
	Emp3.EmpDetails();
	
	Employee Emp4 = new Employee();
	Emp4.setId(104);	Emp4.setDept("Management");	Emp4.setSalary(75000);
	Emp4.EmpDetails();
	}
} 