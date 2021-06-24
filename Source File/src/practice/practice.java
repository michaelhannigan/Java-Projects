package practice;

import java.math.*;

public class practice implements practiceInterface{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	practice p = new practice();
	p.setNumber(1);
	System.out.print(p.getNumber());
	}

	public practice() {
		
	}
	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return number;
	}
	
	public void setNumber(int num) {

	}

}
