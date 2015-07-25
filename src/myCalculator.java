package com.blood.donation.dto;

public class myCalculator {
	
	private int power(int n, int p){
		double ans = 1;
		try{
			if(n<0 || p<0){
				throw new Exception("n and p should be non-negative");
			}else{
			    if (p != 0) {
			        int absExponent = p > 0 ? p : (-1) * p;
			        for (int i = 1; i <= absExponent; i++) {
			            ans *= n;
			        }

			        if (p < 0) {
			            ans = 1.0 / ans;
			        }
			    } else {
			        // exponent is 0
			        ans = 1;
			    }
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return (int) ans;
	}
	
	
	public static void main(String [] args){
		myCalculator my = new myCalculator();
		System.out.println(my.power(-3, -4));
	}

}
