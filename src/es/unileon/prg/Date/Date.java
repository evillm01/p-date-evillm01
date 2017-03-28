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

	
	public Date(){
		int day=_day;
		int month=_month;
		int year=_year;
	}

	
	public boolean isSameYear(Date year1){
		if(year1==_year){
			return true;
			System.out.println("Es el mismo año");
		}else{
			return false;
			System.out.println("No es el mismo año");
		}
	}
	public boolean isSameMonth(Date month1){
		if(month1==_month){
			return true;
			System.out.println("Es el mismo mes");
		}else{
			return false;
			System.out.println("No es el mismo mes");
		}
	}
	public boolean isSameDay(Date day1){
		if(day1==_day){
			return true;
			System.out.println("Es el mismo dia");
		}else{
			return false;
			System.out.println("No es el mismo dia");
		}
	}
	public boolean isSame(Date day1,Date month1,Date year1){
		
	}

	public void printMonth(int month){
		System.out.println("El mes es: "+month);
	}

	public boolean check(){
		if(day==0){
			return true;
			System.out.println("El dia del mes es correcto");
		}else{
			return false;
			System.out.println("El dia del mes es incorrecto");
		}
	}
	
	public void season(int month){
		switch(month){
		case 01: System.out.println("La estacion es Invierno");
			break;
		case 02: System.out.println("La estacion es Invierno");
			break;
		case 03: System.out.println("La estacion es Primavera");
			break;
		case 04: System.out.println("La estacion es Primavera");
			break;
		case 05: System.out.println("La estacion es Primavera");
			break;
		case 06: System.out.println("La estacion es Verano");
			break;	
		case 07: System.out.println("La estacion es Verano");
			break;
		case 08: System.out.println("La estacion es Verano");
			break;	
		case 09: System.out.println("La estacion es Otoño");
			break;
		case 10: System.out.println("La estacion es Otoño");
			break;
		case 11: System.out.println("La estacion es Otoño");
			break;
		case 12: System.out.println("La estacion es Invierno");
			break;
		}
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
