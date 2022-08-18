package corejava;

public class SwitchExample {

	public static void main(String[] args) {
		String day = "SUN";
		
		switch(day) {
			case "MON":
				System.out.println("It is Monday");
				break;
			case "TUE":
				System.out.println("It is Tuesday");
				break;
			case "WED":
				System.out.println("It is Wednesday");
				break;
			case "THU":
				System.out.println("It is Thursday");
				break;
			case "FRI":
				System.out.println("It is Friday");
				break;
			case "SAT":
				System.out.println("It is Saturday");
				break;
			case "SUN":
				System.out.println("It is Sunday");
				break;
			default:
				System.out.println("Invalid Day");
				
		}
	}

}
