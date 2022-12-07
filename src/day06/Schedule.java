package day06;

public class Schedule {
	private int year;
	private int month;
	private int day;
	
	
	public void setYear(int _year) {
		year = _year;
	}
	
	public int getYear() {
		
		return year;
	}
	
	public void setMonth(int _month) {
		if(_month<1) _month =1;
		else if(_month>12) _month =12;
		
		month = _month;
	}
	
	public int getMonth() {
		
		return month;
	}
	
	public void setDay(int _day) {
		if(_day<1) _day =1;
		else if(_day>31) _day =31;
		else if(month==2&& _day>28) _day=28;
		day = _day;
	}	
	
	public int getDay() {
		
		return day;
	}
	
	void showDate() {
		System.out.println(year+"-"+month+"-"+day);
	}
	
	

}
