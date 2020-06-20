package org.imarticus.fsd.jun20;

//Enum can have string, number and variables. Enum is used when values are fixed.

public enum State {
	
	UTTARPRADESH("UP"), DELHI("DL"), TELANGANA("TS"), OTHER_STATE("OS");

	public final String stateCode;
	
	State(String stateCode){
		this.stateCode = stateCode;
	}

	public String getStateCode() {
		return this.stateCode;
	}
}
