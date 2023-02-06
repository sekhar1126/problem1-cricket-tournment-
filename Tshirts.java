package Dxctournmentpromo;

import java.util.Scanner;

public class Tshirts {

	public static void main(String[] args) {
		Scanner k=new Scanner (System.in);
	
		double  totalprice,price=0;
		String cart[]= {"round-neck","collared","hooded","round-neck","round-neck"};
		for(int i=0;i<cart.length;i++) {
			
			if(cart[i].equals("round-neck")) {
				 price=price+200;
			}else if(cart[i].equals("collared")) {
				price=price+250;
			}else if(cart[i].equals("hooded")) {
				price = price+300;
			}

		}
	int nooftshirts=cart.length;
	double discount=0;
	if(nooftshirts<5) {
		
		}else if (nooftshirts>=5&&nooftshirts<=10) {
			discount=10;
	}else if(nooftshirts>10) {
		discount=20;
	}
	
	totalprice= price-(price*(discount/100));
		
	System.out.println("Final price is Rs."+totalprice);
	}
	
}


