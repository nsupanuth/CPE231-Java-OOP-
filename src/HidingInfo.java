

public class HidingInfo {

	private Integer date;
	private Integer month;
	private Integer year;

	Day d = new Day();

	public Integer getDate() {
		return date;

	}

	public boolean setDate(Integer date) {
		if (date > 0 && date < 32) {
			this.date = date;
			return true;
		} else {
			this.date = 0;
			return false;
		}
	}

	public Integer getMonth() {
		if (month > 0 && month < 13)
			return month;
		else
			return 0;
	}

	public boolean setMonth(Integer month) {
		if (month > 0 && month < 13) {
			this.month = month;
			return true;
		} else {
			return false;
		}
	}

	public Integer getYear() {
		return year;
	}

	public boolean setYear(Integer year) {
		if(year>0){
			this.year = year;
			return true ;
		}else{
			return false;
		}
	}

	public boolean setAll(Integer date, Integer month, Integer year) {

		if (date > d.DayInMonthIs(month%12, year) || date < 1)
			return false;
		else {
			this.date = date;
			this.month = month;
			this.year = year;

			return true;
		}
	}

}
