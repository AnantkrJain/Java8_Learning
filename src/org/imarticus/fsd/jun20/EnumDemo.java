package org.imarticus.fsd.jun20;

public class EnumDemo {
	public static void main(String[] args) {
		
		System.out.println("----All States----");
		for(State obj : State.values()) {
			System.out.println(obj);
		}
		
		System.out.println("State Code");
		State ts = State.TELANGANA;
		System.out.println(ts);
		System.out.println(ts.getStateCode());
		
		System.out.println("Langauge Based Selection----------------");
		
		String language = "Bihari";
		State theState;
		
		switch(language) {
		case "Telgu":
			theState = State.TELANGANA;
			break;
		case "Hindi":
			theState = State.DELHI;
			break;
		case "Awadhi":
			theState = State.UTTARPRADESH;
			break;
		default:
			theState = State.OTHER_STATE;
		}
		System.out.println(theState);
	}
}
