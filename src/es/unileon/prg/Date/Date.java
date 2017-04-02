package es.unileon.prg.Date;
/**
 * Clase Date
 * 
 * @author Eduardo
 * @version 1.0
 */
public class Date{
	
	private int _day;
	private int _month;
	private int _year;

	
	public Date(int day,int month,int year){
		_day=day;
		_month=month;
		_year=year;
	}

	
	public boolean isSameYear(Date anotherDate){
		if(anotherDate.getYear()==_year){
			return true;
			
		}
			return false;
			
	}
	public boolean isSameMonth(Date anotherDate){
		if(anotherDate.getMonth()==_month){
			return true;
			
		}
			return false;
			
	}
	public boolean isSameDay(Date anotherDate){
		if(anotherDate.getDay()==_day){
			return true;
			
		}
			return false;
			
	}
	public boolean isSame(Date anotherDate){
		if(isSameYear(anotherDate) && isSameMonth(anotherDate) && isSameDay(anotherDate)){
			return true;
		}
		return false;
	}

	public void printMonth(int mes){
		month=mes;
		return month;
	}

	public void printDate(int day,int month,int year){
		System.out.println("La fecha es: "+day+"."+month+"."+year);
	}

	public boolean check(){
		if(day==0){
			return true;
			
		}
			return false;
			
	}
	
	public void season(int month){
		
	String p = "Primavera";
	String v = "Verano";
	String o = "Otoño";
	String i = "Invierno";
	
		if(month==12||month==1||month==2){
			return i;
		}else if(month==3||month==4||month==5){
			return p;
		}else if(month==6||month==7||month==8){
			return v;
		}else{
			return o;
	}

 

	public int getDay(){
		return _day;
	}
	public int getMonth(){
		return _month;
	}
	public int getYear(){
		return _year;
	}
}
