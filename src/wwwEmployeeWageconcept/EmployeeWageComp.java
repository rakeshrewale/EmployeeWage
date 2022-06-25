package wwwEmployeeWageconcept;

import java.util.Random;

public class EmployeeWageComp {
	
		static Random random = new Random();

		static int wagePerHour = 20;
		static int fullDayHours = 8;
		static int wagePerDay = 0;
		static int partTimeHours = 4;
		static int monthlySalary = 0;
		static int day = 0;
		static int monthlyHours = 0;
		static String companyName;
		
		 public EmployeeWageComp(String companyName, int wagePerHour ,int  numOfWorkingDays , int maxHoursPerMonth) {
			 
			    this.companyName = companyName;
				this.wagePerHour = wagePerHour;
				this.day = day;
				this.monthlyHours = monthlyHours;
			 
		 }
		 static void ComputeEmployeeWage() {
				{
					while (monthlyHours != 100 && day != 20) {
						day++;
			
			int attendance = random.nextInt(3);
			switch (attendance) {
			case 0:
				System.out.println("Employee is absent");
		 		break;
			case 1:
				System.out.println("Employee  is present");
		 		wagePerDay = fullDayHours * wagePerHour;
				monthlyHours=monthlyHours+fullDayHours;
				System.out.println("Employee's daily wage is:" + wagePerDay);
				break;
			case 2:
				System.out.println("Employee is present for part time");
				wagePerDay = partTimeHours * wagePerHour;
				monthlyHours=monthlyHours+partTimeHours;
				System.out.println("Employee's daily wage is:" + wagePerDay);
				break;

			}
			monthlySalary = monthlySalary + wagePerDay;
			System.out.println(" Day is: " +day +" monthlyHours: "+ monthlyHours +" Monthly Salary is: " + monthlySalary);
		}

	int totalEmpWage =monthlyHours * wagePerHour;
     System.out.println("Total Emp Wage for company: " + companyName+" is:" + totalEmpWage);

				}
		 }
	 public static void main(String args[])
	 {
		 System.out.println("Welcome to Employee Wage Computation Program");

		 EmployeeWageComp Hughes = new EmployeeWageComp("Hughes", 20, 20, 100);

			Hughes.ComputeEmployeeWage();
			
			EmployeeWageComp Aakar = new EmployeeWageComp("Aakar", 10, 10, 100);

			Aakar.ComputeEmployeeWage();
			

			EmployeeWageComp Aletheia = new EmployeeWageComp("Aletheia", 20, 30, 100);

			Aletheia.ComputeEmployeeWage();
			


	 }
		
		
}


