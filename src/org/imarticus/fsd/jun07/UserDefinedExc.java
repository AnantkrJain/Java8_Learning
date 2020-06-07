package org.imarticus.fsd.jun07;

class InvalidVoterException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidVoterException(String s) {
		super(s);
	}
}

public class UserDefinedExc {

	void checkAge(int age) throws InvalidVoterException{
		if(age<18) {
			throw new InvalidVoterException("Not Eligible");
		}
		System.out.println("Vote for India");
	}
	
	public static void main(String args[]) {
		UserDefinedExc obj = new UserDefinedExc();
		try {
			obj.checkAge(15);
		}catch(InvalidVoterException ex){
			System.out.println(ex.getMessage());
		}
	}
}

