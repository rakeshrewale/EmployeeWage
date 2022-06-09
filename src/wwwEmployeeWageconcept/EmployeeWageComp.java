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
		
		 public static void calculateTotalWage(String companyName, int empPerHour ,int  numOfWorkingDays , int maxHoursPerMonth) {
			 
	
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

	int totalEmpWage =monthlyHours * empPerHour;
     System.out.println("Total Emp Wage for company: " + companyName+" is:" + totalEmpWage);
     return;
}
	 public static void main(String args[])
	 {
		 System.out.println("Welcome to Employee Wage Computation Program");

		 calculateTotalWage("Aakar",10,10,100);
		 calculateTotalWage("Mahindra",20,20,200);
		 calculateTotalWage("Aletheia",15,15,150);

	 }
		
		
}


