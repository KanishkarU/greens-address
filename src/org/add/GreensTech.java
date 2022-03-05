package org.add;
//mathod overloding based on datatype order,count and types
public class GreensTech {
	private void greensOmr(String name,int doorNum) {
		System.out.println("Conpany name  is"+name+"\n"+"GreensOmr pincode is "+doorNum);
		// TODO Auto-generated method stub

	}
	private void greensOmr(int pinCode,String streetName) {
		System.out.println("comapny pincode is "+pinCode+"\n"+"company street name os "+streetName);

	}
	private void greensOmr(long phoneNum,String eMail,boolean openOrClosed) {
		System.out.println("commpany phone number is "+phoneNum+"\n+"+"Company email id is "+eMail+"\n"+"comapany is open or closed "+openOrClosed);
		

	}
	private void grreensOmr(String ownerName ) {
		System.out.println("company owner is"+ownerName);

	}
	public static void main(String[] args) {
		GreensTech a = new GreensTech();
		a.greensOmr("GreensTech", 12);
		a.greensOmr(600096, "perungudi");
		a.greensOmr(6383194289l, "greenstech@gmail.com", true);
		a.grreensOmr("velmurugan");
	}

}
