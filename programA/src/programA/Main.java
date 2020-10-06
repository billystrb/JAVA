package programA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Προγραμμα για τον ελεγχο 
		//εγκυροτητας μιας  ημερομηνιας 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please insert  a date in type xx/yy/zzzz");
		String Line = in.nextLine();
		
		
		String day =Line.substring(0, 2);
		System.out.println(day);	
		int dayValue=Integer.parseInt(day) ;
		
		String month =Line.substring(3, 5);
		System.out.println(month);
		int monthValue=Integer.parseInt(month) ;
		
		String year =Line.substring(6, 10);
		System.out.println(year);
		int yearValue=Integer.parseInt(year) ;
		
		//θετω οριο ημερομηνιων που με ενδιαφερουν
		//απο το  1500 μεχρι και το 2500
		
		switch(monthValue) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(dayValue>=1 && dayValue<=31) {
					if(yearValue>=1500 && yearValue<=2500)
						System.out.println("This is a  valid  date: "+Line);
					else
						System.out.println("Error found on the year "+yearValue);
				}
				else
					System.out.println("Error found on the day "+dayValue);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(dayValue>=1 && dayValue<=30) {
					if(yearValue>=1500 && yearValue<=2500)
						System.out.println("This is a  valid  date: "+Line);
					else
						System.out.println("Error found on the year "+yearValue);
				}
				else
					System.out.println("Error found on the day "+dayValue);
				break;
			case 2:
				if(yearValue%4==0) {
					if(yearValue%100!=0 || yearValue%400==0) {
						if(dayValue>=1 && dayValue<=29) {
							if(yearValue>=1500 && yearValue<=2500)
								System.out.println("This is a  valid  date: "+Line);
							else
								System.out.println("Error found on the year "+yearValue);
						}
						else
							System.out.println("Error found on the day "+dayValue);	
					}		
				}
				else
					if(dayValue>=1 && dayValue<=38) {
						if(yearValue>=1500 && yearValue<=2500)
							System.out.println("This is a  valid  date: "+Line);
						else
							System.out.println("Error found on the year "+yearValue);
					}
					else
						System.out.println("Error found on the day "+dayValue);
		
			default :
				System.out.println("Error found in month "+month);
		
		}
		
		
		
		
		
		
		
		
		
	}

}
