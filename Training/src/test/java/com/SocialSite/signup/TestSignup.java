package com.SocialSite.signup;

import com.SocialSite.Signup.Signup;

public class TestSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Signup sg = new Signup();
		String fn = sg.FirstName("John");
		
		String ln = sg.LastName("Smith");
		
		String dob = sg.DOB("20/05/2005");
		
		long mn = sg.mobileNo(1597532846);
		
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(dob);
		System.out.println(mn);
		 
	}

}
