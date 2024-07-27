package JavaConceptLearning;

public class switchCaseExercsie {

	public static void main(String[] args) {
		
		String day ="Sunday";
		switch (day) {
		case "Monday":
			System.out.println("Weekdays");
			break;
		case "Tuesday":
			System.out.println("Weekdays");
			break;
		case "Wednesday":
			System.out.println("Weekdays");
			break;
		case "Thursday":
			System.out.println("Weekdays");
			break;
		case "Friday":
			System.out.println("Weekdays");
			break;
		case "Saturday":
			System.out.println("Weekend");
			break;
		case "Sunday":
			System.out.println("Weekend");
			break;

		default:
			System.out.println("Then you need to go to Office");
			break;
		}

	}

}
