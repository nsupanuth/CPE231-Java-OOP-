

public class Check extends Day {
	
	final int rd = 1;
	final int rm = 1;
	final int ry = 1;
	
	private Integer checkDistance(int dd, int mm, int yy) {

		int distance = 0;
		int total = 0;
		if (mm == rm && yy == ry) {
			distance = dd - rd;
		} else if (yy >= ry) {
			int diffYear = yy - ry;
			int month = rm;
			int plusYear = ry;

			for (int i = rm; i < mm + (12 * diffYear); i++) {
				total += DayInMonthIs((i % 12), plusYear);
				if (i % 12 == 0) {
					plusYear++;
				}
			}

			distance = total + dd + 1;
		}

		return distance;
	}
	
	public String whatDay(int dd,int mm,int yy){
		
		String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		int modValue = checkDistance(dd, mm, yy) % 7;
		String result = days[modValue];
		return result;

	}


}
