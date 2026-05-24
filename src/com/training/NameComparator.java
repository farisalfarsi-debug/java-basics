package com.training;

import java.util.Comparator;

public class NameComparator implements Comparator<User>{  
	@Override
	public int compare(User o1, User O2) { 
		// TODO Auto-generated method stub
		return o1.getUserName().compareTo(O2.getUserName());
	}

}
