package snakeladderproblem;

public class uc1snakeladderproblem {
	public static void main(String[] args){
		//Constants
		int IS_ZERO=0;
		int IS_ONE=1;
		int IS_TWO=2;
		int IS_THREE=3;
		int IS_FOUR=4;
		int IS_FIVE=5; 
		//Computation
		double dieresult = Math.floor(Math.random()*100)%6;
		if (dieresult == IS_ZERO )
			 System.out.println("Die result is 1");
		if (dieresult == IS_ONE )
			 System.out.println("Die result is 2");
		if (dieresult == IS_TWO )
			 System.out.println("Die result is 3");
		if (dieresult == IS_THREE )
			 System.out.println("Die result is 4");
		if (dieresult == IS_FOUR )
			 System.out.println("Die result is 5");
		if (dieresult == IS_FIVE )
			 System.out.println("Die result is 6");
		
		
		

	
	}
}


