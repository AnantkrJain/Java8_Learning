package org.imarticus.fsd.jun06;

interface Behaviour1{
	
}

interface Behaviour2{
	
}

interface Behaviour3{
	
}

abstract class Soul{
	
}

class Body extends Soul implements Behaviour1, Behaviour2, Behaviour3{
	
}

interface Rbi{
	void doKyc();
}

interface FinanceMinistry{
	
}

class Hdfc implements Rbi, FinanceMinistry{
	@Override
	public void doKyc() {
		System.out.println("Aadhar");
	}	
}

class Icici implements Rbi{

	@Override
	public void doKyc() {
		System.out.println("Passport");
		
	}
}

public class AbstractNeed {

}
