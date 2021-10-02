package javabasic;

public class ControlFlow {

	public static void main(String[] args) {
	
		boolean hungry=true;
		if(!(hungry=false)) {
			System.out.println("I am starving...");
		} else {
			System.out.println("I am not Hungry");
		}
		int hungryrating=5;
		if(hungryrating<=6) {
			System.out.println("I am not hungry");
		} else {
			System.out.println("I am starving");
		}	
		
		int favouritetemp=75;
		int currenttemp=20;
		String opinion;
		if (currenttemp==favouritetemp) {
		
		if (currenttemp<favouritetemp-30) {
			opinion="Its preety dam cold..";
		} else if (currenttemp<favouritetemp-20) {
			opinion="Its kind cold out...";
		}  else if (currenttemp>favouritetemp+10) {
			opinion="its hot out";
		} else {
			opinion="its beutiful day";
		}
		
		System.out.println(opinion);
		}
		else {
		opinion="null";
		}
		System.out.println(opinion);
		
		int month=4;
		
		String monthstring;
		
		switch (month) {
		
		case 1: monthstring="january";
		       break;
		case 2: monthstring="february";
		       break;
		case 3: monthstring="march";
		       break;
		case 4: monthstring="april";
		       break;
	    default: monthstring="unknownmonth";
		       break;
		} 
		System.out.println(monthstring);
	}  
	
	
}
		
         
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		