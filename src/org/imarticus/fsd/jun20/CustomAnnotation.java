package org.imarticus.fsd.jun20;

@interface SomeName{
	String str1();
	String str2();
}

public class CustomAnnotation {
	
	@SomeName(str1="abc", str2="def")
	void m1() {
		
	}
	
	public static void main(String[] args) {	
		
	}
}
