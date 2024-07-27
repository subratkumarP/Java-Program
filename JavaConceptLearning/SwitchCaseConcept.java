package JavaConceptLearning;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String br ="Subrat";
		switch (br) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "Edge":
			System.out.println("Launch Edge");
			break;
		case "FireFox":
			System.out.println("Launch Chrome");
			break;
		default:
			System.out.println("Please pass correct browser");
			break;
		case "Safari":
			System.out.println("Launch Safari");
			break;
		}
	}

}
