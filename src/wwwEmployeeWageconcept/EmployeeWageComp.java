package wwwEmployeeWageconcept;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to EmployeeWageComputation ");
		Random random = new Random();
		
		//int attendance = random.nextInt(2);
		int attendance = random.nextInt(3);
		
		int wagePerHour = 20;
		int fullDayHours = 8;
		int wagePerDay = 0;
		int partTimeHours=4;
		
		if (attendance == 1)
		{
				System.out.println("Employee is present");
	
				wagePerDay = fullDayHours * wagePerHour;
				System.out.println("Employee's daily wage is:" + wagePerDay);
		}
		else if(attendance ==2)
		{
			System.out.println("Employee is present for part time");
			
			wagePerDay = partTimeHours * wagePerHour;
			System.out.println("Employee's daily wage is:" + wagePerDay);
		}
		else
				System.out.println("Employee is absent");
	}
		
		
}


