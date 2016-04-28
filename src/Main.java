import java.util.Scanner;

public class Main extends HidingInfo {

	public static void main(String[] args) {

		Check check = new Check();
		HidingInfo var = new HidingInfo();
		
		while (true) {
			String date = "";

			System.out.print("Enter date(dd/mm/yy) : ");
			Scanner sc = new Scanner(System.in);
			date = sc.next();

			String[] parts = date.split("/");

			int dd = Integer.parseInt(parts[0]);
			int mm = Integer.parseInt(parts[1]);
			int yy = Integer.parseInt(parts[2]);
			
			if (var.setDate(dd) == true && var.setMonth(mm) == true && var.setYear(yy) == true) {
				if (var.setAll(dd, mm, yy) == true) {
					System.out.println(check.whatDay(var.getDate(), var.getMonth(), var.getYear()));
				} else {
					System.out.println("There's not " + var.getDate() + " on this month in " + var.getYear() + ".");
				}
			} else {
				System.out.println("Invalid date,month or year!");
			}
			System.out.println("");
		}
	}
	


}
