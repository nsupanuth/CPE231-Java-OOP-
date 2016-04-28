public class Day{


	public Integer DayInMonthIs(int month, int year) {
		int dayInMonth;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 0) {
			dayInMonth = 31;
		} else if (month == 2) {

			if (year % 4 == 0) {
				if (year % 100 == 0 && year % 400 != 0) {
					dayInMonth = 28;
				} else {
					dayInMonth = 29;
				}
			} else {
				dayInMonth = 28;
			}

		} else {
			dayInMonth = 30;
		}

		return dayInMonth;

	}
	



}
