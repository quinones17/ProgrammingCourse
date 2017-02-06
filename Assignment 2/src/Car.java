
public class Car {

	String name = "myCar";
	
	
	int gear = 1;
	int location;
	int speed = 0;
	int DESTINATION = 250;
	void changeGear(int newGear) {
		gear = newGear;
	}
	void reverseGear() {
		gear = -1;	
	}
	void gearUp() {
		if (gear == 6)
			{System.out.println("The gear is at 6 and cannot be increased");}
		if (gear < 0)
		 {gear = 1;}
		gear = gear + 1;
		}
	
	void gearDown() {
			if (gear == 1);
			gear = gear -1;
			if (gear == 1)
				{System.out.println("The gear is at 1 and cannot be lowered");}
			if (gear < 0)
		 {System.out.println("The gear is in reverse");}
		 
		}  
	String reportGear(){
		switch (gear) {
		case 1:
			return "The car is in first gear";
		case 2:
			return "The car is in second gear";
		case 3:
			return "The car is in third gear";
		case 4:
			return "The car is in forth gear";
		case 5:
			return "The car is in fifth gear";
		case 6:
			return "The car is in sixth gear";
		default:
			return "Not in first through sixth gear!";
		}
	}
double reportLocation(){
	return location;
}
		
int reportRemaining(){
	int sum = DESTINATION - location;
	return sum;
}

void moveByTime(int delta){
		location += delta;
}

boolean isArrived(){
	if (location == 0){
		return true;
	}
	else {
		return false;
	}

	
}






	}