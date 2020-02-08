package application;
//controller applicativo

public class Graphics {
	
	
	public float calculator(float number1,float number2,String operation) {
		switch(operation) {
		
		case("+"):
			return number1+number2;
		
		
		case("-"):
			return number1-number2;
		
		
		case("*"):
			return number1*number2;
		
		
		case("/"):
			if(number2==0) {
				
				return 0;}
			else {
			return number1+number2;}
		
		default:
			return 0;
		}
		
		
	}	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
